package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class MyHooks {

	@Before (order =1)
	//@Before ("@regression")
	public void BeforeHook1()
	{
		System.out.println("Before Hook Method1");
	}
	
	@Before (order =2)
	//@Before("@feature1")
	public void BeforeHook2()
	{
		System.out.println("Before Hook Method2");
	}
	
	@After (order =1)
	//@After ("@sanity")
	public void AfterHook1()
	{
		System.out.println("After Hook Method1");
	}

	@After (order =2)
	public void AfterHook2()
	{
		System.out.println("After Hook Method2");
	}
	
	@BeforeStep
	public void BeforeStepHook()
	{
		System.out.println("Before Steps Method");
	}
	
	@AfterStep
	public void AfterStepsHook()
	{
		System.out.println("After Steps Method");
	}
}
