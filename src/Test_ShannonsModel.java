package networktest;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import network.ShannonsModel;
import static org.junit.Assert.*;

public class Test_ShannonsModel {
	
	/**
	 * 
	 * @author Sidhant Soni
	 *
	 */
private ShannonsModel model;
         
         /**
		 * 
		 * @throws Exception shannon Theorem class is null
		 */
		@Before
		public void setUp() throws Exception{
			model = new ShannonsModel();
			assertNotNull(model);
		}

		@After
		public void tearDown() throws Exception{
			model = null;
		}
		
		@Test
		public void testPositiveBandwidth(){
			model.setBandwidth(0);
			assertEquals(0, model.getBandwidth(), 0);
		}

		@Test
		public void testNegativeBandwidth(){
			try{
				model.setBandwidth(-2);
				assertTrue( false);
			}catch( IllegalArgumentException ex){
				assertTrue(true);
			}
		}


		@Test
		public void testPositiveSignalToNoise(){
			model.setSignalToNoise(5);
			assertEquals(5, model.getSignalToNoise(), 0);
		}
		
		@Test
		public void testNegativeSignalToNoise(){
			try{
				model.setSignalToNoise(-10);
				assertTrue( false);
			}catch( IllegalArgumentException ex){
				assertTrue(true);
			}
		}

		@Test
		public void testMDR(){
			model.setBandwidth(450);
			model.setSignalToNoise(300);
			assertEquals(44846.03, model.getMaximumDataRate(), 0);
		}

        @Test
		public void textMDR(){
			model.setBandwidth(9);
			model.setSignalToNoise(56);
			double result = model.getMaximumDataRate();
			assertFalse(result==300.0);
		}
	}
	
