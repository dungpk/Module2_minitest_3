public abstract class Employee implements Comparable<Employee> {
    private String id;
    private String name;
    private int age;
    private String phone;
    private String email;
    private String address;

    public Employee() {
    }

    public Employee(String id, String name, int age, String phone, String email, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getIdd() {
        return id;
    }

    public void setIdd(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract double getMonthlySalary();

    public abstract double sortedSalary();


    @Override
    public int compareTo(Employee o) {
        if (this.sortedSalary() < o.sortedSalary()) {
            return -1;
        } else if (this.sortedSalary() > o.sortedSalary()) {
            return 1;
        } else
            return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name :'" + name + '\'' +
                "phone : "+ phone+ '\'' +
                "mail : " + email+ '\'' +
                "address : " +address+ '\'' +
                "age : " +address+ '\'' +
                '}'+'\n';
    }

}