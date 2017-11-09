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
		String rev = list.reverse(word);
		System.out.println("Reverse string: " + rev);
		String pig = list.pigLatin(word);
		System.out.println("Pig latin: " + pig);
	}
}
