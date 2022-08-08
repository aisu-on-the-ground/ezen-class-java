package ezen0808_Exception.sec07_user_define_exception;

public class Account {
	private long balance;

	public Account() { }	

	public long getBalance() {
		return balance;
	}	
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족:"+(money-balance)+" 모자람");
			// 강제로 예외를 발생시키는 부분. throw ~ ~ 
			// ** throws 는 예외를 떠넘기는 키워드. s 붙는 것에 주의
		}
		balance -= money;
	}
}

