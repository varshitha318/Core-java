package programs;

class multiplication {
	static int Multiply(int a, int b)
	{
		return a * b;
	}

    static int Multiply(int a, int b, int c)
	{
		return a * b * c;
	}
}

class polymorphism {

	public static void main(String[] args)
	{

	System.out.println(multiplication.Multiply(2, 4));
	System.out.println(multiplication.Multiply(2, 7, 3));
	}
}
