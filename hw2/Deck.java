package hw2;

import java.util.ArrayList;
import java.util.Random;

public class Deck extends ArrayList<Card>
{

    public Deck()
    {
	super();
	String[] type={"C","H","D","S"};
	    for(int i=0;i<4;i++)
		{
		    for(int x=1; x<14;x++)
			{
			     
			    this.add(new Card(x,type[i]));
			}
		}
	
    }
    public Deck(ArrayList<Card> tmp)
    {
    	super();
    	for(int i=0; i<tmp.size();i++)
    	{
    		this.add(tmp.get(i));
    		
    	}
    	
    	
    }
    public static Deck makeempty()
    {
    	ArrayList<Card> tmp = new ArrayList<Card>();
    	Deck tmp2 = new Deck(tmp);
    	return tmp2;
    	
    }
    
    public Card draw()
    {
    	Card drawn = this.get(0);
    	this.remove(0);
    	
    	return drawn;
    }

    public void shuffle()
    {
    	Random ran = new Random();
    	for(int i=0;i<this.size(); i++)
    	{
    		
    		int x = ran.nextInt(this.size()-i)+i;
    		Card tmp = this.get(x);
    		this.set(x, this.get(i));
    		this.set(i, tmp);
    		
    		
    	}
    
    }
    


}
	
    
