package hw2;

public class Card{

    private String suit;
    private int value;

    public Card(int val, String s)
    {
	suit = s;
	value = val;

    }
    public String toString()
    {
	String tmp =Integer.toString(this.value);
	tmp += this.suit;
	return tmp;
	
    }
    public int getval()
    {
	return value;
    }

}
    
