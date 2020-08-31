package myExamples.objects.custom_classes;

public class BmW {

        String make ;
        String model ;
        double price;

    public void showPrice(){
       switch(model){
           case "330i":
              price = 40250;
              break;
           case "740i":
               price = 86450;
               break;
           case "m3":
               price = 66500;
               break;
               default:
                   System.out.println(model+" is not available");
                   price=  0.00;
       }
        System.out.println("Price: "+price);
    }

        }



