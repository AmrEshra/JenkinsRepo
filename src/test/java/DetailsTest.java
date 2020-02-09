import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DetailsTest {

	@Test
	public void testMyName() {
		assertEquals("Farida", Details.getMyName());
	}
	
	@Test
	public void testYourName() {
		assertEquals("Farida", Details.getMyName());
	}
}
