package eStore;

public class Fridges extends Electronics {
	private String brandname;
	private int size;
	
	
	
	public String getBrandname() {
		System.out.println("the brand name is:"+brandname);
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public int getSize() {
		System.out.println("the size is:"+size+"liters");
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public void warrenty(){
		int warrenty=5;
		System.out.println("the warrenty of a fridge is:" + warrenty +"years");
	}
	public void fridgetax(){
		int price=12000;
		float tax;
	    tax = (float) (0.115*price);
	    double totalprice;
	    totalprice= tax+price;
	    System.out.println("the totalprice is:"+totalprice);
	    
	}
	

}
