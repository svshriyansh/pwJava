package api_annotation;

enum Week {
    MON, TUE, WED, THURS, FRI, SAT, SUN;
}

public class enum1 {
    enum Result {
        PASS, FAIL, NR
    }

    public static void main(String[] args) {
        for (Week w : Week.values()) {
            System.out.println(w);
        }
    }
}
