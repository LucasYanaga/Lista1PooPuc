import java.util.Scanner;
import java.util.Arrays;

public class Ex08
{
	private static String vectSwap()
	{
		Scanner in = new Scanner(System.in);
		
		int v[] = new int[20];
		int vSwap[] = new int[20];
		
		for (int i = 0; i < v.length; i++)
		{
			System.out.print("Valor: " + (i+1) + ": ");
			v[i] = in.nextInt();
		}

		for (int i = 0; i < v.length; i++)
		{
			vSwap[i] = v[(v.length - 1) - i];			
		}
		
		return Arrays.toString(vSwap);
	}
	
	public static void main(String[] args)
	{
		System.out.println(vectSwap());
	}
}
