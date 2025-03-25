import java.util.Scanner;
import java.util.ArrayList;

class Bill{
	int itemId;
	int quantity;
	String itemName;
	int itemPrice;
	int subTotal;
	public Bill(int itemId, int quantity, String itemName, int itemPrice, int subTotal) {
		super();
		this.itemId = itemId;
		this.quantity = quantity;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.subTotal = subTotal;
	}
	
	public String toString() {
		return itemId+"     "+itemName+"     "+quantity+"     "+itemPrice+"     "+subTotal;
	}
}
public class LaunchHotelBilling {
	public static void main(String[] args) {
		String name = null;
		int itemId = 0;
		int quantity = 0;
		String itemName = null;
		int itemPrice = 0;
		int subTotal = 0;
		int grandTotal=0;
		String choice = null;
		System.out.println("Welcome to Hotel Habit");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name");
		name = scan.next();
		
		ArrayList<Bill> al = new ArrayList<Bill>();
		
		do {
			System.out.println("Dear "+name+" below is the menu");
			System.out.println("......................................");
			System.out.println("Item Id      Item Name      Item Price");
			System.out.println("......................................");
			System.out.println("1             Water            20");
			System.out.println("2             Pepsi            40");
			System.out.println("3             Pizza            100");
			System.out.println("4             Burger           150");
			System.out.println("5             Fries            120");
			System.out.println("......................................");
			System.out.println("Please Enter the Item Id");
			itemId = scan.nextInt();
			System.out.println("Enter the quantity");
			quantity = scan.nextInt();
			
			switch(itemId) {
			case 1 : itemName = "Water";
					 itemPrice = 20;
					 subTotal = itemPrice * quantity;
					 break;
			case 2 : itemName = "Pepsi";
			 		 itemPrice = 40;
			 		 subTotal = itemPrice * quantity;
			 		 break;
			case 3 : itemName = "Pizza";
			         itemPrice = 100;
			         subTotal = itemPrice * quantity;
			         break;
			case 4 : itemName = "Burger";
			         itemPrice = 150;
			         subTotal = itemPrice * quantity;
			         break;
			case 5 : itemName = "Fries";
	        		 itemPrice = 120;
	        		 subTotal = itemPrice * quantity;
	        		 break;
			}
			System.out.println(itemName +" "+ quantity +" "+ itemPrice+ " "+ subTotal);
			grandTotal += subTotal;
			Bill b = new Bill(itemId, quantity, itemName, itemPrice, subTotal);
			al.add(b);
			
			System.out.println("Do you want to order more(y/n)");
			choice = scan.next();
			
		}while(choice.equals("y"));
		System.out.println("...............................................................");
		System.out.println("Item Id     Item Name     Quantity     Item Price     SubTotal");
		System.out.println("...............................................................");
		for(Bill x:al) {
			System.out.println(x);
		}
		System.out.println("...............................................................");
		System.out.println("Dear "+name+", your total bill is "+ grandTotal);
		
		float gst = grandTotal*0.1f;
		float totalBill;
		System.out.println("Do you want to tip(y/n)");
		String tipChoice = scan.next();
		if(tipChoice.equals("y")) {
			System.out.println("Enter the amount");
			int tipAmount = scan.nextInt();
			totalBill = grandTotal+gst+tipAmount;
			System.out.println("The final payable bill is "+totalBill);
		}
		else {
			totalBill = grandTotal+gst;
			System.out.println("The final payable bill is "+totalBill);
		}
		
	}

}
