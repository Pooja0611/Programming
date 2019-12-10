package com.BridgeLabz.basics;

public class WindChillProgram {

	public static void main(String[] args) {
		double t=Double.parseDouble(args[0]);
		double v=Double.parseDouble(args[1]);
		
		if(t<50 && (v>3 || v<120))
		{
			double w=35.74+0.62158*t+((0.4275 * t - 35.75) * Math.pow(v, 0.16));
			System.out.println(w);
		}
		else
		{
			System.out.println("t cannot be more then 50 and speed of the wind cannot be more then 120 or less then 3!! ");
		}
		
		
	}

}
