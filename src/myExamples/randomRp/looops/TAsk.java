package myExamples.randomRp.looops;

public class TAsk {
    public static void main(String[] args) {
        String str = "apple";
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter += j;

                }

            }
            System.out.println(counter);
        }
    }
}