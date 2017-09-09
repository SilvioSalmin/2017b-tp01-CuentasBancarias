package CuentasBancarias;

public class Cuenta {
	
	private double saldo;
	
	public Cuenta(double saldo)
	{
		this.saldo = saldo;
	}
	
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public boolean transferirMontoHacia(int monto,Cuenta destino)
	{
		if(this.saldoInsuficiente(monto))
			return false;
		
		this.saldo -= monto;
		destino.setSaldo(destino.getSaldo() + monto);
		
		return true;
	}
	
	public boolean saldoInsuficiente(double monto)
	{
		if(this.saldo <= monto)
			return true;
		return false;
	}
}
