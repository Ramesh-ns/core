package all;

import junit.framework.TestCase;

public class TestFailure extends TestCase {
public void testFailure() throws Exception{
	fail();
}
	protected void setUp() throws Exception {
		super.setUp();
	}

}
