package book;

import java.util.Scanner;

public class BookInputTest {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
	
		Book myBook=new Book();
Scanner sc=new Scanner(System.in);
Scanner scan =new Scanner(System.in);	

			System.out.println("Please enter the tittle of the book");
			myBook.tittle=sc.nextLine();
			
	System.out.println("Please enter the authors name");
	myBook.author=sc.nextLine();
	
	
	System.out.println("Please enter the number of pages");
	myBook.numberofpages=scan.nextInt();
	
	
	System.out.println("The book tittle is:"+myBook.tittle);	
	System.out.println("The book author is:"+myBook.author);	
	System.out.println("The book has:"+myBook.numberofpages + "pages");
	}

}
