import java.util.ArrayList;
public class StringList 
{
	private ArrayList<String> list;
	public StringList()
	{
		list = new ArrayList<String>();
	}
	public void addWord(String word)
	{
		list.add(word);
	}
	public String toString()
	{
		String str = "";
		for(String strings : list)
		{
			str += strings + "\n";
		}
		return str;
	}
	public String reverse(String word)
	{
		String reverse = "";
		int index = 0;
		while(index < word.length())
		{
			reverse = reverse + word.substring(index, index+1);
			
			index++;
		}
		return reverse;
	}
	public int findFirstVowel(String word)
	{
		int firstVowel = -1;
		int index = 0;
		while(index < word.length())
		{
			if(word.substring(index, index + 1).equals("a"))
			{
				firstVowel = index;
			}
			else if(word.substring(index, index + 1).equals("e"))
			{
				firstVowel = index;
			}
			else if(word.substring(index, index + 1).equals("i"))
			{
				firstVowel = index;
			}
			else if(word.substring(index, index + 1).equals("o"))
			{
				firstVowel = index;
			}
			else if(word.substring(index, index + 1).equals("u"))
			{
				firstVowel = index;
			}
			if(firstVowel > -1)
			{
				return firstVowel;
			}
			index++;
		}
		return firstVowel;	
	}
	public String pigLatin(String word)
	{
		int index = 0;
		while(index < list.size)
		{
			if(word.substring(index, index + 1).equals("e"))
			{
				esFront = "e" + esFront;
			}
			else
			{
				esFront = esFront + word.substring(index, index +1);
			}
			index++;
		}
	}
}
