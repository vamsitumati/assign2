package eStore;

public class Mobiles extends Electronics {


	
		
		private int number;
		private String type;
		
		
		
		public int getNumber() {
			System.out.println("the mobile number is:+"+number);
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getType() {
			System.out.println("the type of mobile is:"+type);
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public void warrenty(){
			int warrenty=10;
			System.out.println("the warrenty of a mobile is:" + warrenty +"years");
		}
		public void mobtax(){
			int price=15000;
			float tax;
		    tax = (float) (0.115*price);
		    double totalprice;
		    totalprice= tax+price;
		    System.out.println("the totalprice is:"+totalprice);
		    
		}
		

	}


