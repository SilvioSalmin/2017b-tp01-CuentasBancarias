package Test;
import static org.junit.Assert.*;
import org.junit.Test;

import CuentasBancarias.Cuenta;

public class TestCuenta {

	@Test
	public void testTransferir()
	{
		Cuenta origen = new Cuenta();
		Cuenta destino = new Cuenta();
		
		assertTrue(origen.transferir(1000, destino));
	}
}
