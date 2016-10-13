package eStore;

public class Computers extends Electronics {
	

	
		
		private int ram;
		private String name;
		
		
		
		
		
		public int getRam() {
			System.out.println("the ram for this computer is:"+ram+"GB");
			return ram;
		}
		public void setRam(int ram) {
			this.ram = ram;
		}
		public String getName() {
			System.out.println("the System  name is:"+name);
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int warrenty(){
			int warrenty=4;
			System.out.println("the warrenty of a microwave is:" + warrenty +"years");
			return warrenty;
		}
		public void comptax(){
			int price=30000;
			float tax;
		    tax = (float) (0.115*price);
		    double totalprice;
		    totalprice= tax+price;
		    System.out.println("the totalprice is:"+totalprice);
		    
		}
		

	}

class laptop extends Computers{
	int batterylife;
	int chargingtime;
	int cost;
	
    public void lappywarrenty(){
    	int warenty= 4;
    	System.out.println("the warrenty of a laptop is:" +warenty+"years");
    }
		
		
}



