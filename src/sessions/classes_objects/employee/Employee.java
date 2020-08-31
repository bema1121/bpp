package sessions.classes_objects.employee;

public class Employee {

    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(int id, String name) {
        this.name = name;
        this.id = id;


    }

    public void celebrate() {
        System.out.println(id + " Yaaay");
    }


}
