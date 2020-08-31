package mentorings.Dan;

public class Tablemulti {
    public static void main(String[] args) {

            // Write a program to calculate the sum of first 10 incl positive number.
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d + %d = %d%n", sum, i, sum += i);
            }
        }

    }

