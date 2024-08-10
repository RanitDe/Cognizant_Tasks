import logging
from datetime import datetime

# Setup logging
logging.basicConfig(filename='error_log.txt', level=logging.ERROR)

def log_error(error):
    timestamp = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    logging.error(f"{timestamp} - {error}")

def process_transaction(transaction):
    try:
        amount = transaction["amount"]
        if amount <= 0:
            raise ValueError("Transaction amount must be greater than zero.")
        result = 100 / amount
        print(f"Transaction processed successfully: {result}")
    except ValueError as ve:
        print(f"Error: {ve}")
        log_error(ve)
    except ZeroDivisionError:
        print("Error: Division by zero encountered during transaction processing.")
        log_error("Division by zero error.")
    except KeyError as ke:
        print(f"Error: Missing key in transaction data - {ke}")
        log_error(ke)
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
        log_error(e)
    else:
        print("Transaction completed without errors.")
    finally:
        print("Transaction processing finished.")

def validate_transaction_data(transaction):
    if "amount" not in transaction:
        raise KeyError("Missing 'amount' in transaction data.")
    if not isinstance(transaction["amount"], (int, float)):
        raise ValueError("Transaction amount must be a number.")
    if transaction["amount"] <= 0:
        raise ValueError("Transaction amount must be greater than zero.")

def get_valid_transaction():
    while True:
        try:
            amount = float(input("Enter transaction amount: "))
            if amount <= 0:
                raise ValueError("Amount must be greater than zero.")
            return {"amount": amount}
        except ValueError as ve:
            print(f"Invalid input: {ve}. Please try again.")

def main():
    while True:
        transaction = get_valid_transaction()
        validate_transaction_data(transaction)
        process_transaction(transaction)

        continue_processing = input("Process another transaction? (y/n): ")
        if continue_processing.lower() != 'y':
            print("Exiting transaction processing.")
            break

if __name__ == "__main__":
    main()
