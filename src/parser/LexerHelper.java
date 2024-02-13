package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	// TODO: Implement the lexemeToChar and lexemeToReal methods
	public static double lexemeToReal(String str){
		try {
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String str){
		String aux = "";

		// Eliminar las comillas que están presentes
		if(str.charAt(0) == '\'' && str.charAt(str.length() - 1) == '\'') {
			aux = str.substring(1, str.length() - 1);
		}

		// Ahora realizamos las diferentes comprobaciones de las diferentes que podemos
		// tener
		if (aux.length() == 1){
			return aux.charAt(0);
		} else if (aux.length() == 2 && aux.charAt(0) == '\\'){
			return checkTipo(str);
		} else {
			return (char)Integer.parseInt(aux.substring(1, aux.length()));
		}
	}

	private static char checkTipo(String str) {
		switch (str.charAt(1)){
			case 'n':
				return '\n';
			case 't':
				return '\t';
			case 'r':
				return '\r';
		}
		return '\\';
	}

}
