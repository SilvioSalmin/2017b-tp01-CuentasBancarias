package CuentasBancarias;

public class Cuenta {
	
	private double saldo;
	private boolean habilitada;
	
	public Cuenta(double saldo,boolean habilitada)
	{
		this.saldo = saldo;
		this.habilitada = habilitada;
	}
	
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean estaHabilitada() {
		return habilitada;
	}


	public void setHabilitada(boolean habilitada) {
		this.habilitada = habilitada;
	}


	public boolean transferirMontoHacia(int monto,Cuenta destino)
	{
		if(!destino.estaHabilitada() || !this.estaHabilitada())
			return false;
		
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
