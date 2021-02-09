import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner IN = new Scanner(System.in);
		// input a number from the user
		int Length = 40;
		// input a second number from the user, save as Width
		int Width = 15;
		// input cost per square foot, save as CostPerSqFt
		double CostPerSqFt = 5.00;
		// input number of Windows, save as Windows
		int Windows = 10;
		// input length of Windows, save as LengthWindow
		int LengthWindow = 4;
		// input height of Windows, save as HeightWindow
		int HeightWindow = 2;
		// input number of doors, save as Doors
		int Doors = 2;
		// input length of doors, save as LengthDoor
		int LengthDoor = 6;
		//input width of doors, save as HeightDoor
		int HeightDoor = 3;
		// multiply Length and Width, save as SqFtOfOneSide
		int SqFtOfOneSide = Length * Width;
		// multiply SqFtOfOneSide by 2, save as SqFtOfHalfHouse
		int SqFtOfHalfHouse = SqFtOfOneSide * 2;
		// input a number from the user, save as Height
		int Height = 25;
		// compute 1/2(Length(Height-Width) + SqFtOfOneSide, save as SqFtPeakSide
		double SqFtPeakSide = (Length*(Height-Width))/2 + SqFtOfOneSide;
		// multiply SqFtPeakSide by 2, save as SqFtOtherHalf
		double SqFtOtherHalf = SqFtPeakSide * 2;
		// add SqFtOfHalfHouse and SqFtOtherHalf, save as TotalSQFT
		double TotalSQFT = SqFtOfHalfHouse + SqFtOtherHalf;
		// compute LengthDoor * HeightDoor * Doors, save as SqFtDoors
		double SqFtDoors = LengthDoor * HeightDoor * Doors;
		// compute LengthWindow * HeightWindow * Windows, save as SqFtWindows
		double SqFtWindows = LengthWindow * HeightWindow * Windows;
		// compute TotalSQFT - SqFtDoors + SqFtWindows, save as SqFtPainted
		double SqFtPainted = TotalSQFT - (SqFtDoors + SqFtWindows);
		// compute SqFtPainted * CostPerSqFt, save as userTotal
		double userTotal = SqFtPainted * CostPerSqFt;
		System.out.println("Please input Length of House: ");
		Length = IN.nextInt();
		System.out.println("Please input Width of House: ");
		Width = IN.nextInt();
		System.out.println("Please input cost per square foot: ");
		CostPerSqFt = IN.hashCode();
		System.out.println("Please input number of windows: ");
		Windows = IN.nextInt();
		System.out.println("Please input length of windows: ");
		LengthWindow = IN.nextInt();
		System.out.println("Please input height of windows: ");
		HeightWindow = IN.nextInt();
		System.out.println("Please input number of doors: ");
		Doors = IN.nextInt();
		System.out.println("Please input length of doors: ");
		LengthDoor = IN.nextInt();
		System.out.println("Please input height of doors: ");
		HeightDoor = IN.nextInt();
		System.out.println("Sq. Ft of One Side is: ");
		SqFtOfOneSide = IN.nextInt();
		System.out.println("Sq. Ft of Half the House is: ");
		SqFtOfHalfHouse = IN.nextInt();
		System.out.println("Please input the height of house: ");
		Height = IN.nextInt();
		System.out.println("Sq. Ft of the Peak Side is: ");
		SqFtPeakSide = IN.nextInt();
		System.out.println("Sq. ft of other half of house is: ");
		SqFtOtherHalf = IN.nextInt();
		System.out.println("Total Sq. Ft is: ");
		TotalSQFT = IN.nextInt();
		System.out.println("Sq. Ft of Windows: ");
		SqFtWindows = IN.nextInt();
		System.out.println("Total Sq. Ft Painted: ");
		SqFtPainted = IN.nextInt();
		System.out.println("Your total cost is: ");
		userTotal = IN.nextInt();
		
		
	}

}
