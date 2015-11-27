package FactoryPattern;

import java.math.BigInteger;

public class multiplpy extends Operation {


	@Override
	public BigInteger getRsult() {
		return (super.getNumberA().multiply(super.getNumberB()));
	}

}
