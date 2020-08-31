package myExamples.objects.custom_classes;

public class Microwave {

     String brand;
     boolean isOn; //false. true => means on, false => off

    public void turnOn(){
        //System.out.println("Turning on the microwave");
        if(isOn == true){
            System.out.println(brand+" microwave is already on");
        }else{
            System.out.println("Turning on "+brand+" microwave");
            isOn = true;
        }
    }public void turnOff(){
        //System.out.println("Turning Off the microwave");
        if(isOn == false){
            System.out.println(brand+" microwave is already OFF");
        }else{
            System.out.println("Turning Off "+brand+" microwave");
            isOn = false;
        }
    }public void heat(String food){
        if(isOn){
            System.out.println("Heating " +food);
        }else{
            System.out.println("Microwave is OF, cannot heat "+food);

        }
    }
}
