import  java.util.Scanner;
public class AsignTwoThree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();

		System.out.println("Enter the value of c:");
		int c =sc.nextInt();
		
	
		//Comapring the value of a with b&c
		if(a > b && a > c){
			System.out.println(a);
		}
		else if(b > a && b >c){
			System.out.println(b);
			
		}
		else 
			System.out.println(c);

	}

}