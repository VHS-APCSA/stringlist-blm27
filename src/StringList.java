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
	@Override
	public String toString()
	{
		String str = "";
		for(String strings : list)
		{
			str += strings + " ";
		}
		return str;
	}
	public void reverseWords()
	{
		int index = 0;
		while(index < list.size())
		{
			String word = list.get(index);
			String rev = reverse(word);
			list.set(index, rev);
			
			index++;
		}
	}
	public void pigLatinWords()
	{
		int index = 0;
		while(index < list.size())
		{
			String word = list.get(index);
			String pig = pigLatin(word);
			list.set(index, pig);
			
			index++;
		}
	}
	public String reverse(String word)
	{
		String reverse = "";
		int index = 0;
		while(index < word.length())
		{
			reverse = word.substring(index, index+1) + reverse;
			
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
		int firstVowelIndex = findFirstVowel(word);
		word = word.substring(firstVowelIndex) + word.substring(0, firstVowelIndex) + "ay";
		return word;
	}
	
		
}
