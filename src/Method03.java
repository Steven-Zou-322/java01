public class Method03 {
	public static void main(String[] args) {
		C c=new C();
		//c.sayOK();
		c.m1();
	}

}
class C{
//	public void print(int n) {
//		System.out.println("print()���������� n=" + n);
//	}
//	public void sayOK() {
//		print(10);
//		System.out.println("����ִ��sayOK()");
//	}
	public void m1(){
		System.out.println("m1() ����������");
		B b=new B();
		b.hi();
		System.out.println("m1() ����ִ��");
	}
	
}
class B{
	public void hi() {
		System.out.println("B���е� hi()��ִ��");
	}
	
}

