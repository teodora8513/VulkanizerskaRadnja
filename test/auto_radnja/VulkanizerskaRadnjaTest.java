package auto_radnja;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VulkanizerskaRadnjaTest extends RadnjaInterfaceTest {

	@BeforeEach
	void setUp() throws Exception {
		super.setUp();
		radnja = new VulkanizerskaRadnja();
	}

	@AfterEach
	void tearDown() throws Exception {
		super.tearDown();
		radnja = null;
	}

	@Test
	void testDodajGumu() {
		
	}

	@Test
	void testPronadjiGumu() {
		
	}

}
