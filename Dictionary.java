package week7;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

private int c=0;	
private HashMap<String,String> dictionary;
private ArrayList<String> translations;

public Dictionary()
{
	dictionary=new HashMap<String,String>();
}
public void add(String word, String translation)
{
	dictionary.put(word, translation);
	c++;
}

public String translate(String word)
{
	return dictionary.get(word);
}
public int amountOfWords()
{
	return c;
}
public ArrayList<String> translationList()
{
	translations=new ArrayList<String>();
	for(String key: dictionary.keySet())
	{
		translations.add(key+"="+dictionary.get(key));
	}
	return translations;
}
}
