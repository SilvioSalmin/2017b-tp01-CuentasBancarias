package CuentasBancarias;

public class Cuenta {
	
	public double saldo;
	
	public Cuenta(double saldo)
	{
		this.saldo = saldo;
	}
	
	
	public boolean transferirMontoHacia(int monto,Cuenta obj)
	{
		this.saldo -= monto;
		obj.saldo += monto;
		
		return true;
	}
}
