package assignments;

interface Softdrinks
{
	int price( int amount);
	double discount(double amt);
}

class Pepsi implements Softdrinks
{ 
	//@override
	public int price (int amount){
		System.out.println("price of pepsi" +amount);
		return amount;
	}
	//@override
	public double discount (double amt){
		System.out.println("discount of pepsi" +amt);
		return amt;
	}
}
class Fizz implements Softdrinks
{
	public int price (int amount){
		System.out.println("price of Fizz" +amount);
		return amount;
	}
	//@override
	public double discount (double amt){
		System.out.println("discount of Fizz" +amt);
		return amt;
}
}


public class InterfaceDemo {

	public static void main(String[] args) {
		Softdrinks p =new Pepsi();
		p.price(500);
		p.discount(200);

		
	   Softdrinks s =new Fizz();
	   s.price(500);
	   s.discount(200);

	}

}
