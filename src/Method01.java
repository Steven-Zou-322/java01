public class Method01 {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.speak();
		p1.cal01();
		p1.cal02(4);
		p1.getSum01(2,3);
		//申明一个变量用来接收返回值
		int returnRes=p1.getSum02(2,3);
		System.out.println(returnRes);
	}
}
class Person{
	public void speak() {
		System.out.println("我是一个好人");
	}
	
	public void cal01() {
		int sum=0;
		for(int i=1;i<=1000;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
	
	public void cal02(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
	
	public void getSum01(int i,int j) {
		int sum=0;
		sum=i+j;
		System.out.println(sum);
	}
	//1、public表示方式是公开的；
	//2、int表示方法执行后返回一个int类型的值；
	//3、(int i,int j)形参列表，可以接受用户传入的两个数；
	//4、return res表示把res的值返回给调用它的方法
	
	public int getSum02(int i,int j) {
		int res=i+j;
		return res;
	}
}