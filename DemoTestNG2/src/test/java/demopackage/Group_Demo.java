package demopackage;

import org.testng.annotations.Test;

public class Group_Demo {
	
	@Test(groups= {"smoke"})
	public void tc1() {
		System.out.println("This is tc1 logic");
		System.out.println("first change done");
	}
	
	@Test(groups= {"sanity"})
	public void tc2() {
		System.out.println("This is  tc2 logic");
	}
	
	@Test(groups= {"smoke","sanity"})
	public void tc3() {
		System.out.println("This is tc3 logic");
	}
	
	@Test(groups= {"sanity"})
	public void tc4() {
		System.out.println("This is tc4 logic");
	}
	
	@Test(groups= {"regeression"})
	public void tc5() {
		System.out.println("This is tc5  logic");
	}
}
