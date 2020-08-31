package homeWorks.Loops;

public class EvenNumbers {
    public static void main(String[] args) {
        for (int num = 1;num <= 20; num++ )
        {
            if ( num % 2 == 0)
            {
                System.out.println(num+" <" );
            }else{
                System.out.println(num );
            }
        }
    }
}
