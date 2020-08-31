package sessions.classes_objects.nestedClasses;

public class Main {
    public static void main(String[] args) {
        Apartment apartment = new Apartment();
        Apartment.Room room = apartment.new Room();

        Building.Builder builder = new Building.Builder(2);
    }
}
