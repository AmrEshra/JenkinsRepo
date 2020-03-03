import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dal.Details;

public class DetailsTest {

	@Test
	public void testMyName() {
		assertEquals("Amr", Details.getMyName());
	}
	
	@Test
	public void testYourName() {
		assertEquals("Amr", Details.getMyName());
	}
}
