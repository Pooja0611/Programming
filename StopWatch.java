package com.BridgeLabz.basics;

public class StopWatch {
private static long startTimer=0;
private static long stopTimer=0;
private static long elapseTimer=0;

public static void start()
{
	startTimer=System.currentTimeMillis();
	System.out.println("starttimer "+startTimer/1000);
}
public static void stop()
{
	stopTimer=System.currentTimeMillis();
	System.out.println("stoptimer "+stopTimer/1000);
}
public static void elapseTimer()
{
	elapseTimer=stopTimer-startTimer;
	System.out.println("elapsedtimer "+elapseTimer/1000);
}

}
