
import java.lang.Math;
public class destination 
{
	destination()
	{
		
	}
	public int dest(String place)
	{
		System.out.println("Destination: " + place);
		
		return 0; 
		
	}
	public int ages(int age)
	{
		System.out.println("Age: " + age);
		
		if (age < 21) 
		{
			System.out.println("Since you are " + age + "years old, you are not allowed to go to bars or casinos!");
		}
		else 
		{
			System.out.println("You can go anywhere since you are over 21 years old!");
		}
		
		return 0; 
		
	}
	public int dist(int range, String date1, String date2)
	{
		System.out.println("You want to depart on: " + date1);
		System.out.println("You want to arrive on: " + date2);
		System.out.println("Distance: " + range + "miles");
		if (range >= 350)
		{
			System.out.println("Flying by plane is most likely the best option");
			System.out.println("Flight departure date: " + date1 + " at " + (int)(Math.random() * 12) + ":" + (int)(Math.random() * 60));
		}
		else if (range < 100) 
		{
			System.out.println("Driving is most likely the best option");
			System.out.println("Date to leave: " + date2 + " at " + (int)((Math.random() * 12) + 1) + ":" + (int)((Math.random() * 60 + 1)));
		}
		else if (range > 99 || range < 350)
		{
			System.out.println("Traveling by train is most likely the best option");
			System.out.println("Train departure date: " + date1 + " at " + (int)((Math.random() * 12) + 1) + ":" + (int)((Math.random() * 60) + 1));
		}
		return 0; 

		
	}

}
