import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Prueba {
	
	private BinaryString bitset1, bitset2, bitset3;
	private String pruebaString2 = "1010101010", pruebaString3 = "100101";
	
	@Before
	public void antesDelTest(){
		bitset1 = new BinaryString(10);
		bitset2 = new BinaryString(pruebaString2);
		bitset3 = new BinaryString(pruebaString3);

	}
	
	
	@Test
	public void testLenght(){
		assertEquals(10, bitset1.lenght());
		assertEquals(10, bitset2.lenght());
		
	}
	
	@Test
	public void testSetBit(){
		bitset3.set(1,'1');
		assertEquals('1', bitset3.get(1));
	}


}
