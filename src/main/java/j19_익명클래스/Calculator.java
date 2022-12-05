package j19_익명클래스;

@FunctionalInterface
public interface Calculator {

	public int calc(int a, int b);
//	public int calc2(int a, int b);

	public default int a() {
		return 10;
	}

}