package eStore;



public class Electronics 
{

       private	String color;
       private	String screentype;
       private    int weight;
       private   int volts;
           
       public void info()
       {
                System.out.println("The items in this store are:");
       }

       public String getColor() 
       {
	            System.out.println("the color is:"+color);
	            return color;
       }


       public void setColor(String color) 
       {
	        this.color = color;
       }


       public String getScreentype() 
       {
	        System.out.println("the screentype is:"+screentype);
	        return screentype;
       }


       public void setScreentype(String screentype) 
       {
	       this.screentype = screentype;
       }


       public int getWeight() 
       {
	      System.out.println("the weight is:"+weight+"kgs");
	      return weight;
       }


       public void setWeight(int weight) 
       {
	       this.weight = weight;
       }


       public int getVolts() 
       {
	       System.out.println("the volts are:"+volts+"v ");
	       return volts;
       }


      public void setVolts(int volts)
      {
	       this.volts = volts;
      }

}
