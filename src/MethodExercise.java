import java.awt.print.Printable;
import javax.management.relation.InvalidRoleInfoException;
import javax.swing.text.ChangedCharSetException;

import java.util.Scanner;
public class MethodExercise {
	public static void main(String[] args) {
		AA p1=new AA();
    	boolean m=p1.isOdd(10085);
		System.out.println(m);
		
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		int b=x.nextInt();
		char c=x.next().charAt(0);//java里面没有nextChar(),只有next().charAt(0)
		
		BB p2=new BB();
		p2.print(a,b,c);
	}
}
class AA{
	//boolean i;
	public boolean isOdd(int n) {
//		if(n%2==0) {
//			return true;
//		}
//		else {
//			return false;
//		}	
		return n%2!=0?true:false;
	}
}
class BB{
	public void print(int row,int col,char x) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}