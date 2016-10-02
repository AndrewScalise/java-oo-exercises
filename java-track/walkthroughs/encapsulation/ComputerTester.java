package encapsulation;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComputerTester {

	@Test
	public void testAddMemory() {
		Computer c = new Computer(4, 100, 100, "Lenovo");
		assertTrue("Problem setting memory in the constructor", c.getMemory()== 4);
		c.addMemory(2);
		assertTrue("Problem updating memory in addMemory()", c.getMemory() == 6);
	}
	
	@Test
	public void testAddMemoryMax() {
		Computer c = new Computer(32, 100, 100, "Lenovo");
		assertTrue("Problem setting memory in the constructor", c.getMemory()== 32);
		c.addMemory(2);
		assertTrue("Problem updating memory in addMemory(), when we hit the maximum allowed memory", c.getMemory() == 32);
	}

}
