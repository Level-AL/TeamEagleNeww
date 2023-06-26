package Utilities;

import pages.brandNavigation;
import pages.filterSettings;
import pages.relevantProduct;
import pages.sortByRelevance;

public class pageInitializer extends driverClass {
	
	public static filterSettings fs;
	public static brandNavigation bn;
	public static sortByRelevance sbr;
	public static relevantProduct rp;
	public static void initialize() {
		fs = new filterSettings();
		bn = new brandNavigation();
	   sbr = new sortByRelevance();
	    rp = new relevantProduct();
	}
}
