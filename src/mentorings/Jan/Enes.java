package mentorings.Jan;

public class Enes extends Januzak{

    public static void main(String[] args) {

        Januzak father = new Januzak();
        Enes son = new Enes();
        father.lastName("Jumabek");
        father.printMyAge(26);
        son.printMyAge(2);







    }

    @Override
    public void printMyAge(int age){
        System.out.println("My age is "+age);
    }

}
