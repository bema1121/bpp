package mentorings.Nazar;

import java.io.*;
import java.util.*;

public class InputOutputStream {
    public static void main(String[] args) throws IOException {
        String path = "/Users/akbermetabdullaeva/Desktop/IMG_4299.jpg \n";
        //InputStream st = new InputStream(path);
        InputStream st = new BufferedInputStream(new FileInputStream(path));

        int bt;
        int count = 0;
        while((bt = st.read()) != -1){
            System.out.println(bt);
            count++;
        }
        File f = new File("/Users/akbermetabdullaeva/Desktop/oscar.txt");
        Scanner sc = new Scanner(f);

        //sc.close(); closing Scanner

//        Set<String> names = new HashSet<>();
//        Map<String, String> map = new HashMap<>();
//        PrintWriter writer = new PrintWriter("/Users/akbermetabdullaeva/Desktop/oscarResult2.txt");
//        while (sc.hasNextLine()) {
//            String line = sc.nextLine(); //Process each line
//            line = line.replaceAll("\"", "");
//            String[] arr = line.split(","); //split by coma
//            //names.add(arr[3]);
//
//            map.put(arr[4], arr[3]);
//
//            System.out.println(line);
//        }
//        //System.out.println(map);
//
//        //System.out.println(map.get("Clark Gable"));
//        //System.out.println(names);
//        sc.close();
//        writer.close();

    }
}
