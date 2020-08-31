package myExamples.custom_classes_encapsulation;

public class Shoes {

    String brand;
    double size;

    public void setShoesData(String newBrand, double nSize){
        brand = newBrand;
        size = nSize;

    }
    //reads only
    public String getShoesData(){
        return brand + " | " +size;

    }
}
