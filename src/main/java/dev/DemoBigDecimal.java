package dev;

import java.math.BigDecimal;

public class DemoBigDecimal {

	public static void main(String[] args) {

		double a = 1.0;
		
		double b = 0.9;
		
		double resultat = a - b;
		
		BigDecimal resOk = new BigDecimal("1.0").subtract(new BigDecimal("0.9"));
		
		System.out.println(resOk);
		
	}

}
