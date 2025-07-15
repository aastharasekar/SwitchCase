class SwitchCase{
    
    public static void main(String[] args) {
        
        String color = "Blue";

        switch (color){
            case "Red":System.out.println("STOP");
            break;

            case "Yellow":System.out.println("Ready");
            break;

            case "Green":System.out.println("Go");
            break;

            default:System.out.println("No such color exists in Traffic lights");
            break;
        }
    }
}