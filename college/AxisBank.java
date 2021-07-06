package org.college;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Deposit amount is 15000");

	}

	public static void main(String[] args) {
		AxisBank Axis = new AxisBank();
		Axis.deposit();
		Axis.saving();
		Axis.fixed();

	}

}
