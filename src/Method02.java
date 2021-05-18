public class Method02 {
	public static void main(String[] args) {
		int [][]arr= {{0,0,1},{1,1,1},{1,1,3}};
		MyTools p1 =new MyTools();
		p1.printArr(arr);
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
	}
}
class MyTools{
	
	public void printArr(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
}