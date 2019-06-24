import java.util.*;
public class Swapping{
	int temp;
	int a,b;
	public void func(int a,int b) {
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping::"+a+" "+b);

	}
	public static void main(String []args) {
		Swapping s=new Swapping();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swapping::"+a+" "+b);
		s.func(a,b);
		
		sc.close();
	}
}