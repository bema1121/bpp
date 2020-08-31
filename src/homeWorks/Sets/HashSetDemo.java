package homeWorks.Sets;
import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {

            HashSet<String> hs = new HashSet<String>();

            // Adding element to HashSet

            hs.add("M");

            hs.add("B");

            hs.add("C");

            hs.add("A");

            hs.add("M");

            hs.add("X");

            System.out.println("Size of HashSet=" + hs.size());

            System.out.println("Original HashSet:" +hs.toString());

            System.out.println("Removing A from HashSet: "+ hs.remove("A"));

            System.out.println("Remove Z which is not present:" + hs.remove("Z"));

            System.out.println("Checking if M is present=" + hs.contains("M"));

            System.out.println("Updated HashSet: " + hs);

        }

    }

