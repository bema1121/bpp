package sessions.classes_objects.nestedClasses;

public class Apartment {
    String num;
    public class Room{
        String roomSize;
    }
}

class Building{

    int levels;
    int area;

    public static class Builder{
        public Builder(int area){
            System.out.println(area);
        }

    }
}
class Main2{
    public static void main(String[]args){
        Apartment apartment = new Apartment();
        Apartment.Room room = apartment.new Room();

        Building.Builder builder = new Building.Builder(2);
    }
}