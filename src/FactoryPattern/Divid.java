package FactoryPattern;

import java.math.BigInteger;

public class Divid extends Operation{

	public Divid() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigInteger getRsult() {
		return (super.getNumberA().divide(super.getNumberB()));
	}

}
