package homeWorks.List;

import java.util.ArrayList;

public class ReplaceList {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Green");
        System.out.println("Original array list: " + color);
        String new_color = "White";
        color.set(1,new_color);
        int num = color.size();
        System.out.println("Replace second element with White ");
        int i = 0;

        while(i < num){
            System.out.println(color.get(i));
            i++;
        }

    }
}
