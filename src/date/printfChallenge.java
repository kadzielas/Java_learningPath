package date;

import java.util.Date;

public class printfChallenge {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf("%1$tY-%1$tm-%1$td", date);
    }
}
