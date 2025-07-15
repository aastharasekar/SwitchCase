class Q2{
    
    public static void main(String[] args) {
        
        char remarks = 'O';

        switch (remarks){
            
            case 'O': System.out.println("Outstanding");
            break;

            case 'A':System.out.println("Excellent");
            break;

            case 'B':System.out.println("Average");
            break;
            case 'F':System.out.println("Fail");
            break;

            default:System.out.println("No such grade present");
            break;
        }
    }
}