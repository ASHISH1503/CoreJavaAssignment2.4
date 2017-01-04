import java.util.Scanner;
public class Highest {

	public static void main(String[] args) 
	{
        int big;
      Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers :");
         System.out.println("num1 :");
        int a = input.nextInt();
         System.out.println("num2 :");
        int b = input.nextInt();
        System.out.println("num3 :");
        int c = input.nextInt();
        big = a;
        if(big<b){
            if(b>c){
                big = b;
            }
            else{
                big = c;
            }
        }
        else if(big<c){
            if(c>b){
                big = c;
            }
            else{
                big = b;
            }
        }
        else
        {
            big = a;
            
        }
        
        System.out.println("The largest number is " +big);
        input.close();
    }

}
