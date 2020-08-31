package sessions.arrays;

public class ArrayObjectReference {
    public static void main(String[] args) {


        StringBuilder[] arr = new StringBuilder[3];

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Welcome");

        arr[0] = sb1;
        arr[1] = sb2;
        arr[2] = sb1; //StringBuilder arr2 = sb1;

        //      for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        arr[0].append(" World");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();

        StringBuilder stringBuilder = new StringBuilder("Allo");
        StringBuilder stringBuilder2 = stringBuilder;

        System.out.println(stringBuilder);
        System.out.println(stringBuilder2);

        stringBuilder.append(" Malle");
        System.out.println(stringBuilder);
        ;
        System.out.println(stringBuilder2);


    }
}