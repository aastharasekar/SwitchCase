class Q4{
    public static void main(String[] args) {
        
        int num1 = 5;
        int num2 = 6;
        int num3 = 7;
        int num4 = 2;

        String operation = "*";
        
        int result= 0;

        switch (operation) {
            case "+":
                     result = num1 + num2;
                break;
            case "-":
                     result= num1-num2;
                break;
            case "*":
            result=num3 * num4;
            break;

            default:
                System.out.println("Invalid Operation");
                break;

        }

        System.out.println("Result: "+ result);
        
        
    }
}