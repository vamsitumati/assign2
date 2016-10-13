package eStore;


public class Airconditioners extends Electronics {
	
		private int level;
		private int temparature;
		
		
		
		public int getLevel() {
			System.out.println("the level is:"+level);
			return level;
		}
		public void setLevel(int level) {
			this.level = level;
		}
		public int getTemparature() {
			System.out.println("the present temparature is:"+temparature+"degrees");
			return temparature;
		}
		public void setTemparature(int temparature) {
			this.temparature = temparature;
		}
		
		public void warrenty(){
			int warrenty=2;
			System.out.println("the warrenty of a AC is:" + warrenty +"years");
		}
		public void actax(){
			int price=25000;
			float tax;
		    tax = (float) (0.115*price);
		    double totalprice;
		    totalprice= tax+price;
		    System.out.println("the totalprice is:"+totalprice);
		    
		}
		

	}


