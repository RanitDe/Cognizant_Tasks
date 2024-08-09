# Define variables for hours worked and hourly rate
hours_worked = 40
hourly_rate = 15

# Write a function to calculate total pay
def calculate_pay(hours, rate):
    return hours * rate

# Calculate the pay for the example employee
total_pay = calculate_pay(hours_worked, hourly_rate)

# Print the total pay
print(f"The total pay for the employee is: ${total_pay}")
