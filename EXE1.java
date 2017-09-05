import java.util.Scanner;
public class EXE1 {
    
    
    public static void main(String[] args) {
        String b = choise();
        Scanner v = new Scanner(System.in);
        int h;
        switch (b) {
            case "1.1":
                System.out.println("                JAVA");
                System.out.println("    J       A       V   V");
                break;
            case "1.4":
                System.out.println("        table of power      ");
                System.out.println("a      a^2      a^3");
                for (int a=1 ;a<=4;a++){
                    
                        System.out.print("  "+Math.pow(a, 2)+"  "+Math.pow(a, 3));
                    
                    System.out.println("");
                }
                break;
            case "1.5":
                System.out.println("        math ");
                break;
            default:
                break;
        }
    
    
}
    public static String choise () {
        Scanner s = new Scanner(System.in);
        String a;
    System.out.println("1.1 write the word \"java\"");
    System.out.println("---");
    System.out.println("1.4 print table of power (^)");
    System.out.println("---");
    System.out.println("1.5 solving a math problem (*)(+)(/)(-)");
    System.out.println("---");
    System.out.println("1.6 solving a summation of series number");
    System.out.println("---");
    System.out.println("1.7 write program displays result of ?");
    System.out.println("---");
    System.out.println("1.8 write program displays the area and preimeter that has the given radius");
    System.out.println("---");
    System.out.println("1.9 write program that give you the area of rectangle by getting the \"width\"\"height\" from the user");
    System.out.println("---");
    System.out.println("1.10 write program that displays the average speed in miles per hour");
    System.out.println("---");
    System.out.println("1.11 write program to displays the population for any year");
    System.out.println("---");
    System.out.println("1.12 write program that displays the average speed in kilometers per hour");
    System.out.println("---");
    System.out.println("1.13 write program solving equation that have x and y");
    System.out.println("---");
    System.out.println("please enter your choise?");
    a=s.next();
    return a;
        
    }
}