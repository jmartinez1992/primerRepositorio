import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Prueba {
	
	private BinaryString bitset1, bitset2;
	private String pruebaString2 = "1010101010";
	
	@Before
	public void antesDelTest(){
		bitset1 = new BinaryString(10);
		bitset2 = new BinaryString(pruebaString2);

	}
	
	
	@Test
	public void testLenght(){
		assertEquals(10, bitset1.lenght());
		assertEquals(10, bitset2.lenght());
	}


}
