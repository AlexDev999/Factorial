
class Factorial {
   private int number;

   Factorial(int number){
            this.number = number;
    }
    public int getValue() throws Exception{
         int result = 1;
        for(int i = 1;i<=number;i++){
            if(number <=1) throw new Exception("Number less or equivalent 1");
            result *= i;
        }
        return result;
    }
}