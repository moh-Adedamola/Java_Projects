import java.util.Scanner;

public class PurchaseCalculatorTwo{

	public static void main(String[]  args){

		Scanner scanner = new Scanner(System.in);

		System.out.println(" WElCOME TO E-STORE: ");
	
		System.out.print(" Please Enter Customer Name:  ");

		String name = scanner.nextLine();

		System.out.print(" Please Enter Number Of Items Purchased:  ");
	
		int numberOfItems = scanner.nextInt();

		System.out.print(" Please Enter Percentage Discount:  ");

		int percentageDiscount = scanner.nextInt();

	



		int counter = 1 ;

		int totalCost = 0 ;
	
	        
		while (counter <= numberOfItems)  {

		System.out.print(" Please Enter cost for item "+ counter + ": " );

		int itemPrice = scanner.nextInt();

		totalCost += itemPrice;
		counter++;

		}

		System.out.printf(" Customer Name: " + name + "\n" +  " Number Of Items Bought: " +  numberOfItems + "\n" + " Percentage Discount: " + percentageDiscount + "\n");

		System.out.print(" Original Cost: " + totalCost + "\n");

		double discount = totalCost * percentageDiscount / 100;
	
		double discountedCost = totalCost - discount;

	
		if (totalCost >= 200) {

			System.out.printf( "%s%.2f", " Discounted Cost: ", discountedCost);
			
			}

		else if (totalCost <= 200) {
		
		System.out.printf( "\n" + " Discounted Cost: 0 (no discount added)  ");
		
		}

		System.out.println( "\n" + " Thanks For Your Patronage  "); 
	
		}


	}
