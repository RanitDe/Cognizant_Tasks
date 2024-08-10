from text_processing_tool import count_words, find_unique_words, convert_to_uppercase

def main():
    text = input("Enter a text string: ")

    # Process the text
    word_count = count_words(text)
    unique_words = find_unique_words(text)
    uppercase_text = convert_to_uppercase(text)

    # Print the results
    print(f"\nWord Count: {word_count}")
    print(f"Unique Words: {unique_words}")
    print(f"Uppercase Text: {uppercase_text}")

if __name__ == "__main__":
    main()
