package api_annotation;

import java.lang.*;

enum Result {
    PASS, FAIL, NR
}

public class enumSwitch {
    public static void main(String[] args) {
        Result res = Result.FAIL;
        switch (res) {
            case PASS:
                System.out.println("Passing");
                break;

            case FAIL:
                System.out.println("Failing");
                break;

            case NR:
                System.out.println("No result");
                break;
        }
    }
}
