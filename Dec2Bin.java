import java.util.Scanner;
public class Dec2Bin{
	public static void main(String... args){
		Scanner in = new Scanner(System.in);
		byte byteNum = in .nextByte();
		String strVal = Integer.toBinaryString(byteNum);
		System.out.println("Decimal " + byteNum+ " = "+"Binary "+ strVal);
		in.close();
	}
}

