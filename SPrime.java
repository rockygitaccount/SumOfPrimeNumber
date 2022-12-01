package a;

import java.util.Scanner;

public class SPrime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int sum = 0;
		for (int i = 0; i <=num2; i++) {
			int n = i;
			int temp = 0;
			int a = 2;
			
			while(a<=(n/2)) {
				if((n%a)==0) {
					temp++;
					break;
				}
				a++;
			}
			if(temp==0 && i!=1) {
				sum = sum+i;
			}
		}
		System.out.println("The sum of all prime number is:"+sum);
	}
}
