class Q10{
    public static void main(String[] args) {
        int age = 20;

        switch (age) {
            case 18:
                System.out.println("You are an adult now.");
                break;
            case 21:
                System.out.println("You can get job now");
                break;
            case 65:
                System.out.println("You are a senior citizen.");
                break;
            default:
                System.out.println("Age does not match any specific category.");
                break;
        }
    }
}