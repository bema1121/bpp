package sessions.arrays;

public class ReadCodeArray1 {

    public static void main(String[] args) {

        int[] arr = new int[]{173, 29, 391,41};
        int[]arr2 = new int[]{1703,329,3961,6641};

        int res = method(arr);
        System.out.println(res);

        res = method(arr2);
        System.out.println(res);
    }

    static int method(int a []){
        int temp = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] >= a[temp])
                temp = i;
        }
        return (a[temp]);
    }
}
