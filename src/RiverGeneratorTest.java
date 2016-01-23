import static org.junit.Assert.*;

import org.junit.Test;

public class RiverGeneratorTest {
	
	public static final boolean T = true;
	public static final boolean F = false;

	@Test
	public void test() {
		assertEquals("Woot \n",1,1);
		assertEquals("Woo \n",2,1);
	}
	
	@Test
	public void test1() {
		assertEquals("Woot",1,2);
		assertEquals("Woo",2,1);
	}

}
