package lambdaFun;

interface car {
    void drive(String c);
}
public class lambda {
    public static void main(String[] args)  {
        // Will only work for functional interface having onle one method in interface on above java8
        car obj = (String s) -> System.out.println("Driving");

        //Defining interface method by non-lambda method
        // car obj = new car() {
        //     public void drive(){
        //         System.out.println("Driving");
        //     }
        // };
        obj.drive("hi");
    }
}
