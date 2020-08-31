package sessions.StringMethods;

public class StringLength {



            public static void main(String[] args) {
                String str = "John Doe";
                System.out.println(str.length());

                int index = str.length();
                System.out.println(index);

                String str2 = "Elon Musk";
                System.out.println(str2.length());

                int lastChar = str.length() - 1;

                System.out.println(str.charAt(lastChar));

                System.out.println(lastChar(str2));
                System.out.println(lastChar("John Hopkins"));
            }
            /**
             * This is method documentation
             * one big difference between regular comment and documentation
             * documentation are visible where methods are used
             *
             * one thing special about this newly created method is that
             * it's dynamic. can take any String values and still work the same.
             * @param
             * @return
             */
            public static char lastChar(String str){
                int lastChar = str.length() - 1;
                return str.charAt(lastChar);
            }
        }




