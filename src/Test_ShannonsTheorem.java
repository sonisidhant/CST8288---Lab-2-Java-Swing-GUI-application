package networktest;
    
import org.junit.Before;
	import org.junit.After;
	import org.junit.Test;
	import network.ShannonsTheorem;
	import static org.junit.Assert.*;

	public class Test_ShannonsTheorem {
		
		/**
		 * This class perform the JUnit Testing of ShannonsTheorem class whether the calculations of calculating maximum data rate is right 
	     * or wrong.
		 * @author Sidhant Soni
		 *
		 */
	private ShannonsTheorem theorem;
	         
	         /**
			 * 
			 * @throws Exception shannon Theorem class is null
			 */
			@Before
			public void setUp() throws Exception{
				theorem = new ShannonsTheorem();
				assertNotNull(theorem);
			}

			@After
			public void tearDown() throws Exception{
				theorem = null;
			}
			
			@Test
			public void testPositiveBandwidth(){
				theorem.setBandwidth(0);
				assertEquals(0, theorem.getBandwidth(), 0);
			}

			@Test
			public void testNegativeBandwidth(){
				try{
					theorem.setBandwidth(-2);
					assertTrue( false);
				}catch( IllegalArgumentException ex){
					assertTrue(true);
				}
			}


			@Test
			public void testPositiveSignalToNoise(){
				theorem.setSignalToNoise(5);
				assertEquals(5, theorem.getSignalToNoise(), 0);
			}
			
			@Test
			public void testNegativeSignalToNoise(){
				try{
					theorem.setSignalToNoise(-10);
					assertTrue( false);
				}catch( IllegalArgumentException ex){
					assertTrue(true);
				}
			}

			@Test
			public void testMDR(){
				theorem.setBandwidth(450);
				theorem.setSignalToNoise(300);
				assertEquals(44846.03, theorem.getMaximumDataRate(), 0);
			}

	        @Test
			public void textMDR(){
	        	theorem.setBandwidth(9);
	        	theorem.setSignalToNoise(56);
				double result = theorem.getMaximumDataRate();
				assertFalse(result==300.0);
			}
		}
		
