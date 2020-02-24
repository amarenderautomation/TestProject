package inheritpgms;

public class MountinBike extends Bicycle
{
	public int seatHeight;
	
	public MountinBike(int gear, int speed, int startHeight)
	{
		super(gear, speed);
		seatHeight = startHeight;
	}
    public void setHeight(int newValue) 
    { 
        seatHeight = newValue; 
    }  
      
    // overriding toString() method 
    // of Bicycle to print more info 
    @Override
    public String toString() 
    { 
        return (super.toString()+ 
                "\nseat height is "+seatHeight); 
        
    }
	
	
}
