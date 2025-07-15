class Q3{
    
    public static void main(String[] args) {
        
        String clothsize = "M";

        switch(clothsize){

            case "S":System.out.println("Small");
            break;

            case "M":System.out.println("Medium");
            break;
            case "L":System.out.println("Large");
            break;
            case "XL":System.out.println("Extra Large");
            break;
            default:System.out.println("No such size available");
            break;
        }
    }
}