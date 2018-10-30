import java.util.Scanner;

import javax.swing.JFrame;

public class CatGenerator {
	static String greeting =("How many cats do you want?");
	
	static Scanner scan = new Scanner(System.in);
	
	 static int cat = scan.nextInt();
	static CatGenerator cats = new CatGenerator();

;

	public static void main(String[] args) {
		cats.addcats(cat);
		
	}

	public void addcats (int cat) {
	
		for(int i=0; i<cat; i++){
            System.out.println("cats");
       }
	
	}
}
