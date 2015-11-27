package FactoryPattern;

import java.math.BigInteger;

public class Add extends Operation {

	public Add() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigInteger getRsult() {
		return (super.getNumberA().add(super.getNumberB()));
	}

}
