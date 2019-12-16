package com.BridgeLabz.AlgorithmBased;

public class Util {
/*
 * 1.day of week
 */
	public static int dayOfWeek(int d,int m,int y)
	{
		//Gregorian calender where / denotes integer division
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}
	/*
	 * 2.temperature conversion
	 */
	 public static int temperatureConversion(int temp,char t)
	 {
		 int conver;
		 if(t=='c' || t=='C')
		 {
			 conver=(temp*9/5)+32;
		 }
		 else if(t=='f' || t=='F')
		 {
			 conver=(temp-32)*5/9;
		 }
		 else
		 {
		 System.out.println("Enter correct input");
		 return 0;
		 }
		 return conver;
	 }
	 /*
	  * 3.monthly payment
	  */
	 public static double monthlyPayment(double p,double y,double r)
	 {
		 double n=12*y;
		 double r0=r/100;
		 double payment=(p*r0)/(1-Math.pow((1+r0),-n));
		 return payment;
	 }
	 /*
	  * 4.sqrt program
	  */
	 public static double sqrt(double c)
	 {
		 double t=c;
		 double epsilon=1e-15;
		 while(Math.abs(t-c/t)>epsilon*t)
		 {
			 t=(c/t+t)/2;
		 }
		 return t;
	 }
	 /*
	  * 5.to binary
	  */
	 public static void toBinary(int d)
	 {
		 String bin="";
		 while(d!=0)
		 {
			 bin=(d%2)+bin;
			 d/=2;
		 }
		 while(bin.length()%4!=0)
		 {
			 bin=0+bin;
		 }
		System.out.println(bin);
	 }
	
	 /*
	  * 6.to decimal
	  */
	 public static int toDecimal(int[] binary)
	 {
		 int dec=0,j=0;
		 for(int i=binary.length-1;i>=0;i--)
		 {
			 if(binary[i]==1)
			 {
				 dec=dec+(int)Math.pow(2, j);
			 }
			 j++;
		 }
		 return dec;
	 }
}
