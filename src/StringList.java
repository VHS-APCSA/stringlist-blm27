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
			System.out.println(word.substring(index +1, index));
			
			index++;
		}
		return reverse;
	}
	public String findFirstVowel()
	{
		
	}
}
