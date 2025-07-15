
import java.util.Scanner;

class Q8 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();


        if (num1 > 0 && num2 > 0) {
            System.out.println(num1 * num2);
            int result = (num1 * num2);

            if (result % 2 == 0) {
                System.out.println("Even");
            switch (result % 2) {
                case 1:
                    System.out.println("Even");
                    break;
                default:
                    if (result % 2 != 0) {
                        System.out.println("Odd");
                    }
                    break;
            } 
            } else {
                System.out.println("Odd");
            }


    }
        else {
            System.out.println("Sorry Negative numbers are not allowed.");
}

        

        
    }
}
