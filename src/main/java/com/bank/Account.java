package com.bank;

public abstract class Account {

    private double balance;
    private double interest;
    private int periods;
    private String name;
    private int term;

    public double getBalance() {
        return balance;
    }
    public void setBalance(double inputBalance) {
        balance = inputBalance;
    }
    public double getInterest() {
        return interest;
    }
    public void setInterest(int inputInterest) {

        interest = Double.parseDouble(String.valueOf(inputInterest)) / 100;
    }
    public int getPeriods() {
        return periods;
    }
    public void setPeriods(int inputPeriods) {
        periods = inputPeriods;
    }
    public void compute(){
        for(int i = 0; i < periods; i++){
            setBalance((getInterest() * getBalance()) + getBalance());
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String inputName){
        name = inputName;
    }
    @Override
    public String toString() {
        return " Name: " + getName() + " Balance: " + getBalance() + " Interest: " + getInterest() + " Periods: " + getPeriods();
    }

}
