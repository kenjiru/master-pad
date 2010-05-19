package app;

public class Calculator {
	static {
		System.loadLibrary("lab3-cpp");
	}
	
	public native long aduna(long a, long b);
	
	public native long scade(long a, long b);

    public native long inmulteste(long a, long b);

    public native long imparte(long a, long b);
    
    public native String baza2(int a);
    
    public native int baza10(String s);
}
