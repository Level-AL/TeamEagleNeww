package Utilities;

import pages.brandNavigation;
import pages.filterSettings;
import pages.sortingByRelevance;

public class pageInitializer extends driverClass {
	
	public static filterSettings fs;
	public static brandNavigation bn;
	public static sortingByRelevance sbr;
	public static void initialize() {
		fs = new filterSettings();
		bn = new brandNavigation();
	   sbr = new sortingByRelevance();
	}
}
