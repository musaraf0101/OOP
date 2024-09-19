import java.util.Scanner;

public class convert{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);//creating scanner

        System.out.println("Enter Temperature");
        double temp = sc.nextDouble();
        //get user input

        System.out.println("Enter unit");
        //get user input which type of temp
        String unit = sc.nextLine();

        if(unit=="F||f"){
            System.out.println(temp+"C is Equal to"+(temp+32)*(9/5));
        }
        else if(unit=="C||c"){
            System.out.println(temp+"F is Equal to"+(temp-32)*5/9);
        }
        else{
            System.out.println("Invalid unit"); 
        }
        sc.close();
    }
}