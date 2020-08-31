package sessions.maps;

public class NestedClass {

    //We can have nested classes
    //classes declared inside(in scope of a bigger class)
    //nested classes could be both static and non static
    static class InnerClass {
        public static String getKey(){
            return "Key";
        }
    }
}
