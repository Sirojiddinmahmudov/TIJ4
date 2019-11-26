import java.util.Scanner;
public class Dec2Bin{
	public static void main(String... args){
		Scanner in = new Scanner(System.in);
		byte num = in .nextByte();
		String strVal = Integer.toBinaryString(num);
		System.out.println("Decimal " + num+ " = "+"Binary "+ strVal);
		in.close();
	}
}

