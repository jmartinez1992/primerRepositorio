import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Prueba {
	
	private BinaryString bitset1, bitset2, bitset3, bitset4;
	private String pruebaString2 = "1010101010", pruebaString3 = "100101", pruebaString4 = "0110101";
	
	@Before
	public void antesDelTest(){
		bitset1 = new BinaryString(10);
		bitset2 = new BinaryString(pruebaString2);
		bitset3 = new BinaryString(pruebaString3);
		bitset4 = new BinaryString(pruebaString4);


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
	
	@Test(expected = BinaryStringException.class)
	public void testGetOutOfLimitBit(){
		bitset4.get(56);
	}
	
	@Test(expected = BinaryStringException.class)
	public void testSetOutOfLimitBit(){
		bitset4.set(56, '0');
	}
	
	@Test
	public void testSetOutOfLimitBitV2(){
		try{
			bitset4.set(56, '0');
			fail("Se esperaba excepcion BinaryStringException");
		} catch(BinaryStringException e){
			
		}
		
	}

}
