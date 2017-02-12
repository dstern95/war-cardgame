package hw2;
import java.util.ArrayList;
import java.util.Scanner;
public class WAR {
    public static void main(String[] args)
    {

    	Deck startdeck = new Deck();
    	Deck p1 = new Deck(startdeck.makeempty());
    	Deck p2 = new Deck(startdeck.makeempty());	
    	Deck winp1 = new Deck(startdeck.makeempty());
    	Deck winp2 = new Deck(startdeck.makeempty());
    	startdeck.shuffle();
    	
    	for(int i = 0; i < 26; i++)
    	{
    		p1.add(startdeck.draw());
    		p2.add(startdeck.draw());
    		
    	}
    	System.out.println("hi");
    	String test = "";
		Scanner scanner = new Scanner(System.in);

	
    	while(!test.equals("q"))
    	{
    		
    	
    		
    		System.out.println("Press Enter to draw a card");
    		if (scanner.hasNextLine())
    		{
    			test = scanner.nextLine();
    		}
    		if (test.isEmpty())
    		{
    			Card p1c = p1.draw();
    			Card p2c = p2.draw();
    			if (p1c.getval() > p2c.getval())
    			{
    				System.out.println(p1c+">"+p2c);
    				winp1.add(p1c);
    				winp1.add(p2c);
    			}
    			else if (p1c.getval() < p2c.getval())
    			{
    				System.out.println(p1c+"<"+p2c);
    				winp2.add(p1c);
    				winp2.add(p2c);
    				
    			}
    			
    			System.out.println("p1 winnings: "+winp1.size()+" p2 winnings: "+winp2.size());
    			
    		}
    		
    	}
    	System.out.println("done");
    	//System.out.println(p1.size());
    	//System.out.println();
	
	}

}
