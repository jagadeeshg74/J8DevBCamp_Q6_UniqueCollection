package yaksha;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.Arrays;

import org.junit.jupiter.api.Test;


import yaksha.*;


public class MainClassTest {
	
	@Test
	public void testOrderElementsOne() throws IOException {
		
		assertArrayEquals(new String[]{"AAA","ABC","abc"},MainClass.orderElements(new String[] {"abc","ABC","AAA","AAA"}));
		assertArrayEquals(new String[] {"A","AAA","Abc","BBB","aaa","b"},
				MainClass.orderElements(new String[] {"AAA","BBB","aaa","AAA","Abc","A","b"}));
		
		String [] a1=new String[]{"AAA","ABC","abc"};
		String [] a2 = MainClass.orderElements(new String[] {"abc","ABC","AAA","AAA"});
		
		
		TestUtils.yakshaAssert(TestUtils.currentTest(), Arrays.deepEquals(a1, a2)== true ?"true":"false", TestUtils.businessTestFile );
		
		
		
	
	}
	
	@Test
	public void testOrderElementstwo() throws IOException {
		
		//assertArrayEquals(new String[]{"AAA","ABC","abc"},MainClass.orderElements(new String[] {"abc","ABC","AAA","AAA"}));
		//assertArrayEquals(new String[] {"A","AAA","Abc","BBB","aaa","b"},
			//	MainClass.orderElements(new String[] {"AAA","BBB","aaa","AAA","Abc","A","b"}));
		
		String [] a1= new String[] {"A","AAA","Abc","BBB","aaa","b"};
		String [] a2 = MainClass.orderElements(new String[] {"AAA","BBB","aaa","AAA","Abc","A","b"});
		
		
		TestUtils.yakshaAssert(TestUtils.currentTest(), Arrays.deepEquals(a1, a2)== true ?"true":"false", TestUtils.businessTestFile );
		
		
		
	
	}
	
	
	
	
}	