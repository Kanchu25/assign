package assignments;

interface hotdrinks
{
	int price (int amount);
}

class Tea implements hotdrinks
{

	@Override
	public int price(int amount) {
		System.out.println("tea");
		System.out.println("price of tea" +amount);
		return amount;
	}
	
}
class Coffee implements hotdrinks
{

	@Override
	public int price(int amount) {
		System.out.println("coffee");
		System.out.println("price of coffee" +amount);
		return amount;
	}
	
}

class Milk implements hotdrinks
{

	@Override
	public int price(int amount) {
		System.out.println("Milk");
		System.out.println("price of milk" +amount);
		return amount;
	}
	
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		hotdrinks h=new Tea();
		h.price(10);

		hotdrinks c= new Coffee();
		c.price(20);
		
		hotdrinks m= new Milk();
		m.price(15);
		
		
	}

}
