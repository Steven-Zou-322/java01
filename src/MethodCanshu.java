public class MethodCanshu {
	public static void main(String[] args) {
		A a1=new A();
		a1.sayOK();
		System.out.println("结束");
	}
}
class A{
	public void print(int n) {
		System.out.println("hello"+"*"+n);
		
	}
	public void sayOK() {
		print(10);
		System.out.println("继续执行sayOk");
	}	

		
	}

//class B{
//	public void hi() {
//		System.out.println("B类中的 hi()被执行")
//	}
//}