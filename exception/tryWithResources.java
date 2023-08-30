package exception;

import java.util.Scanner;

public class tryWithResources {
    public static void main(String[] args) {
        int num = 0;
        //! try resource syntax implementation
        //! The resource will close automaticlly we need not to write it with finally block
        try(Scanner sc = new Scanner(System.in)){
            num = sc.nextInt();
        }
        System.out.println(num);
    }
}
