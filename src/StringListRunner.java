import java.util.Scanner;
public class StringListRunner
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		StringList list = new StringList();
		String word = "";
		while(!word.equals("quit"))
		{
			
			System.out.println("Enter words. " + "Type quit when finished.");
			word = input.nextLine();
			if(!word.equals("quit"))
			{	
				list.addWord(word);
			}	
		}
		System.out.println(list);
		list.reverseWords();
		System.out.println(list);
		list.pigLatinWords();
		System.out.println(list);
	}
}
