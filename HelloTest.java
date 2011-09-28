import static org.junit.Assert.*;

import org.junit.Test;


public class HelloTest 
{

	@Test
	public void testSayHello() 
	{
		Hello helloObject = new Hello();
		assertEquals("Hello World", helloObject.sayHello());
	}

}