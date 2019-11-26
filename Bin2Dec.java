import java.util.Scanner;
public class Bin2Dec{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		String num = in.next();
		System.out.println(num.length());
		int binNum = Integer.parseInt(num,2);	
		System.out.println(binNum);
		in.close();
	}
}

