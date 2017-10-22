# StringList
Create a StringList class that contains an ArrayList that holds String objects
Make a constructor that takes no parameters and initializes the ArrayList
Write an addWord() method that takes a String parameter and adds it to the ArrayList
Write a toString() method that returns the list contents as a String.
Write a reverse() method that iterates over the ArrayList and replaces each word with its reverse.
You will have to use a while() loop to iterate over the ArrayList since you can't modify list elements inside a for loop.
Write a findFirstVowel() method that takes a String parameter and returns the index of the first vowel in the word.
Use indexOf() to find the index of "a", "e", "i", "o" and "u" and return the smallest positive number.
Write a pigLatin() method that 
  iterates over all of the words in the ArrayList using a while loop
  calls findFirstVowel on each word to find the index of the first vowel in the word
  converts the word into pig latin by moving all of the consonants in front of the vowel
  to the end of the word and adding -ay
  so "strength" turns into "engthstray" and "please" turns into "easeplay"
  If the word already starts with a vowel then -ay is added to the end, "apple" -> "appleay"
  All of the words in the ArrayList should be replaced with their pig latin equivalents at the end.

Write a StringListRunner that uses a Scanner to take text input from the user.
Use a while() loop that takes input and adds it to the StringList until the user enters the word "quit".
Use "quit" as a sentinal value that is tested in the parentheses of the while() loop.
After the words have been added to the list do the following:
  print the list
  call reverse() on the list and print it again
  call pigLatin() on the reversed list and print it
