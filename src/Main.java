import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Manager managerEmployee =  new Manager();
        managerEmployee.init();
        System.out.println(managerEmployee.listEmployee);
        System.out.println(managerEmployee.getAverageSalary());
        System.out.println(managerEmployee.getListLowSalary());
        System.out.println(managerEmployee.getAverageSalary());
        Collections.sort(managerEmployee.listEmployee);
        System.out.println(managerEmployee.getFullTime());
    }

}