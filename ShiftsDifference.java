import java.util.Scanner;
class ShiftsDifference{
	public static void main(String ... args){
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println(num +" >>   "+ 2 +" = " + Integer.toBinaryString( num >> 2));
		System.out.println(num + " >>> "+ 2 + " =  " + Integer.toBinaryString( num >>> 2));
		in.close();
	}
}
