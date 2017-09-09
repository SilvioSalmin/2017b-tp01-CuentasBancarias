package Test;
import static org.junit.Assert.*;
import org.junit.Test;

import CuentasBancarias.Cuenta;

public class TestCuenta {

	@Test
	public void testTransferir()
	{
		Cuenta origen = new Cuenta(100);
		Cuenta destino = new Cuenta(200);
		
		assertTrue(origen.transferirMontoHacia(1000, destino));
	}
}
