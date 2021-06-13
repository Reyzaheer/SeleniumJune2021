package week1.day1;

public class Mobile {

	public String mobileModel = "Apple";
	public int mobileWeight = 10;
	public boolean fullCharge = true;
	public double mobileCost = 94500.45;
	
	public static void main(String[] args) {
		long mobileNumber = 9941006993L;
		Mobile newMobile = new Mobile();
		newMobile.makeCall();
		newMobile.sendMsg();
		System.out.println(newMobile.mobileModel);
		System.out.println(newMobile.mobileWeight);
		System.out.println(newMobile.fullCharge);
		System.out.println(newMobile.mobileCost);
		System.out.println(mobileNumber);
		
	}
	public void makeCall() {
		
		System.out.println("Call made successfully");
	
		
	}
public void sendMsg() {
	System.out.println("Message sent successfully");

}
	}

