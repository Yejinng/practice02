package prob3;
import java.util.Scanner;


public class Prob3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		System.out.print( "문자열을 입력하세요:" );
		
		String s = scanner.nextLine();
		
		/*  나머지 코드를 구현합니다. */
		char[] a = s.toCharArray();
		for(int i=0; i<=s.length(); i++)	{
			for( int j=0; j>=i; j++)	{
				int k = i + j+ -1;
			 
			}
			
		}
		
		scanner.close();
	}
}
