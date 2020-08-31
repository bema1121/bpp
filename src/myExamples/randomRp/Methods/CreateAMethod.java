package myExamples.randomRp.Methods;

    public class CreateAMethod {
        //create a method that takes a number and returns even or odd

        public static void main(String[] args) {

            CreateAMethod obj = new CreateAMethod();

            String str = obj.evenOrOdd(4);


        }
        public  String evenOrOdd(int num){

            String result ="";
            if(num % 2 == 0){
                result ="Even";
                System.out.println(result);
               return result;
            }else if(num % 2 == 1){

                result ="Odd";
                return result;
            }else{
                return result;
            }

        }

    }
