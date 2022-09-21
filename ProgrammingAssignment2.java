import java.util.*;
public class ProgrammingAssignment2 {

	public static void main(String[] args) {
		
       Scanner keyboard = new Scanner(System.in);
       
       int retailprice= 99;
       int quantity;
       
              System.out.println("Enter number of packages: ");
               quantity = keyboard.nextInt();
               
               int normal = retailprice * quantity;
              double total1 = (double)(retailprice * quantity * 0.9);
              double total2 = (double)(retailprice * quantity * 0.8);
              double total3 = (double)(retailprice * quantity * 0.7);
              double total4 = (double)(retailprice * quantity * 0.6);
               
            	if (quantity<10)
            	{
            		System.out.println("You qualified for nothing!");
            		System.out.println("Total Price is: "+ "$"+normal);
            	}
            	
               if (quantity>=10 && quantity<=19)
               {
            	   System.out.println("You qualified for 10% discount!");
            	   System.out.printf("Total price is: $%.2f", total1);  //work= better than 2nd line of "total price is +normal etc...
               }
               
               if (quantity>=20 && quantity<=49)
               {
            	   System.out.println("You qualified for 20% discount!");
            	   System.out.print("Total price is: "+ "$"+total2);
               }
               
               if (quantity>=50 && quantity<=99)
               {
            	   System.out.println("You qualified for 30% discount!");
            	   System.out.print("Total price is: "+ "$"+total3);
               }
               
               
               if (quantity>=100)
               {
            	   System.out.println("You qualified for 40% discount!");
            	   System.out.print("Total price is: "+ "$"+total4);
               }
               
               
               
				
				
              
       
       
       
		
		
		
		keyboard.close();
	}

}
