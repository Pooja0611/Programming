package com.BridgeLabz.test;

import com.BridgeLabz.basics.StopWatch;
import com.BridgeLabz.util.UtilClass;

public class TestStopWatch {

	public static void main(String[] args) {
	 int ch=0;
	 while(ch!=4)
	 {
		 System.out.println("press 1 to start");
		 System.out.println("press 2 to stop");
		 System.out.println("press 3 to get elapsed time!");
		 ch=UtilClass.IntInput();
		 switch(ch)
		 {
		 
	                case 1:
				    StopWatch.start();
			        break;
			        case 2:StopWatch.stop();
			        break;
			        case 3:StopWatch.elapseTimer();
			        break;
			        default:System.out.println("pls provide proper i/p!!");
			        break;
		 }
	 }
	}

}
