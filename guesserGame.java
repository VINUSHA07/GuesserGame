
import java.util.Scanner;

class Guesser{
	
	int num;
	int guesserNum()
	{
		
		condition();
		return num;
		
	}
	void condition() 
	{
		System.out.println("Guesser guess the Number in between 0 and 100 ");	
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num>=0 && num<=100)
		{
			System.out.println("Okay");		
		}
		else
		{
			System.out.println("Please kindly guess the number in the range");
			condition();
		}
		
	}
}

class Player{
	
	int num;
	int n=65;
	char c;
	int playerNum()
	{
		c= (char) n;
		condition();
		n = n+1;
		return num;
		
		
	}
	void condition() 
	{
		System.out.println("Player " +c +" guess the Number in between 0 and 100 ");	
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num>=0 && num<=100)
		{
			System.out.println("Okay");		
		}
		else
		{
			System.out.println("Please kindly guess the number in the range");
			condition();
		}
		
	}
}

class Empire{
	
	int num,a,b,c;
	
	void guesserCollection()
	{
		
		Guesser obj = new Guesser();
		num= obj.guesserNum();
		playerCollection();
		
	}
	void playerCollection() 
	{
		
		Player obj1 = new Player();
		a = obj1.playerNum();		
		b = obj1.playerNum();
		c = obj1.playerNum();
		compare();
	}
		
	void compare() {
		
		if(num==a) 
		{
			if(num==b&&num==c)
				System.out.println("All the Players guessed correctly.");
			else if(num==b)
				System.out.println("Both Player A and B guessed correctly.");
			else if(num==c)
				System.out.println("Both Player A and C guessed correctly.");
			else
				System.out.println("Player A is the Winner");
		}
		else if(num==b)
		{
			if(num==c)
				System.out.println("Both Player B and C guessed correctly.");
			else
				System.out.println("Player B is the Winner");
				
		}			
		else if(num==c)
			System.out.println("Player C is the Winner");
		else
		{
			System.out.println("None of the answer is correct.");
		//	System.out.println();
			System.out.println("Try Again");
			System.out.println();
			playerCollection();
		
		
		}
	}
	
}


public class guesserGame {

	public static void main(String[] args) {
		Empire obj = new Empire();
		obj.guesserCollection();
		

	}

}
