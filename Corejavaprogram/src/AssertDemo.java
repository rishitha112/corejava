import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.Test;

public class AssertDemo {
	@Test
	public void testforassertequal() {
		int res=1;
		int exp=1;
		
		assertEquals(res, exp);
	}
		@Test
		void testassertTrue() {
			assertTrue("hello" . contains("i"));
		}
		@Test
		void testnull() {
			String n="j";
			assertNull(" ");
		}


}
