package myExamples.randomRp.Methods;

public class MethodWithStr1 {

        public static void main(String[]args){
            MethodWithStr1 nn = new MethodWithStr1();
            String s1 = "12345";
            String s2 = "abcde";
            System.out.println(nn.mergeStrings(s1,s2));

        }public static String mergeStrings(String one, String two) {
        String str ="";
            for(int i = 0; i < one.length(); i++){
              str +=  one.charAt(i)+"".concat(two.charAt(i)+"");


                }
            return str;

            }

        }






