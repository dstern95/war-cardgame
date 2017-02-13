package hw2;
//import java.util.ArrayList;
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
    	String test = "";
		Scanner scanner = new Scanner(System.in);

		int win = 0;
		int count =0;
		Deck warchest = new Deck(startdeck.makeempty());
    	while(!test.equals("q"))
    	{
    		count+=1;
    		
    		System.out.println("Press Enter to draw a card");
    		if (scanner.hasNextLine())
    		{
    			test = scanner.nextLine();
    		}
    		if (test.isEmpty())
    		{
    			Card p1c= new Card(0,"D");
    			Card p2c= new Card(0,"D");
    			if (p1.isEmpty()==false)
    			{
    				p1c = p1.draw();
    			}
    			else if(winp1.isEmpty()==false)
    			{
    				p1 = new Deck(winp1);
    				p1.shuffle();
    		    	winp1 = new Deck(startdeck.makeempty());
    				p1c = p1.draw();

    			}
    			else
    			{
    				win = 2;
    				test = "q";
    			}
    			if (p2.isEmpty()==false)
    			{
    				p2c = p2.draw();
    			}
    			else if(winp2.isEmpty()==false)
    			{
    				p2 = new Deck(winp2);
    				p2.shuffle();
    		    	winp2 = new Deck(startdeck.makeempty());
    				p2c = p2.draw();
    			}
    			else
    			{
    				win = 1;
    				test = "q";
    			
    			}
    			if (p1c.getval() > p2c.getval()&&win==0)
    			{
    				System.out.println(p1c+">"+p2c);
    				winp1.add(p1c);
    				winp1.add(p2c);
    				if (!warchest.isEmpty())
    				{
    					System.out.println(warchest.size()+" cards at stake not including "+p1c+" and "+p2c);

    					System.out.println("p1 won the war!");
    					while (!warchest.isEmpty())
    					{
    						winp1.add(warchest.draw());
    					}

    				}
        			System.out.println("p1 winnings: "+winp1.size()+" p2 winnings: "+winp2.size());
        			System.out.println("p1 size: "+p1.size()+" p2 size: "+p2.size());

    			}
    			else if (p1c.getval() < p2c.getval()&&win==0)
    			{
    				System.out.println(p1c+"<"+p2c);
    				winp2.add(p1c);
    				winp2.add(p2c);

    				if (!warchest.isEmpty())
    				{
    					System.out.println(warchest.size()+" cards at stake not including "+p1c+" and "+p2c);

    					System.out.println("p2 won the war!");
    					while (!warchest.isEmpty())
    					{
    						winp2.add(warchest.draw());
    					}

    				}
        			System.out.println("p1 winnings: "+winp1.size()+" p2 winnings: "+winp2.size());
        			System.out.println("p1 size: "+p1.size()+" p2 size: "+p2.size());

    			}
    			else if(win==0)
    			{
    				System.out.println(p1c+"<>"+p2c+"\n");

    				System.out.println("This means war!!!"+"\n");
    				warchest.add(p1c);
    				warchest.add(p2c);
        			System.out.println("p1 winnings: "+winp1.size()+" p2 winnings: "+winp2.size());
        			System.out.println("p1 size: "+p1.size()+" p2 size: "+p2.size());

    			}
    			System.out.print("\n");

    		}
    		
    	}
    	if (win==1)
    	{
    		System.out.println("Player 2 ran out of cards");
    		
    		System.out.println("Player 1 wins!");
    	}
    	else if(win==2)
    	{
    		System.out.println("Player 1 ran out of cards");

    		System.out.println("Player 2 wins!");

    	}
    	System.out.println("done in "+count+" moves");
    	//System.out.println(p1.size());
    	//System.out.println();
	
	}

}
