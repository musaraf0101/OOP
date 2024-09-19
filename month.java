import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year");
        int year = sc.nextInt();
        System.out.println("Enter the month number");
        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("January contain 31 days");
                break;
            case 2:
                if ((year/400==0)||(year%4==0&year%100!=0)) {
                    System.out.println("It's a leaf year february contain 29 days");
                }
                else{
                    System.out.println("It's not a leap year february contain 28 days");
                }
                break;
            case 3:
                System.out.println("March contain 31 days");
                break;
            case 4:
                System.out.println("April contain 30 days");
                break;
            case 5:
                System.out.println("May contain 31 days");
                break;
            case 6:
                System.out.println("June contain 30 days");
                break;
            case 7:
                System.out.println("July contain 31 days");
                break;
            case 8:
                System.out.println("August contain 31 days");
                break;
            case 9:
                System.out.println("September contain 30 days");
                break;
            case 10:
                System.out.println("October contain 31 days");
                break;
            case 11:
                System.out.println("November contain 30 days");
                break;
            case 12:
                System.out.println("December contain 31 days");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
        sc.close();
    }
}
