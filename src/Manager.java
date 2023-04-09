
import java.util.ArrayList;

public class Manager {
    public ArrayList<Employee> listEmployee = new ArrayList<>();

    public Manager() {
    }
    public void init() {
        addEmployee(new EmployeeFullTime("1","Phung Khac Dung", 22, "12343546", "truongconnamdinh.com.vn", "Hai Phong", 253654, 0, 6346536));
        addEmployee(new EmployeeFullTime("2","Tran Van Anh", 252, "45678", "khanhsky.com.vn", "Da Nang", 243642, 874444, 6546546));
        addEmployee(new EmployeePartTime("3","Do Trong Hai",251,"0102040506","tienbip.com.vn","Nam Dinh", 67));
        addEmployee(new EmployeePartTime("4","Tran Trung Hieu",77,"0987654321","dungtroc.com.vn","Hai Duong", 50));
        addEmployee(new EmployeeFullTime("5","nguyen Kieu Chinh", 23, "0123456789", "haibann.com.vn", "Bac Ninh", 2000000, 72777, 265745));
        addEmployee(new EmployeePartTime("6","Vu Nguyen Mai Huong",222,"356789","thatmanh.com.vn","Bac Giang", 336));
        addEmployee(new EmployeeFullTime("7","Tran Nhat Duat", 11, "26374", "ngobakha.com.vn", "Bac Kan", 5955332, 100000, 3333333));
        addEmployee(new EmployeePartTime("8","Nguyen Van Ro Di",56,"2563745","aaaaaaaaaa.com.vn","Dac Lak", 355));
        addEmployee(new EmployeeFullTime("9","Dang Dinh Si Thue", 111, "5637458", "duongminhtuyen.com.vn", "Nghe An", 2672453, 26374, 123456));
        addEmployee(new EmployeePartTime("10","Benzema",553,"253647","123456789.com.vn","Thanh Hoa", 80));
        addEmployee(new EmployeeFullTime("11","Cutinho", 151, "237458", "huanhoahong.com.vn", "Nam Dinh", 2536, 2534675, 678954));
        addEmployee(new EmployeePartTime("12","Rong Xanh Mat le",466,"0987654321","pyosik   .com.vn","TP Ho Chi Minh", 333));
    }
    public void addEmployee(Employee e) {
        listEmployee.add(e);
    }
    public double getAverageSalary(){
        double total = 0;
        for (Employee employee: listEmployee) {
            total += employee.getMonthlySalary();
        }
        return total/listEmployee.size();
    }
    public ArrayList<Employee> getListLowSalary() {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee employee: listEmployee) {
            if (employee.getMonthlySalary() < getAverageSalary()) {
                result.add(employee);
            }
        }
        return result;
    }
    public double partTimeSalary() {
        double parttimeSalary = 0;
        for (Employee employee: listEmployee) {
            parttimeSalary += employee.getMonthlySalary();
        }
        return parttimeSalary;
    }
    public ArrayList<Employee> getFullTime() {
        ArrayList<Employee> fullTime = new ArrayList<>();
        for (Employee e: listEmployee) {
            if (e instanceof EmployeeFullTime) {
                fullTime.add(e);
            }
        }
        return fullTime;
    }
}