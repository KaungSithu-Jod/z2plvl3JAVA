package Assignments;

public class Demo {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount(1, "Kaung", "1111", "1234");
		
		try {
			acc1.deposit(20000);
			acc1.withdraw(10000);
//			acc1.withdraw(100000000);
			acc1.ChangePassword();
		} catch (InsufficientAmountException iae) {
			System.err.println(iae.getMessage());
		} catch (InvalidPinException ipe) {
			System.err.println(ipe.getMessage());
		} finally {
			acc1.showInfo();
		}
	}

}
