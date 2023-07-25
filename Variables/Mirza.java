
class Mirza {
	int c = 1; // Instance Variable
	static int a = 1; // Static Variable

	static void get() {
		int b = 1;
		System.out.println("Local Variable" + b); // Local Variables
	}

	public static void main(String[] args) {
		Mirza a1 = new Mirza();
		System.out.println("Static Variable" + a);
		get();

		System.out.println("Instance Variable" + a1.c);
	}
}