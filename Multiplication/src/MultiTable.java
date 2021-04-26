
public class MultiTable {

	public static void printMultiplicationTable(int TableSize) {
		System.out.format("");
		
		for(int i = 1; i<=TableSize;i++) {
			System.out.format("%4d", i);
		}
		System.out.println();
		
		for(int i = 2;i<=TableSize; i++) {
			System.out.format("%4d", i);
			for(int j=2;j<=TableSize;j++) {
				System.out.format("%4d", i*j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int TableSize = 10;
		
		printMultiplicationTable(TableSize);
	}
}
	
	
