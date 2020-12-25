package auotestpractice111;

public class Run {

	public static void main(String[] args) {
int i;

Object result1=20;
System.out.println(addition.add(10,30));
subtraction sub1=new subtraction();
Object obj=sub1.sub(40,10,10);
if(obj.equals(result1))
{
	System.out.println("passes");
}
else
{
	System.out.println("failed");
}
}
}
class addition
{

public static int add(int i,int b)
{
	System.out.println(10+20);

	int sum=i+b;
	
	return sum;

	
}
}

class subtraction{
	public int sub(int i,int j,int k)
	
	{
		int sub=i-j-k;
		return sub;
		
	}
	
}