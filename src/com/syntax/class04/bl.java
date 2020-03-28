import java.util.Scanner;
class Main {
  public static void  main(String [] args ){
  Scanner in = new Scanner(System.in);
  
		System.out.println("Input the boolean value");
		boolean n  = in.nextBoolean();
		if(n){
				System.out.println("The value is true");
			
		}else {
		
		System.out.println("The value is false");
		}
		} 
}