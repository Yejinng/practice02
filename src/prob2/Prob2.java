package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");

		int inputNumber = scanner.nextInt();

		int sum = 0;
		if(inputNumber % 2 ==0)	{
			for (int i = 0; i <= inputNumber; i=i+2 ) {
				sum += i;
				
			}	
		}
		else if (inputNumber % 2 != 0) {
			
			for (int i = 1; i <= inputNumber; i=i+2 ) {
				sum += i;
				
			}	
		}
		
		System.out.println(sum);
		scanner.close();
	}

}
