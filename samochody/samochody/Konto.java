package samochody;

import java.io.Serializable;

public class Konto implements Serializable {
	private static final long serialVersionUID = 5868600197037150911L;
	private double balance;
	private String id;

	public Konto(double balance, String id) {
		this.balance = balance;
		this.id = id;
	}
	public String getId() {return id;}

	public void wplac(double wplata) {
		balance += wplata;
	}

	public void wyplac(double wyplata) {
		balance -= wyplata;
	}

	public double stanKonta() {
		return balance;
	}
}
