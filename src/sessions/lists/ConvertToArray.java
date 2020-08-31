package sessions.lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertToArray {
    public static void main(String[] args) {

        List<String> birds = new ArrayList<>();
        birds.add("Hawk");
        birds.add("Eagle");
        birds.add("Parrot");

        System.out.println(birds);

        Object[] birdsArrObj = birds.toArray();
        System.out.println(Arrays.toString(birdsArrObj));

        String [] arr = new String[0];
        String[] birdsArrString = birds.toArray(arr);

        System.out.println(Arrays.toString(birdsArrString));

        List<Integer> nums = new ArrayList<>();
        nums.add(123);
        nums.add(444);
        nums.add(999);
        System.out.println(nums);

        Integer[] numsArr = nums.toArray(new Integer[0]);
        System.out.println(Arrays.toString(numsArr));

        Object[] numArrObj = nums.toArray();
        System.out.println(Arrays.toString(numArrObj));

        //if you using some external library.
        //calculate(STring[] arr)

        Integer[] years = {1991, 1992, 1993, 1994, 1995};
        System.out.println(Arrays.toString(years));

        //Arrays to String.
        //As a list method can only take Object Arrays. meaning no primitives

        List<Integer> yearList = Arrays.asList(years);
        //asList method creates a fixed size list.
        System.out.println(yearList);
        //yearList.add(1996); //In throws UnsupportedOperation exception. bc the list was created using asList method from Array class
        System.out.println(yearList);

        yearList.set(2, 1999);
        System.out.println(yearList);
        System.out.println(Arrays.toString(years)); //we have to be careful of converting array to list using asList,
        //bc modifications to either one of it will affect the other

        //yearList.remove(0);
        System.out.println(yearList);

        List<Integer> yearsFinalList = new ArrayList<>(yearList);
        System.out.println(yearsFinalList);
        yearsFinalList.add(1996);
        System.out.println(yearsFinalList);
        System.out.println(Arrays.toString(years));
        System.out.println(yearList);




    }
}
