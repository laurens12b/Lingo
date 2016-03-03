package bankrekeningB;

public class BankRekening {
	
	private int rekeningnummer;
	private double saldo;
	
	public BankRekening(double saldo) {
		this.saldo = saldo;
		this.rekeningnummer = (int) (Math.random() * Integer.MAX_VALUE);
	}

	public int getRekeningnummer() {
		return rekeningnummer;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void stort(double teStorten) {
		if (saldo + teStorten >= 0) {
			saldo += teStorten;
			System.out.println("Rekeningnummer: " + rekeningnummer + "\nSaldo: " + saldo + "\n");
		} else {
			System.out.println("Rooie kan niet coden!!");
		}
	}

}
