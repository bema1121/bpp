package homeWorks.JavaMethods;

public class CheckPassFail {

    public static void main(String[] args) {
        int mark = 100;
        System.out.println("The mark is " + mark);
        CheckPassFail.passedOrFailed(mark);

    }

        public static void passedOrFailed (int mark1){

      if(mark1 > 90){
          System.out.println("Passed");
    } else {
        System.out.println("Failed");
    }
      System.out.println("Congratulations!");
}
}

