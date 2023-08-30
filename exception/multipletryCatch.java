package exception;

public class multipletryCatch {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 11;
        int arr[] = {1,2,3,4};
        int result = 0;
        try {

            result = num1/num2;
            //! This is a critical statement
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("You can not divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limits");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(result);
        System.out.println("Bye");
    }
    
}
