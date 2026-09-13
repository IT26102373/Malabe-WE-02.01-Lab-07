import java.util.Scanner;

public class lab7Q3{
public static void main(String[]args){
	int customerNo;
	double discount,billAmount,totalBill;
	char paymentMode;
	final double DISCOUNT_RATE=0.05;
	
	Scanner sc = new Scanner(System.in);
	for(customerNo = 1;customerNo <=5; customerNo++){
		System.out.println("CUSTOMER " +customerNo);
		System.out.println("ENTER YOUR TOTAL BILL AMOUNT" );
		billAmount=sc.nextInt();
	
		System.out.println("ENTER YOYR PAYMENT MODE ");
		 paymentMode=sc.next().toUpperCase().charAt(0);
		
		if (paymentMode =='C' ){
			discount=billAmount*DISCOUNT_RATE;
			System.out.println("DISCOUNT IS : "+discount);
			
	        totalBill= billAmount-discount;
			System.out.println("TOTAL BILL AFTER DISCOUNT IS "+totalBill);
		}
			else if(paymentMode =='O'){
			System.out.println("PAYMENT MODE IS INVALIDE FOR DISCOUNT");
		    System.out.println("TOTAL BILL IS : " +billAmount);
			}
			
			else{
			System.out.println("INVALID PAYMENT MODE");
		    System.out.println();
			continue;
			}
			
			
		}
		
	}
	
	





}