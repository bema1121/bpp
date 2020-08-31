package myExamples.task_from_Jira;


import java.util.Scanner;

public class SortStringOnLength {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of an Array");
        int size = scan.nextInt();
        String[] colors = new String[size];
        String str;
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter " + i + " element");
            str = scan.next();
            colors[i] = str;
        }
        arraySorted(colors);
        printArray(colors);

    }public static void arraySorted(String[] array) {

        for (int i = 0; i < array.length; i++) {
            String temp = array[i];
            int j = i - 1;
            while (j >= 0 && temp.length() < array[j].length()) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

}
