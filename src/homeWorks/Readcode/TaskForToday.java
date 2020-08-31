package homeWorks.Readcode;

public class TaskForToday {
    public static void main(String[] args) {
        int a[]= {1,2,5,6,3,2};
        int b[]= {44,66,99,77,33,22,55};

        System.out.println("Result 1: "+solveMe(a,6));
        System.out.println("Result 2 :"+solveMe(b,7));
    }
    public static int solveMe(int[]a, int total){
        int temp;
        for(int i = 0; i < total; i++){
            for(int j = i+1; j < total; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j]= temp;
                }
            }
        }
        return a[total-3];
    }
}
