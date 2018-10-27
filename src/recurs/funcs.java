package recurs;

public class funcs {
	public static void z1(int n) {
		if (n>1)
			z1(n-1);
		for (int i = n; i > 0; i --) {
			System.out.println(n);
		}
	}	
	
	public static void z2 (int n) {
		if (n>1)
			z2(n-1);
		System.out.println(n);
	}

	
	public static void main (String[] args) {
		System.out.println("Задача 1");
		z1(3);
		System.out.println("Задача 2");
		z2(5);
	}

}
