package com.BridgeLabz.AlgorithmBased;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SearchWordFile {
public static String[] fileRead(File f) throws IOException
{
	String word="";
	ArrayList<String> s1=new ArrayList<String>();
	FileReader fr=new FileReader(f);
	int x;
	while((x=fr.read())!=-1)
	{
		if(x==32)
		{
		 s1.add(word);
		 word="";	
		}
		else
		{
			word=word+String.valueOf((char)x);
		}	
	}
	fr.close();
	String[] s=new String[s1.size()];
	s1.toArray(s);
	return s;
}
}
