package FactoryPattern;

import java.math.BigInteger;

public class reduce extends Operation{

	public reduce() {
		
	}

	@Override
	public BigInteger getRsult() {
		
		return (super.getNumberA().subtract(super.getNumberB()));	}

}
