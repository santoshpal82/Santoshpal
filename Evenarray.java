package SDemo;
import java.util.Scanner;
import java.util.ArrayList;

public class Evenarray {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		ArrayList<Integer> numbers =new ArrayList<>();
		System.out.println("Enter Nunmber ");
		
		while(obj.hasNextInt()) {
			numbers.add(obj.nextInt());
			
			ArrayList<Integer> evenNumbers =new ArrayList<>();
			int sum =0;
			
			for (int number : numbers) {
				if (number % 2 ==0) {
					evenNumbers.add(number);
					sum += number;
				}
			}
			
			System.out.println("Even number: "+ evenNumbers);
			
			System.out.println("Sum of even number: "+ sum);
			
			obj.close();
		}
	}

}
