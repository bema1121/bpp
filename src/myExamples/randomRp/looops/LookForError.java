package myExamples.randomRp.looops;

public class LookForError {
    public static void main(String[] args) {
        //look for error and print count

        String log = " dshsgxkj error fheskd bkjxfdhz error djkfhdz vdfzg error ckhff ";
        int count = 0;
        for(int i = 0; i < log.length()-5 ; i++){
            String log2 = log.substring(i, i+5);
            if(log2.equals("error")){
                count++;
            }
        }
        System.out.println("Count: "+count);

    }
}
