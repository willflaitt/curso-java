package fundamentos;



public class StringClassStudies6 {

	public static void main(String[] args) {
		String s3 = new String();
		System.out.println("s3 :" + s3);
		
		char data[] = {'a', 'b', 'c'};
		String str = new String(data);
		System.out.println(str);
		
		String s4 = new String("teste s4");
		s4 = "rerter";
		System.out.println("s4.value:" + s4);
		System.out.println("s4,coder:" + s4.hashCode());
		System.out.println("s4.hash :" + s4);
		char testBlank = s4.charAt(2);
		System.out.println("testBlank = s4.charAt(2): " + testBlank);

		
		String s1 = "Hello";
		String s2 = "World";

		// Comparable - permite ordenação
		int result = s1.compareTo(s2); // -15 (H vem antes de W)
		System.out.println(result);

		// CharSequence - métodos comuns
		char c = s1.charAt(1); // 'e'
		System.out.println("c = s1.charAt(1); // 'e': " + c);
		int len = s1.length(); // 5
		System.out.println(len);

		// Serializable - pode ser serializado
		//ObjectOutputStream oos = new ObjectOutputStream();
		//oos.writeObject(s1); // Funciona porque implementa Serializable
		
		// Criação
		String s5 = "Hello";                       // Literal (vai pro String Pool)
		String s6 = new String("Hello");           // Nova instância
		String s7 = new String(new char[]{'H','i'}); // De array

		System.out.println("String s5: " + s5);
		System.out.println("String s6: " + s6);
		System.out.println("String s7: " + s7);

		// Métodos
		String result1 = "Hello".concat(" World");  // "Hello World"
		System.out.println(result1);
		
		String sub = "Hello".substring(1, 4);      // "ell"
		System.out.println(sub);

		int index = "Hello".indexOf('e');          // 1
		System.out.println(index);

		boolean empty = "".isEmpty();              // true
		System.out.println(empty);


		// Transformação
		String upper = "hello".toUpperCase();      // "HELLO"
		System.out.println(upper);

		String trimmed = "  hello  ".trim();       // "hello"
		System.out.println(upper);

		String replaced = "hello".replace('l', 'p'); // "heppo"
		System.out.println(replaced);

		// Verificação
		boolean starts = "Hello".startsWith("He"); // true
		System.out.println(starts);

		boolean contains = "Hello".contains("ell"); // true
		System.out.println(contains);

		// Conversão
		char[] chars = "Hello".toCharArray();
		System.out.println("char[] chars = \"Hello\".toCharArray();" + chars);

		byte[] bytes = "Hello".getBytes();
		System.out.println("byte[] bytes = \"Hello\".getBytes();" + bytes);


	}

}
