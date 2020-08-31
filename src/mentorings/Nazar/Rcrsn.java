package mentorings.Nazar;

public class Rcrsn {

        //String = AAAAABBBAAAA;
        //AAAAAAAAAAABBBBBBBB

        /**
         * factorial:
         *  5 = 5 * 4 * 3 * 2 * 1
         *  fact(1) = 1  //Given or Base
         *  fact(2) = 2 * fact(1)
         *  fact(3) = 3 * fact(2)  //* 1
         *  fact(4) = 4 * fact(3)  //3 * 2 * 1
         *
         */

        public static void main(String[] args) {
            // AAAABBBBAAABBAABBAAA -> AAAAAAAAAAAABBBBBBB
            /**
             *   5 = 5 * 4 * 3 * 2 * 1
             *   fact(1) = 1 // Given or Base
             *   fact(2) = 2 * fact(1)
             *   fact(3) = 3 * fact(2)
             *   fact(4) = 4 * fact(3)
             */
//        System.out.println(fact(5));
//        System.out.println(rev("Hello"));
            System.out.println(findPal("Ihaveaneyeonakayakandinmygarage"));
        }
        /**
         * Recursive function is the one that as a part of it's execution invokes itself
         */
        // i =  5
        //  120
        // 5 * 24
        // 4 * 6
        // 3 * 2
        // 2 * 1
        //   1
        // 5
        // 5 * fact(4)
        // 4 * fact(3)
        // 3 * fact(2)
        // 2 * fact(1)
        // 1
        public static int fact(int i){
            if(i == 1) return 1;
            return i * fact(i - 1);
        }
// [1,2,3,4] -> [1,2] [3,4]  -> [1] [2] [3] [4]
        /**
         * Hello -> olleH
         * o + rev(Hell) lleH
         * l + rev(Hel) -> leH
         * l + rev(He) -> eH
         * e + rev(H) -> H
         * H
         */
        public static String rev(String str){
            if(str.length() == 1) return str;
            int l = str.length();
            return str.substring(l - 1) + rev(str.substring(0, l - 1));
        }
        public static String findPal(String s){
            if(s.length() == 1) return s;
            String curPal = "";
            for(int i = s.length() - 1; i >= 1; i--){
                String cur = s.substring(0, i);
                if(isPalindrome(cur)){
                    if(cur.length() > curPal.length()){
                        curPal = cur;
                        break;
                    }
                }
            }
            String anotherPal = findPal(s.substring(1));
            return anotherPal.length() > curPal.length() ? anotherPal : curPal;
        }
        public static boolean isPalindrome(String s){
            return new StringBuilder(s).reverse().toString().equals(s);
        }
    }
