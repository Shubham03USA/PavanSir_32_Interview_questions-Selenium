package Java_Programs;

public class Car
{
	//Constructor_Passing_Current_Objrct
	
	String model;
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public void displayInfo(Car car )
	{
		System.out.println("Car Model : " +car.model);
	}
	
	public void invokeDisplayInfo()
	{
		this.displayInfo(this);
	}

	public static void main(String[] args) 
	{
		Car c = new Car();
		c.setModel("Audi");
		c.invokeDisplayInfo();
	}
}

