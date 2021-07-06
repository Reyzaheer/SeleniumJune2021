package org.system;

public class Desktop extends Computer {
public void desktopsize() {
	System.out.println("Desktop size is 14 inches");

}
	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.computerMode();
		desk.desktopsize();
		
	}
}
