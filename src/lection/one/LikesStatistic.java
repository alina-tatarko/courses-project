package lection.one;

import java.time.Year;

public class LikesStatistic {
    public static void main(String[] args) {
        long likesCount = 11342;
        int registrationYear = 2014;
        System.out.println("User A gets " + countLikesPerYear(likesCount, registrationYear) + " likes / year");

        long likesCount2 = 9117;
        int registrationYear2 = 2016;
        System.out.println("User B gets " + countLikesPerYear(likesCount2, registrationYear2) + " likes / year");
    }

    public static double countLikesPerYear(long likes, int registrationYear) {
        int currentYear = Year.now().getValue();
        return (double) likes / (currentYear - registrationYear);
    }
}
