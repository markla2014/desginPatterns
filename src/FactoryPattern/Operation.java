package FactoryPattern;

import java.math.BigInteger;

public abstract class Operation {
  private BigInteger numberA=new BigInteger("0");
  private BigInteger numberB=new BigInteger("0");
public BigInteger getNumberA() {
	return numberA;
}
public void setNumberA(String numberA) {
	this.numberA = new BigInteger(numberA);
}
public BigInteger getNumberB() {
	return numberB;
}
public void setNumberB(String numberB) {
	this.numberB = new BigInteger(numberB);;
}
  public abstract BigInteger getRsult();
}
