# Define a list of sales amounts
sales = [200, 600, 150, 800, 300]

# Write a function to generate the sales report
def generate_report(sales):
    total_sales = 0
    print("Sales Report for the Previous Month:\n")
    for sale in sales:
        if sale > 500:
            print(f"Sale Amount: ${sale} - **Highlighted**")
        else:
            print(f"Sale Amount: ${sale}")
        total_sales += sale
    return total_sales

# Generate a report for the example sales list
total_sales = generate_report(sales)

# Print the total sales for the month
print("\nTotal Sales for the Month: $", total_sales)
