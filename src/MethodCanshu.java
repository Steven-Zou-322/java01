public class MethodCanshu {
	public static void main(String[] args) {
		A a1=new A();
		a1.sayOK();
		System.out.println("����");
	}
}
class A{
	public void print(int n) {
		System.out.println("hello"+"*"+n);
		
	}
	public void sayOK() {
		print(10);
		System.out.println("����ִ��sayOk");
	}	

		
	}

//class B{
//	public void hi() {
//		System.out.println("B���е� hi()��ִ��")
//	}
//}