package CuentasBancarias;

public class Cuenta {
	
	public double saldo;
	
	public Cuenta(double saldo)
	{
		this.saldo = saldo;
	}
	
	
	public boolean transferirMontoHacia(int monto,Cuenta obj)
	{
		if(this.saldoInsuficiente(monto))
			return false;
		
		this.saldo -= monto;
		obj.saldo += monto;
		
		return true;
	}
	
	public boolean saldoInsuficiente(double monto)
	{
		if(this.saldo <= monto)
			return true;
		return false;
	}
}
