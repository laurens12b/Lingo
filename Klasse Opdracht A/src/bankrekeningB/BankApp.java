package bankrekeningB;

public class BankApp {
	
	private BankRekening rekening;
	
	public BankApp() {
		rekening = new BankRekening(0);
		rekening.stort(1000);
		rekening.stort(500);
		rekening.stort(-750);
		rekening.stort(-560);
		rekening.stort(-770);
	}
	
	public static void main(String[] args) {
		BankApp ba = new BankApp();
	}

}
