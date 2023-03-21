package demopackage;

import org.testng.annotations.Test;

public class Group_Demo1 {
	
	@Test(groups= {"smoke"})
	public void tc6() {
		System.out.println("This is tc6 logic");
	}
	
	@Test(groups= {"sanity"})
	public void tc7() {
		System.out.println("This is  tc7 logic");
	}
	
	@Test(groups= {"smoke","sanity"})
	public void tc8() {
		System.out.println("This is tc8 logic");
	}
	
	@Test(groups= {"sanity"})
	public void tc9() {
		System.out.println("This is tc9 logic");
	}
	
	@Test(groups= {"regeression"})
	public void tc10() {
		System.out.println("This is tc10 logic");
	}
}
