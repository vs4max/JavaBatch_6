import java.util.Scanner;
class iAmIdiotAskInstructor
 {
  public static void main (String [] args ){
    
    Scanner scan = new Scanner(System.in);
		
		System.out.println("Plase enter a number ");
		int num = scan.nextInt();
		
		if(num%2==0) {
			System.out.println("Value is even ");
		if (num>1000 ){
			System.out.println("Even value is large ");
		}else {
			System.out.println("Even value is just right");
		}
		
		}else {
			System.out.println("Value is odd");
		}	
		
	}
}