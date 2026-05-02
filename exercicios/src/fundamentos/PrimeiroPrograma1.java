package fundamentos;

/**
 * 
 * @author leonardomleitao
 * @since JDK1.0
 */
public class PrimeiroPrograma1 {
    public static void main(String[] args) {
        System.out.println("Número de argumentos: " + args.length);
		// Sentença de código termina com ;
		// Mais uma linha... 
		// Precisa estudar a biblioteca System.out.
		// Fim
		System.out.println("Primeiro programa Parte #01!");
		System.err.println("tesrte + " );
		
		/*
		 * Linha 1
		 * Linha 2
		 * Linha 3
		 */
		System.out.println("Primeiro programa Parte #02!");		// Sentença de código termina com ;
		// Mais uma linha... 
		// Precisa estudar a biblioteca System.out.
		// Fim
		System.out.println("Primeiro programa Parte #01!");
		System.err.println("tesrte + " );
		
		/*
		 * Linha 1
		 * Linha 2
		 * Linha 3
		 */
		System.out.println("Primeiro programa Parte #02!");
		
        for(int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
    
}
