import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Entity.ClienteRegistrato;

/**
 * 
 */

/**
 * @author laksh
 *
 */
public class AutenticazioneClienteTest {

	private ClienteRegistrato clienteTest;
	
	@Before
	public void setUp() throws Exception {
		clienteTest = new ClienteRegistrato("Mario", "Rossi", "admin", "admin", "MarioRossi@gmail.com");
	}

	/**
	 * @throws java.lang.Exception
	 */

	@Test
	public void getNomeTest() {
		 assertEquals("Mario",clienteTest.getNome());
	}
	
	@Test
	public void getCognomeTest() {
		 assertEquals("Rossi",clienteTest.getCognome());
	}
	
	@Test
	public void getUsernameTest() {
		 assertEquals("admin",clienteTest.getUsername());
	}
	
	@Test
	public void getPasswordTest() {
		 assertEquals("admin",clienteTest.getPassword());
	}
	
	@Test
	public void getEmailTest() {
		 assertEquals("MarioRossi@gmail.com",clienteTest.getEmail());
	}
	
	

}