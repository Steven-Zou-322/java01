public class Method03 {
	public static void main(String[] args) {
		C c=new C();
		//c.sayOK();
		c.m1();
	}

}
class C{
//	public void print(int n) {
//		System.out.println("print()方法被调用 n=" + n);
//	}
//	public void sayOK() {
//		print(10);
//		System.out.println("继续执行sayOK()");
//	}
	public void m1(){
		System.out.println("m1() 方法被调用");
		B b=new B();
		b.hi();
		System.out.println("m1() 继续执行");
	}
	
}
class B{
	public void hi() {
		System.out.println("B类中的 hi()被执行");
	}
	
}

