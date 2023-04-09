public class EmployeeFullTime extends Employee{
    private double reward;
    private double punishment;
    private double salary;

    public EmployeeFullTime(String id, String name, int age, String phone, String email, String address, double reward, double punishment, double salary) {
        super(id, name, age, phone, email, address);
        this.reward = reward;
        this.punishment = punishment;
        this.salary = salary;
    }

    @Override
    public double getMonthlySalary() {
        return salary + (reward - punishment);
    }

    @Override
    public double sortedSalary() {
        return getMonthlySalary();
    }

    @Override
    public String toString() {
        return super.toString() + " " + getMonthlySalary();
    }
}