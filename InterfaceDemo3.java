package assignments;

interface parameter
{
	int amount(int salary);
	double allowances (double price);
	
}
class Fulltime implements parameter
{

	@Override
	public int amount(int salary) {
		System.out.println("full time employee salary is:");
		return salary;
	}

	@Override
	public double allowances(double price) {
		System.out.println("allowances are ");
		return price;
	}
class Parttime implements parameter
	{

		@Override
		public int amount(int salary) {
			System.out.println("part time employee salary is:");
			return salary;
		}

		@Override
		public double allowances(double price) {
			System.out.println("allowances are ");
			return price;
		}
}
class Contract  implements parameter
{

	@Override
	public int amount(int salary) {
		System.out.println("contract employee salary is:");
		return salary;
	}

	@Override
	public double allowances(double price) {
		System.out.println("allowances are ");
		return price;
	}
}
	
public class InterfaceDemo3 {

	public void main(String[] args) {
		parameter f= new Fulltime();
		f.amount(50000);
		f.allowances(5000);
		
		parameter p = new Parttime();
		p.amount(30000);
		p.allowances(3000);
		
		parameter c= new Contract();
		c.amount(15000);
		c.allowances(1000);
	}
}
}
