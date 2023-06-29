package Utilities;

import pages.SyedsFactory;

public class pageInitializer extends driverClass {
	
	public static SyedsFactory syedsfactory;
	public static void initialize() {
	   syedsfactory = new SyedsFactory();
	}
}
