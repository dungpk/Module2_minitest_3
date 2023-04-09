public class EmployeePartTime extends Employee{
    private int hours;

    public EmployeePartTime(String id, String name, int age, String phone, String email, String address, int hours) {
        super(id, name, age, phone, email, address);
        this.hours = hours;
    }

    @Override
    public double getMonthlySalary() {
        return hours * 100000.0;
    }

    @Override
    public double sortedSalary() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getMonthlySalary();
    }
}