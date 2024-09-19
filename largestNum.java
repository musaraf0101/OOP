import java.util.Scanner;
public class largestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1>num2&&num1>num3) {
            System.out.println("Largest Number is"+num1);            
        }
        else if(num2>num3&&num2>num1){
            System.out.println("Largest Number is"+num2);
        }
        else{
            System.out.println("Largest Number is"+num3);
        }

        sc.close();
    }
}
