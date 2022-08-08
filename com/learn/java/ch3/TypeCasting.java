class TypeCasting{
	public static void main(String args[]){
		System.out.println("Byte to int");
		byte b = 23;
		int i=b;
		System.out.println("b and i " + b + " " + i);
    		System.out.println("Int to byte");
		i=300;	
		b = (byte) i;
		System.out.println("i and b " + i + " " + b);


		System.out.println("\ndouble to int.");
    		double d = 32.4567;
		i = (int) d;
		System.out.println("d and i " + d + " " + i);
		System.out.println("int to double.");
		i=4567;
		d=i;
		System.out.println("i and d " + i + " " + d);

		
		System.out.println("\nConversion of double to byte.");
		d=334.5678;
		b = (byte) d;
		System.out.println("d and b " + d + " " + b);
		System.out.println("byte to double.");
		b=127;
		d=b;
		System.out.println("b and d " + b + " " + d);
		
		System.out.println("\n Int to float");
		i=23;
		float f=(float)i;
		System.out.println("i and f " + i + " " + f);
		System.out.println("Float to int");
		f=23.45f;
		i=(int)f;
		System.out.println("f and i " + f + " " + i);
		


		System.out.println("\nInt to long");
		i=23;
		long l=i;
		System.out.println("i and l " + i + " " + l);
		System.out.println("long to int");
		l=23789000939202l;
		i=(int)l;
		System.out.println("l and i " + l + " " + i);


		System.out.println("\nFloat to double");
		f=23.45f;
		d=f;
		System.out.println("f and d " + f + " " + d);
		System.out.println("Double to float");
		d=23.45566789;
		f=(float)d;
		System.out.println("d and f " + d + " " + f);



		System.out.println("\nChar to int");
		char c='s';
		i=c;
		System.out.println("c and i " + c + " " + i);
		System.out.println("Int to char");
		i=100;
		c=(char)i;
		System.out.println("i and c " + i + " " + c);

		System.out.println("\nInt to boolean");
		System.out.println("int cannot be converted to boolean");

		System.out.println("Boolean to int");
		System.out.println("error: incompatible types: boolean cannot be converted to int");

		System.out.println("\nChar to string");
		c='s';
		String s=Character.toString(c);
		System.out.println("incompatible types: char cannot be converted to String but by Character.toString() ONLY\nc and s " + c+ " " + s);
		System.out.println("String to char");
		s="swati";
		c=s.charAt(0);
		System.out.println("incompatible types: String cannot be converted to char BUT by charAt() ONLY\ns and c " + s + " " + c);

}}