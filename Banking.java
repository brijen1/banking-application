package com.Digitek;

public class Banking {
private double balance;
private double deposit;
private double withdrawel;
private double transfer;
private String RoutingNumber;
private String AccountNumber;
public double getBalance() {
	return balance;
}
public double getDeposit() {
	return deposit;
}
public double getWithdrawel() {
	return withdrawel;
}
public double getTransfer() {
	return transfer;
}
public String getRoutingNumber() {
	return RoutingNumber;
}
public String getAccountNumber() {
	return AccountNumber;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public void setDeposit(double deposit) {
	this.deposit = deposit;
}
public void setWithdrawel(double withdrawel) {
	this.withdrawel = withdrawel;
}
public void setTransfer(double transfer) {
	this.transfer = transfer;
}
public void setRoutingNumber(String routingNumber) {
	RoutingNumber = routingNumber;
}
public void setAccountNumber(String accountNumber) {
	AccountNumber = accountNumber;
}
}
