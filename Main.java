package eStore;

public class Main 
{

	public static void main(String[] args ) 
	{
		
		Electronics obj=new Electronics();
		Televison obj1= new Televison();
		Fridges obj2= new Fridges();
		Computers obj3=new Computers();
		Mobiles obj4= new Mobiles();
		Microwaves obj5=new Microwaves();
		Airconditioners obj6= new Airconditioners();
		laptop obj7= new laptop();
		
		obj.info();
		System.out.println("\n");
		
		
		System.out.println("TELEVISION:");
	    obj1.setbrandname("tlc");
	    obj1.getbrandname();
	    obj1.setVolts(220);
	    obj1.getVolts();
	    obj1.setColor("BLACK");
	    obj1.getColor();
	    obj1.setNoofchannels(200);
	    obj1.getNoofchannels();
	    obj1.setWeight(10);
	    obj1.getWeight();
		obj1.warrenty();
		obj1.teletax();
		

		System.out.println("\n");
		System.out.println("FRIDGE:");
		
		    obj2.setBrandname("Godrej");
		    obj2.getBrandname();
		    obj2.setVolts(220);
		    obj2.getVolts();
		    obj2.setColor("WHITE");
		    obj2.getColor();
		    obj2.setWeight(10);
		    obj2.getWeight();
		    obj2.setSize(10);
		    obj2.getSize();
			obj2.warrenty();
			obj2.fridgetax();
			
			System.out.println("\n");
			System.out.println("MICROWAVE:");
			
			    obj5.setFrequency(3);
			    obj5.getFrequency();
			    obj5.setWavelength(5);
			    obj5.getWavelength();
			    obj5.setVolts(220);
			    obj5.getVolts();
			    obj5.setColor("GREY");
			    obj5.getColor();
			    obj5.setWeight(10);
			    obj5.getWeight();
			    obj5.warrenty();
				obj5.oventax();
				
				System.out.println("\n");
				System.out.println("COMPUTER:");
				
				obj3.setName("vamsi's");
				obj3.getName();
				obj3.setRam(4);
				obj3.getRam();
				obj3.setVolts(220);
			    obj3.getVolts();
			    obj3.setColor("BLACK");
			    obj3.getColor();
			    obj3.setWeight(3);
			    obj3.getWeight();
			    obj3.warrenty();
				obj3.comptax();
				
				System.out.println("\n");
				System.out.println("LAPTOP:");
				
				
				obj7.setName("Varun'S");
				obj7.getName();
				obj7.setRam(4);
				obj7.getRam();
				obj7.setVolts(220);
			    obj7.getVolts();
			    obj7.setColor("BLACK");
			    obj7.getColor();
			    obj7.setWeight(2);
			    obj7.getWeight();
			    obj7.lappywarrenty();
			    
			    
			    System.out.println("\n");
				System.out.println("MOBILE:");
				

				obj4.setNumber(1571699379);
				obj4.getNumber();
				obj4.setType("GSM");
				obj4.getType();
				obj4.setVolts(220);
			    obj4.getVolts();
			    obj4.setColor("BLACK");
			    obj4.getColor();
			    obj4.setWeight(1);
			    obj4.getWeight();
			    obj4.warrenty();
			    obj4.mobtax();
			    

			    System.out.println("\n");
				System.out.println("AIRCONDITIONER:");
				
				obj6.setTemparature(22);
				obj6.getTemparature();
				obj6.setLevel(3);
				obj6.getLevel();
				obj6.setVolts(220);
			    obj6.getVolts();
			    obj6.setColor("BLACK");
			    obj6.getColor();
			    obj6.setWeight(1);
			    obj6.getWeight();
			    obj6.warrenty();
			    obj6.actax();
				
				
			    
	}

}
