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
	public String findFirstVowel(String word)
	{
		String firstVowel = "";
		int index = 0;
		while(index < word.length())
		{
			if(word.substring(index, index + 1).equals("a"))
			{
				firstVowel = firstVowel;
				return firstVowel;
			}
			else
			{
				firstVowel = firstVowel + word.substring(index, index +1);
			}
			index++;
		}
		return firstVowel;	
	}
}
