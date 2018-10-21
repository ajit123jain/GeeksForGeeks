import java.util.Scanner;
public class First {
	public static void main(String args[]){
	  int [] count = new int[10];	
	  Scanner scanner = new Scanner(System.in);
	  String s = scanner.nextLine();
      System.out.println("Ajit");
      for (int i=0; i<25;i++) {
      	 System.out.println("Hello "+i);
      }

      for(int i=0; i<s.length(); i++){
      	System.out.println(s.charAt(i));
      }

	}



}