//Write a Java program that reads a number in inches, converts it to meters
import java.util.Scanner;
public class InchesToMeter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice" ); 
        double inch = sc.nextDouble();
        double meters = inch * 0.0254; 
               System.out.println(inch + " inch is " + meters + " meters");
        
    }
}
