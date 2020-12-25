
package auotestpractice111;

public class Run2 {

	public static void main(String[] args) {

		A a1=new c();
		a1.test1();
	}

}
class A{
	
	public void test1()
	{
		 System.out.println("Runner class");
	}
}
class b extends A{
	
	public  void test1()
	{
		 System.out.println("B Runner class");
	}
}
class c extends A{
	
	public  void test1()
	{
		 System.out.println("c Runner class");
	}
}
class cD extends A{
	
	public  void test1()
	{
		 System.out.println("c Runner class");
	}
}