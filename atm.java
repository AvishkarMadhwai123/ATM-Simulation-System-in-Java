package atm;
import java.util.*;
import java.text.*;
class Account{

	DecimalFormat df1=new DecimalFormat("##,###0.00' Rupee'");
	DecimalFormat df2=new DecimalFormat("##,###0.00' Dollar'");
	 Scanner sc=new Scanner(System.in);
	 
	private int CN;
	private int pn;
	double CB=2000;
	double SB=1000;
	
	
	void setCustomerNumber(int cn) {
		
		CN=cn;
//		System.out.println(CN);
		
	}
	
	void setPinNumber(int pn) {
		this.pn=pn;
//		System.out.println(pn);
	}
	
	
	int getCustomerNumber(){
		
		return CN;
	}
	
	int getPinNumber() {
		
		return pn;
	}
	void getCurrentBalance() {
		System.out.println("\n current Balance :"+df1.format(CB));
	}
	void getSavingBalance() {
		System.out.println("\n current Balance :"+df2.format(CB));
	}
	void getCurrentWithdrawInput(){
		System.out.println("\n current Balance :"+df1.format(CB));
		System.out.println("\n Enter the amount yopu want to windraw :");
		double amount=sc.nextDouble();
		if((CB-amount)>=0) {
			System.out.println("\n Transaction Sucessful :"
			calcCurrntWithdraw(amount);
			System.out.println("\n New current Balance :""+df1.format(CB));
			
		}
		else {
			
		}
	}
	int calcCurrntWithdraw(double amount) 
	{
		CB=CB-amount;
		return CB;
		
	}
	
}


 class OptionMenu extends Account{
	 
	 Scanner sc = new Scanner(System.in);
	 HashMap<Integer,Integer> data = new HashMap();
	 
	 void getLogin()
	 { int a=5;
		 do {
			 try{
				 data.put(1111,111);
				 data.put(1112,222);
				 data.put(1113,333);
				 data.put(1114,444);
				 data.put(1115,111);
				 
				 System.out.println("Welcome To The ATM");
				 System.out.println("Enter The Customer Number :  ");
//				 int c= sc.nextInt();
				 setCustomerNumber(sc.nextInt());//abstraction
				 System.out.print("Enter thr Pin Number  :  ");
				
				 setPinNumber(sc.nextInt());
				 
				int P = getCustomerNumber();
				int Q = getPinNumber();
				 
				 if(data.containsKey(P) && data.get(P)==Q) {		 
					 System.out.println("Login Sucessfully");	
					 
					 getAccountType();
				
				 }else
				 {			 
					 System.out.println("Wrong CustomerNumber or PinNumber");			 
				 }
				 
			 }   catch(InputMismatchException e) {
				 
				 System.out.println(" Please enters only number character are not allowed");
				 sc.next();
				 getLogin();
				 
			 }
		 }
		 while(a==5);
		 }
	 
	void  getAccountType(){
		System.out.println("\n Select The Account Type of You Want");
		System.out.println("\n Type 1 : Current Account ");
		System.out.println("\n Type 2 : Saving  Account ");
		System.out.println("\n Type 3 : Exit ");
		System.out.println("\n Choice : ");
		
		int ch=sc.nextInt();
		switch(ch) {
		
		case 1:
			getCurrent();
			break;
		case 2:
			getSaving();
			
			break;
		case 3:
			System.out.println("\n Thank You For Visiting \n VISIT AGAIN : ");
			break;
		default:
			System.out.println("\n Invalid Choice : ");
			System.out.println("\n Enter Valid Choice : ");
			getAccountType();
			break;
			
		
		}
	 }
	void getCurrent() {
		System.out.println("\n CURRENT ACCOUNT");
		System.out.println("\nType 1:Balance Enquiry");
		System.out.println("Type 2:Withdraw Money");
		System.out.println("Type 3:Deposit Money");
		System.out.println("Type 4 :Exit");
		System.out.println("\n choice:");
		int ch=sc.nextInt();
		switch(ch) {
		
		case 1:
			getCurrentBalance();
			break;
		case 2:
	
			getCurrentWithdrawInput();
			break;
		case 3:
			System.out.println("\n Thank You For Visiting \n VISIT AGAIN : ");
			break;
		default:
			System.out.println("\n Invalid Choice : ");
			System.out.println("\n Enter Valid Choice : ");
			getAccountType();
			break;
			
		
		}
	}
	void getSaving() {
		System.out.println("\n SAVING ACCOUNT");
		System.out.println("\nType 1:Balance Enquiry");
		System.out.println("Type 2:Withdraw Money");
		System.out.println("Type 3:Deposit Money");
		System.out.println("Type 4 :Exit");
		System.out.println("\n choice:");int ch=sc.nextInt();
		switch(ch) {
		
		case 1:
			getSavingBalance();
			break;
		case 2:
			
			break;
		case 3:
			System.out.println("\n Thank You For Visiting \n VISIT AGAIN : ");
			break;
		default:
			System.out.println("\n Invalid Choice : ");
			System.out.println("\n Enter Valid Choice : ");
			getAccountType();
			break;
			
		
		}
	}
}

 
public class ATM extends OptionMenu {

	public static void main(String[] args) {
		OptionMenu obj=new OptionMenu();
		obj.getLogin();
	}

}