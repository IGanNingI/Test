

import java.util.Scanner;
public class EXE1 {
    
    
    public static void main(String[] args) {
        String b = choise();
        Scanner v = new Scanner(System.in);
        int h;
        switch (b) {
            case "1.1":
                System.out.println("          print the word JAVA");
                PW();
                break;
            case "1.4":
                System.out.println("        table of power      ");
                System.out.println("a      a^2      a^3");
                TP();
                break;
            case "1.5":
                System.out.println("        math problem ");
                MP();
                break;
            case "1.6":
                System.out.println("        summation of series number ");
                SN();
                break;
            case "1.7":
                System.out.println("        result of PI ");
                SPI();
                break;
            case "1.8":
                System.out.println("        the area and preimeter ");
                break;
            case "1.9":
                System.out.println("        the area of rectangle ");
                break;
            case "1.10":
                System.out.println("        the average speed in miles per hour ");
                break;
            case "1.11":
                System.out.println("        the population ");
                break;
            case "1.12":
                System.out.println("        the average speed in kilometers per hour ");
                break;
            case "1.13":
                System.out.println("        solving equation that have x and y ");
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
    System.out.println("1.7 write program displays result of PI");
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
  public static void PW (){
     
      System.out.println("     J           A       V     V       A");
      System.out.println("     J          A A       V   V       A A");
      System.out.println("J    J         AAAAA       V V       AAAAA");
      System.out.println(" J J          A     A       V       A     A");
     
  }
  public static void TP(){
      for (int a=1 ;a<=4;a++){
                    
                        System.out.print(a+"  "+Math.pow(a, 2)+"  "+Math.pow(a, 3));
                    
                    System.out.println("");
                }
     
  }
  public static void MP(){
      System.out.println(((9.5*4.5)-(2.5*3))/(45.5-3.5));
  }
  public static void SN(){
      System.out.println(1+2+3+4+5+6+7+8+9);
      int x=0;
      for(int I=0;I<=9;I++){
          System.out.print(I+"+"); 
          x +=I;
      }
      System.out.println("="+x);
      
  }
  public static void SPI(){
      System.out.println("4*(1-1/3+1/5-1/7+1/9-1/11)"+4*(1-1/3+1/5-1/7+1/9-1/11));
      System.out.println("4*(1-1/3+1/5-1/7+1/9-1/11+1/13)"+4*(1-1/3+1/5-1/7+1/9-1/11+1/13));
     
  }
}