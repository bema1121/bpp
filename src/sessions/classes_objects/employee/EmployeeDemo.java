package sessions.classes_objects.employee;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee(10, "John Doe");
        System.out.println(employee);

        SDET elonMusk = new SDET(2, "Elon Musk", "Java");
        System.out.println(elonMusk);

        //Overriding
        employee.celebrate();
        elonMusk.celebrate();


    }
}
