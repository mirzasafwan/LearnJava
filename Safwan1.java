 class Safwan1 {
 	  	int c=1; //Instance Variable
 	static int a=1; //Static Variable

  static void get() {
  	int b=1;
    System.out.println("Local Variable"+b); //Local Variables
  }

  public static void main(String[] args) {
  	Safwan1 a1=new Safwan1();
  	System.out.println("Static Variable"+a);
  	get();


  	System.out.println("Instance Variable"+a1.c);
  }
}