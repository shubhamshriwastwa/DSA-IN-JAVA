import java.util.Scanner;
public class LargestOfThree { 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter threee number ");
        
        int a= sc.nextInt();
        int b= sc.nextInt();  
        
        int c= sc.nextInt();  
        
        if(a>=b&&a>=c)
        { 
                               System.out.println("A"); 

            System.out.println(a); 
            
        }else{
            if(b>=a&&b>=c)
            { 
                   System.out.println("B"); 

                  System.out.println(b); 

            } 
            else{ 
                            System.out.println("C"); 

                            System.out.println(c); 

            }
        }

    }
    
}
