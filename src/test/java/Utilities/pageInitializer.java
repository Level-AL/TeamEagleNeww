package Utilities;

import pages.AlexsFactory;
import pages.HamadsFactory;
import pages.NaidansFactory;
import pages.NaransFactory;
import pages.NurbiyesFactory;
import pages.ShahzaibsFactory;
import pages.SyedsFactory;
import pages.TrooksFactory;
import pages.ZakirsFactory;

public class pageInitializer extends driverClass {
	
	public static SyedsFactory syedsfactory;
	public static HamadsFactory hamadsfactory;
	public static ShahzaibsFactory shahzaibsfactory;
	public static ZakirsFactory zakirsfactory;
	public static NurbiyesFactory nurbiyesfactory;
	public static TrooksFactory trooksfactory;
	public static NaidansFactory naidansfactory;
	public static NaransFactory naransfactory;
	public static AlexsFactory alexsfactory;
	public static void initialize() {
	   syedsfactory = new SyedsFactory();
	   hamadsfactory = new HamadsFactory();
	   shahzaibsfactory = new ShahzaibsFactory();
	   zakirsfactory = new ZakirsFactory();
	   nurbiyesfactory = new NurbiyesFactory();
	   trooksfactory = new TrooksFactory();
	   naidansfactory = new NaidansFactory();
	   naransfactory = new NaransFactory();
	   alexsfactory = new AlexsFactory();
	}
}
