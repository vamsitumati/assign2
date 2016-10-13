package eStore;

public class Microwaves extends Electronics{
	
	private int frequency;
	private int wavelength;
	
	
	public int getFrequency() {
		System.out.println("the frequency is:"+frequency+"Hz");
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public int getWavelength() {
		System.out.println("the wavelength is:"+wavelength+"meter");
		return wavelength;
	}
	public void setWavelength(int wavelength) {
		this.wavelength = wavelength;
	}
	
	public void warrenty(){
		int warrenty=8;
		System.out.println("the warrenty of a microwave is:" + warrenty +"years");
	}
	public void oventax(){
		int price=3000;
		float tax;
	    tax = (float) (0.115*price);
	    double totalprice;
	    totalprice= tax+price;
	    System.out.println("the totalprice is:"+totalprice);
	   
	
	}
}
