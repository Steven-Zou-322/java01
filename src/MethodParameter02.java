import javax.naming.ldap.LdapName;

public class MethodParameter02 {
	public static void  main(String[] args) {
	//int []arr=new arr[5];
	//int[] arr= {1,2,3};
		BBB b=new BBB();
		int[] arr= {1,2,3};
		b.test100(arr);
		for(int i=0;i< arr.length;i++) {
			System.out.println("main="+arr[i]+"\t");
		}
		
		Person01 p1=new Person01();
		p1.name="Jack";
		p1.age=10;
		
		b=test200(p1);
		System.out.println("main µÄp.age="
		 +p1.age);
	}
}
class Person01{
	String name;
	int age;
}
class BBB{
	public void test200(Person01 p) {
		p.age=10000;
	}
	public void test100(int arr[]) {
		arr [0]=0;
		for(int i=0;i< arr.length;i++) {
			System.out.println(arr[i]+"\t");
		}
		System.out.println();
			
	}
}
