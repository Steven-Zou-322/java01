import java.security.PublicKey;

public class MethodDetail {
	public static void main(String[] args) {
		Person1 p1=new Person1();
		int arr1[]=p1.getSumAndSub(2,3);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		
	}

}
class Person1{
	public int[] getSumAndSub(int i,int j){
		int []arr=new int[2];
		arr[0]=i+j;
		arr[1]=i-j;
		
		return arr;
	}
}