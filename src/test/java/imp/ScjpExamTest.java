/**
 * 
 */
package imp;

import static org.junit.Assert.*;
import imp.ScjpExam;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Ramesh
 *
 */
public class ScjpExamTest {
	ScjpExam<Integer> sc;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		sc = new ScjpExam<Integer>(10);
	}

	/**
	 * Test method for {@link imp.ScjpExam#getDouble()}.
	 */
	@Test
	public void testGetDouble() {
		assertTrue("failed to verify double value", sc.getDouble() == 10);
	}

}
