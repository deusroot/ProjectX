package LearningJenkins.ProjectX;


import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AddingTests {

	@Test
	public void AddTest1()
	{
		Learning obj=new Learning();
		int res=obj.add(50,70);
		assertEquals(120,res);
	}
	@Test
	public void AddTest2()
	{
		Learning obj=new Learning();
		String res=obj.concatenation("Hello ", "World!");
		assertEquals("Hello World!",res);
	}
}
