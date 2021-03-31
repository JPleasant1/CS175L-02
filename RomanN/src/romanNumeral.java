import java.util.Scanner;
public class romanNumeral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bb = new Scanner(System.in);
		
		
		int x = 0;
		String y = "";
		String z = "";
		String q = "";
		String w = "";
		System.out.println("Enter number you want to convert to roman numerals: ");
		x = bb.nextInt();
	
		if (x < 4000) {
					
					if (x >=3000) {
						if (x < 4000) {
						y = "MMM";
						x=x=3000;
						}
					}
					if (x >= 2000) {
						if (x < 3000) {
						y = "MM";
						x=x=2000;
						}
					}
					if (x >= 1000) {
						if (x < 2000) {
							y = "M";
							x=x-1000;
						}
					}
		}
		
				if (x >= 900) {
					if(x < 1000) {
						z = "CM";
						x=x-900;
					}
				}
				
				if (x >= 800) {
					if(x < 900) {
						z = "DCCC";
						x=x-800;
					}
				}
				if (x >= 700) {
					if(x < 800) {
						z = "DCC";
						x=x-700;
					}
				}
				if (x >= 600) {
					if(x < 700) {
						z = "DC";
						x=x-600;
					}
				}
				if (x >= 500) {
					if(x < 600) {
						z = "D";
						x=x-500;
					}
				}
				if (x >= 400) {
					if(x < 500) {
						z = "CD";
						x=x-400;
					}
				}
				if (x >= 300) {
					if(x < 400) {
						z = "CCC";
						x=x-300;
					}
				}
				if (x >= 200) {
					if (x<300) {
						z = "CC";
						x=x-200;
					}
				}
				if (x >= 100) {
					if (x < 200) {
						z = "C";
						x=x-100;
					}
				}
				
				if (x >= 90) {
					if (x < 100) {
						q = "XC";
						x=x-90;
					}
				}
				if (x >= 80) {
					if (x < 90) {
						q = "LXXX";
						x=x-80;
					}
				}
				if (x >= 70) {
					if (x < 80) {
						q = "LXX";
						x=x-70;
					}
				}
				if (x >= 60) {
					if (x < 70) {
						q = "LX";
						x=x-60;
					}
				}
				if (x >= 50) {
					if (x < 60) {
						q = "L";
						x=x-50;
					}
				}
				if (x >= 40) {
					if (x < 50) {
						q = "XL";
						x=x-40;
					}
				}
				if (x >= 30) {
					if (x < 40) {
						q = "XXX";
						x=x-30;
					}
				}
				if (x >= 20) {
					if (x < 30) {
						q = "XX";
						x=x-20;
					}
				}
				if (x >= 10) {
					if (x < 20) {
						q = "X";
						x=x-10;
					}
				}
				if (x <10) {
					if (x ==9) {
						w = "IX";
					}
				}
					if (x ==8) {
						w = "VIII";
					}

					if (x ==7) {
						w = "VII";
					}
					if (x ==6) {
						w = "VI";
					}
					if (x ==5) {
						w = "V";
					}
					if (x ==4) {
						w = "IV";
					}
					if (x ==3) {
						w = "III";
					}
					if (x ==2) {
						w = "II";
					}
					if (x ==1) {
						w = "I";
					}
					System.out.println(y + z + q + w);
	}
				
					
				
				
				}
				
				
