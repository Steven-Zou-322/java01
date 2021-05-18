import java.security.PublicKey;

public class MethodParameter {
	public static void main(String[] args) {
		int a=2;
		int b=4;
		AAA p1=new AAA();
		p1.swap(a,b);
		System.out.println("a="+a+ "b="+ b);
	}
}
class AAA{
	public void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+"\tb="+b);
	}
	
}
