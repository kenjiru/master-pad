package app;

public class NativePI {

    public static native double PI(int steps, int threads);

    static {
        System.loadLibrary("lab4-cpp");
    }
}