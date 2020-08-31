package mentorings.Dan;

interface driverthecar {
    String name = "Audi";
    void steer();
    void brake();
}
interface secondone {
    void secondMethod();
}


class InterfaceDan implements driverthecar,secondone{

    public static void main(String[]args){
        System.out.println(name);
        InterfaceDan example = new InterfaceDan();
        example.steer();
        example.brake();
        example.secondMethod();
    }
    @Override
    public void steer() {
        System.out.println("It steering the wheel");
    }
    @Override
    public void brake() {
        System.out.println("Push the brake");
    }
    @Override
    public void secondMethod() {
        System.out.println("It is the second method");
    }
}


