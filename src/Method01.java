public class Method01 {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.speak();
		p1.cal01();
		p1.cal02(4);
		p1.getSum01(2,3);
		//����һ�������������շ���ֵ
		int returnRes=p1.getSum02(2,3);
		System.out.println(returnRes);
	}
}
class Person{
	public void speak() {
		System.out.println("����һ������");
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
	//1��public��ʾ��ʽ�ǹ����ģ�
	//2��int��ʾ����ִ�к󷵻�һ��int���͵�ֵ��
	//3��(int i,int j)�β��б����Խ����û��������������
	//4��return res��ʾ��res��ֵ���ظ��������ķ���
	
	public int getSum02(int i,int j) {
		int res=i+j;
		return res;
	}
}