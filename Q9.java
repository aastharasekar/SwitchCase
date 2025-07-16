import java.util.*;
class Q9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Subject marks: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second Subject marks: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third Subject marks: ");
        int num3 = sc.nextInt();
        System.out.print("Enter fourth Subject marks: ");
        int num4 = sc.nextInt();
        System.out.print("Enter fifth Subject marks: ");
        int num5 = sc.nextInt();

        int passingMarks = 35;
        if(num1 > passingMarks && num2 > passingMarks && num3 > passingMarks && num4 > passingMarks && num5 > passingMarks) {
            int total = num1 + num2 + num3 + num4 + num5;
            System.out.println("Total Marks: " + total);

            int grade;
            if (total >= 95) {
                       grade = 1;
            } else if (total >= 80) {
                       grade = 2;
            } else if (total >= 70) {
                       grade = 3;
            } else {
                       grade = 4;
            } 

            switch (grade) {
            case 1:
            System.out.println("first class with distinction");
            break;
            case 2:
            System.out.println("first class");
            break;
            case 3:
            System.out.println("second class");
            break;
            case 4:
            System.out.println("You failed the exam");
            break;
        } 
        } else {
            System.out.println("You failed the exam.");
        }
        
    }
    
}
