package prob4;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액:");
		int i = scanner.nextInt();
		
		int a = i / 50000;
		int b = (i%50000) / 10000;
		int c = ((i%50000) % 10000) / 5000;
		int d = (((i%50000) % 10000) % 5000) / 1000;
		int e = ((((i%50000) % 10000) % 5000) % 1000) / 500;
		int f = (((((i%50000) % 10000) % 5000) % 1000) % 500) / 100;
		int g = ((((((i%50000) % 10000) % 5000) % 1000) % 500) % 100) / 50;
		int h = (((((((i%50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10;
		int j = ((((((((i%50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) % 10) / 5;
		int k = ((((((((i%50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) % 10) % 5;
		
		
		System.out.println("50000원" + a + "개");
		System.out.println("10000원" + b + "개");
		System.out.println("5000원" + c + "개");
		System.out.println("1000원" + d + "개");
		System.out.println("500원" + e + "개");
		System.out.println("100원" + f + "개");
		System.out.println("50원" + g + "개");
		System.out.println("10원" + h + "개");
		System.out.println("5원" + j + "개");
		System.out.println("1원" + k + "개");
		
	}
}

