package pk1;
class Bike
{
	int speed=100;
	void brake()
	{
		System.out.println("Brake is applied");
	}
}
public class Exp1_c {

	public static void main(String[] args) 
	{
		Bike b= new Bike();
		int a=b.speed;
		System.out.println("Speed is:"+a);
		b.brake();
		

	}

}
