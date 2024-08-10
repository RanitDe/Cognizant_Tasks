import pickle

# Function to add a contact to the text file
def add_contact(name, phone):
    with open('contacts.txt', 'a') as file:
        file.write(f"{name},{phone}\n")

# Function to read and display all contacts from the text file
def display_contacts():
    try:
        with open('contacts.txt', 'r') as file:
            contacts = file.readlines()
            if not contacts:
                print("No contacts found.")
            for contact in contacts:
                name, phone = contact.strip().split(',')
                print(f"Name: {name}, Phone: {phone}")
    except FileNotFoundError:
        print("Contacts file not found.")

# Function to remove a contact from the text file
def remove_contact(name):
    try:
        with open('contacts.txt', 'r') as file:
            contacts = file.readlines()
        with open('contacts.txt', 'w') as file:
            found = False
            for contact in contacts:
                contact_name, _ = contact.strip().split(',')
                if contact_name != name:
                    file.write(contact)
                else:
                    found = True
            if not found:
                print(f"Contact {name} not found.")
            else:
                print(f"Contact {name} removed.")
    except FileNotFoundError:
        print("Contacts file not found.")

# Function to save contacts to a binary file
def save_contacts_binary(contacts):
    with open('contacts.dat', 'wb') as file:
        pickle.dump(contacts, file)

# Function to load contacts from a binary file
def load_contacts_binary():
    try:
        with open('contacts.dat', 'rb') as file:
            contacts = pickle.load(file)
        return contacts
    except FileNotFoundError:
        print("Binary contacts file not found.")
        return {}
    except EOFError:
        print("Binary contacts file is empty.")
        return {}

def main():
    contacts = load_contacts_binary()

    while True:
        print("\nContact Management System")
        print("1. Add Contact")
        print("2. Remove Contact")
        print("3. Display Contacts")
        print("4. Save & Exit")
        choice = input("Enter your choice: ")

        if choice == '1':
            name = input("Enter name: ")
            phone = input("Enter phone number: ")
            contacts[name] = phone
            add_contact(name, phone)
        elif choice == '2':
            name = input("Enter name to remove: ")
            if name in contacts:
                del contacts[name]
                remove_contact(name)
            else:
                print(f"Contact {name} not found.")
        elif choice == '3':
            print("Contacts in text file:")
            display_contacts()
            print("\nContacts in binary file:")
            for name, phone in contacts.items():
                print(f"Name: {name}, Phone: {phone}")
        elif choice == '4':
            save_contacts_binary(contacts)
            print("Contacts saved to binary file.")
            break
        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    main()
