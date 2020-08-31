package sessions.StringBuilder;

public class SB {
    public static void main(String[] args) {
        String str = "Start";
        str.concat("+Middle");

        System.out.println(str);

        String str2 = str.concat("+End");
        System.out.println(str2);


        StringBuilder sb = new StringBuilder("Start");
        sb.append("+Middle");
        System.out.println(sb);

        StringBuilder sb1 = sb.append("+End");
        System.out.println(sb1);

        sb1.append("$$$$NewBeginning");
        System.out.println(sb1);

        StringBuilder  builder = new StringBuilder("31233344444");
        builder.insert(3,"-");
        System.out.println(builder);
        builder.insert(7,"-");
        System.out.println(builder);
        builder.insert(11,"-");
        System.out.println(builder);

        StringBuilder builder1 = new StringBuilder("31233344444");
        builder1.insert(3," ").insert(7,"-").insert(11,"-");
        System.out.println(builder1);

        StringBuilder builder2 = new StringBuilder("Cme Group inc");
        builder2.delete(9,13);
        System.out.println(builder2);

        StringBuilder builder3 = new StringBuilder("Cat Dog Cat");
        builder3.delete(3,7);
        System.out.println(builder3);

        StringBuilder builder4 = new StringBuilder("Chicago, IL, 60012");
        builder4.delete(0,builder4.lastIndexOf(" ")+1);
        System.out.println(builder4);
        System.out.println(builder4.charAt(4));

        //deleteCharAt(int index)
        StringBuilder sb2 = new StringBuilder("Chicago");
        sb2.deleteCharAt(3);
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("John Doe");
        sb3.reverse();
        System.out.println(sb3);

        //write a method which will reverse the String preserving the word order
        //John Doe --> nhoJ eoD
        //Hello World 2020 --> olleH dlroW 0202

        String str10 = sb3.toString(); //to make the String immutable
        str10.toUpperCase().trim();  //to be able yo use String methods

        System.out.println(str10);
        //StringBuilder sb5 = new StringBuilder()




    }
}
