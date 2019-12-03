
class Main {
    public static void main(String[] args) {
        Factorial f = new Factorial(5);
        try{
           int result =  f.getValue();
           System.out.println(result);
        }
        catch(Exception ex){
            ex.getMessage();
        }

    }
}