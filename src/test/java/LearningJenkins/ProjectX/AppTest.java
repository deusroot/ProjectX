package LearningJenkins.ProjectX;

import static org.junit.Assert.assertEquals;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	Learning obj=new Learning();
		int res=obj.add(50,70);
		assertEquals(120,res);
    }
    
    public void AddTest2()
	{
		Learning obj=new Learning();
		String res=obj.concatenation("Hello ", "World!");
		assertEquals("Hello World!",res);
	}
    
}
