package com.BridgeLabz.basics;

import java.util.Scanner;

import com.BridgeLabz.util.UtilClass;

public class UserName_Replace {
	  public static void main(String[] args)
	   {
		   System.out.println("pls enter the user name!");
		   String s1=UtilClass.StringInput();
		   String s="Hello <<UserName>>, How are you?";
		   String temp="";
		   if(s1.length()>=3)
		   {
			   temp= s.replace("<<UserName>>",s1 );
			   System.out.println(temp);
		   }
		   else
		   {
			   System.out.println("pls enter more than 3 characters!!");
		   }
		  
	   }
}
