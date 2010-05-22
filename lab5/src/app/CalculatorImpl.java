package app;

import calc.*;

public class CalculatorImpl extends CalculatorPOA {
	public long aduna(long a, long b) {
        return a + b;
    }

    public long scade(long a, long b) {
        return a - b;
    }

    public long inmulteste(long a, long b) {
        return a * b;
    }

    public long imparte(long a, long b) {
        return a / b;
    }
    
    public String baza2(long n) {
    	return Long.toBinaryString(n);
	}
}
