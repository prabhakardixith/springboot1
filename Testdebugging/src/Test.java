
public class Test {

	public static void main(String[] args) 
	{
		System.out.println("start");
		
		int a = 10;
		String name = "prabhakar";
		System.out.println(name.startsWith("pra"));
		
		show();
		
		a =a++ + ++a - ++a + a++;
		
		if(a>55)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("InValid");
		}
		
		
		System.out.println("exit");
	}
	
	public static void show()
	{
		System.out.println("begin show() ");
		int k=8;
		k = k-- + ++k + k++;
		
		System.out.println("data is : "+k);
		
		System.out.println("ending show() ");
	}

}
