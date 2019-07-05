package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import JavaWk2Assessment.Swamp;

//import main.OfflineExercises;

public class Test2 {
	
	Swamp s = new Swamp();
	
	@Test
	public void testMap() {
		
		s.theMap("north");
		
//		assertEquals("enter 1 in console",int yaxis+1,s.testNorth());
				
	}
	
	@Test
	public void test1() {
		
		assertEquals("enter 1 in console","pass",s.event(0));
				
	}
	
	@Test
	public void test2() {
		
		assertEquals("enter 2 in console","fail",s.event(0));
				
	}
	
	@Test
	public void test3() {
		
		assertEquals("enter 2 in console","pass",s.event(1));
				
	}
	@Test
	public void test4() {
		
		assertEquals("enter 1 in console","fail",s.event(1));
				
	}
	
	@Test
	public void test5() {
		
		assertEquals("enter 2 in console","pass",s.event(2));
				
	}
	@Test
	public void test6() {
		
		assertEquals("enter 1 in console","fail",s.event(2));
				
	}

	


}
