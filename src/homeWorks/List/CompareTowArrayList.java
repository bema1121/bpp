package homeWorks.List;

import java.util.ArrayList;
import java.util.List;

public class CompareTowArrayList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");

        List<String> colors2 = new ArrayList<>();
        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Black");
        colors2.add("Pink");
        colors2.add("Pink");

      for(int i = 0; i < colors.size(); i++){
             if(colors.get(i).equals(colors2.get(i))){
                 System.out.print(" yes, ");
              }else{
                  System.out.print(" No, ");
              }
          }

       }
    }

