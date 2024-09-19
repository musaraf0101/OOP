import java.util.Scanner;
public class sumUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Min 3 digit number");
        int number = sc.nextInt();
        String min = Integer.toString(number);
        for(int i =0;i<min.length();i++){
            System.out.println(min.charAt(i));
            int a = Integer.parseInt(min);
            int b = a+a;
            System.out.println(b); 
        }

        sc.close();
    }
}
