import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number1: ");
		int a = in.nextInt();
		System.out.print("Enter number2: ");
		int b = in.nextInt();
		System.out.println(add(a,b));
		
		in.close();
		
	}
	
	public static int add(int a,int b)
	{
		return a+b;
	}

}
