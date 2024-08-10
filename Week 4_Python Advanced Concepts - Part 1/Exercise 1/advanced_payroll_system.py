# Define the Employee class
class Employee:
    def __init__(self, name, hours_worked, hourly_rate):
        self.name = name
        self.hours_worked = hours_worked
        self.hourly_rate = hourly_rate

    # Implement the calculate_pay() method
    def calculate_pay(self):
        if self.hours_worked > 40:
            overtime_hours = self.hours_worked - 40
            overtime_pay = overtime_hours * (1.5 * self.hourly_rate)
            regular_pay = 40 * self.hourly_rate
            total_pay = regular_pay + overtime_pay
        else:
            total_pay = self.hours_worked * self.hourly_rate
        return total_pay

# Create the Manager subclass
class Manager(Employee):
    def __init__(self, name, hours_worked, hourly_rate, bonus):
        super().__init__(name, hours_worked, hourly_rate)
        self.bonus = bonus

    # Override the calculate_pay() method
    def calculate_pay(self):
        base_pay = super().calculate_pay()  # Calculate base pay including overtime
        total_pay = base_pay + self.bonus   # Add the bonus for the manager
        return total_pay

# Instantiate objects and calculate pay
employee = Employee("Aryan Kadam", 45, 20)  # 45 hours worked at $20/hour
manager = Manager("Rahul Sharma", 50, 30, 500)  # 50 hours worked at $30/hour with a $500 bonus

employee_pay = employee.calculate_pay()
manager_pay = manager.calculate_pay()

# Print the total pay for both
print(f"Total pay for {employee.name}: ${employee_pay:.2f}")
print(f"Total pay for {manager.name}: ${manager_pay:.2f}")
