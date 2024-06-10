import java.util.Scanner;

public class Maiin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mynum = (int) (Math.random() * 200);
        int usernum = 0;

        do {
            System.out.println("Guess my number:");
            usernum = sc.nextInt();

            if (usernum == mynum) {
                System.out.println("100....correct Number");
                break;
            } else if (usernum > mynum) {
                System.out.println("Number is too large");
            } else {
                System.out.println("Number is too small");
            }
        } while (usernum >= 50);

        System.out.println("My number was: " + mynum);
    }
}