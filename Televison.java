package eStore;

public class Televison extends Electronics {
	private String brandname;
	private int noofchannels;
	
	
	
	public String getbrandname() {
		System.out.println("the brand name is:"+brandname);
		return brandname;
		
	}


	public void setbrandname(String brandname) {
		
		this.brandname = brandname;
	}


	public int getNoofchannels() {
		System.out.println("the no of channels are:"+noofchannels);
		
		return noofchannels;
	}


	public void setNoofchannels(int noofchannels) {
		this.noofchannels = noofchannels;
	}


	
	public void warrenty(){
		int warrenty=6;
		System.out.println("the warrenty of a televison is:" +warrenty +"years");
		
	}
	public void teletax(){
		int price=10000;
		float tax;
	    tax = (float) (0.115*price);
	    double totalprice;
	    totalprice= tax+price;
	    System.out.println("the totalprice is:"+totalprice);
	    
	}
	
	
	
	


}
