package myExamples.arrayListProject;

import java.util.Arrays;
import java.util.List;

public class MoveToTheEnd {

    public static void main(String[] args) {
            List<Integer> array = Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2);
            int toMove = 2;
            MoveToTheEnd moveToTheEnd = new MoveToTheEnd();
            List<Integer> result = moveToTheEnd.moveElementToEnd(array, toMove);
            System.out.println(result);
        }

        public List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
            int i = 0;

            for(int j = array.size() - 1; i < j; ++i) {
                while(i < j && (Integer)array.get(j) == toMove) {
                    --j;
                }

                if ((Integer)array.get(i) == toMove) {
                    int temp = (Integer)array.get(j);
                    array.set(j, array.get(i));
                    array.set(i, temp);
                }
            }

            return array;
        }
    }


