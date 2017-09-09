package Test;
import static org.junit.Assert.*;
import org.junit.Test;

import CuentasBancarias.Cuenta;

public class TestCuenta {

	Cuenta origen = new Cuenta(2000,true);
	Cuenta destino = new Cuenta(200,false);
	
	@Test
	public void testTransferir()
	{	
		assertTrue(origen.transferirMontoHacia(1000, destino));
	}
	
	@Test
	public void testHaySaldo()
	{
		assertTrue(origen.saldoInsuficiente(3000));
	}
	
	@Test
	public void testTransfieroSiEstaHabilitada()
	{
		assertFalse(origen.transferirMontoHacia(1000, destino));
	}
}
