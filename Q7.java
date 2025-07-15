
import java.util.*;

class Q7 {
    public static void main(String[] args) {
        System.out.println("1.Platinum");
        System.out.println("2.Gold");
        System.out.println("3.Silver");
        System.out.println("4.Bronze");
        System.out.println("5.Free");

        System.out.println("Enter your plan: ");
        Scanner scanner = new Scanner(System.in);
        String plan = scanner.next();

        switch(plan) {
            case "Platinum":
                System.out.println("For Platinum plan the price is 799.");
                break;
            case "Gold":
                System.out.println("For Gold plan the price is 599.");
                break;
            case "Silver":
                System.out.println("For Silver plan the price is 399.");
                break;
            case "Bronze":
                System.out.println("For Bronze plan the price is 199.");
                break;
            case "Free":
                System.out.println("For less than 199, the platform is free with limited access.");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
