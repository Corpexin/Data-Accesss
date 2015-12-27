package Rep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lector {
	static Scanner scanner = new Scanner(System.in);

	// lectura de char cualquiera
	public static char scanCharAll() {
		String x;
		char result = ' ';
		do {
			x = scanner.nextLine();
			if (x.length() > 1) {
				System.out.println("Introducir un caracter, Reintroduce:");
			} else if (x.length() == 0) {
				System.out.println("Caracter vacio");
			} else {
				result = x.charAt(0);
			}
		} while (x.length() > 1);
		return result;
	}

	// lectura de cadena con next
	public static String scanStringAll() {
		String result;
		result = scanner.next();
		return result;
	}

	// lectura de una cadena cualquiera nextline
	public static String scanStringAllNextLine() {
		String result;
		result = scanner.nextLine();
		return result;
	}

	// lectura de char que cumple patron pasado por parametro
	public static char scanCharParam(String x) {
		char resultado = ' ';
		char y;
		y = scanner.nextLine().charAt(0);
		String a = String.valueOf(y);
		if (a.matches(x)) {
			System.out.println("Cumple con el patron");
			resultado = y;
		} else
			System.out.println("No cumple con el patron");
		return resultado;
	}

	// lectura de un boolean cualqiera.
	public static boolean scanBoolean(int resp) {
		boolean seguir;
		boolean result = true;

		do {
			seguir = true;
			if (resp == 1)
				result = true;

			else if (resp == 2)
				result = false;

			else {
				System.out
						.println("Los valores a introducir son:\n[1] para afirmar\n[2] para negar");
				seguir = false;
			}
		} while (seguir == false);

		return result;
	}

	// lectura de un entero cualquiera
	public static int scanIntAll() {
		int result = 0;
		boolean x = true;
		do {
			try {
				x = true;
				result = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out
						.println("Error: Introducir Entero. Introducir un numero:");
				scanner.nextLine();
				x = false;
			}
		} while (x == false);
		return result;
	}

	// lectura de un float cualquiera
	public static float scanFloatAll() {
		float result = 0;
		int x = 0;
		do {
			try {
				result = scanner.nextFloat();
				x = 0;
			} catch (InputMismatchException e) {
				System.out
						.println("Error: Introducir Float. Introducir un numero:");
				scanner.nextLine();
				x = 1;
			}
		} while (x == 1);
		return result;
	}

	// lectura de un double cualquiera
	public static double scanDoubleAll() {
		double result = 0;
		int x = 0;
		do {
			try {
				result = scanner.nextDouble();
				x = 0;
			} catch (InputMismatchException e) {
				System.out
						.println("Error: Introducir Double. Introducir un numero:");
				scanner.nextLine();
				x = 1;
			}
		} while (x == 1);
		return result;
	}

	// Lectura de un long cualquiera
	public static long scanLongAll() {
		long result = 0;
		int x = 0;
		do {
			try {
				result = scanner.nextLong();
				x = 0;
			} catch (InputMismatchException e) {
				System.out
						.println("Error: Introducir Long. Introducir un numero:");
				scanner.nextLine();
				x = 1;
			}
		} while (x == 1);
		return result;
	}

	// Lectura de numero entre 2 parametros (MENUS)
	public static int scanIntParam(int menor, int mayor) {
		int num;
		int result = 0;
		boolean seguir = true;

		do {
			seguir = true;
			num = scanIntAll();

			if (num >= menor && num <= mayor)
				result = num;
			else {
				System.out.println("Error. El numero debe estar en el rango: "
						+ menor + "-" + mayor);
				seguir = false;
			}

		} while (!seguir);

		return result;
	}

	/********************* NO SEGURO *********************************/
	// lectura de una cadena si pasa por patron
	public static String scanStringParam(String x) {
		String result = "";
		String z;
		z = scanner.nextLine();
		if (z.matches(x)) {
			System.out.println("Cumple con el patrón");
			result = z;
		} else {
			System.out.println("No cumple con el patron");
		}
		return result;
	}

	// Lector de numeros general
	public static Number scanNumber(char tipo, String mens) {
		// tipo es un caracter que dependiendo de cual ponga el programador
		// leera un int, float, double, etc. Ej: Si el programador pone el
		// caracter "i" se leera un integer
		// mens es un mensaje que el usuario pasa por parametro. Ej:
		// "Introduce numero:"
		Number number = 0;
		boolean salir = false;

		System.out.println(mens);

		do {
			try {
				salir = false;
				switch (tipo) {
				case 'i':// Entero
					number = scanner.nextInt();
					break;
				case 'd':// Double
					number = scanner.nextDouble();
					break;
				case 'f':// Float
					number = scanner.nextFloat();
					break;
				case 'l':// Long
					number = scanner.nextLong();
					break;

				case 's':// Short
					number = scanner.nextShort();
					break;
				case 'b':// Byte
					number = scanner.nextByte();
					break;
				default:
					System.out
							.println("Error: No se ha especificado el caracter correcto.\n i = Integer\n d = Double\n f = Float\n l = Long\n s = Short\n b = Byte");
				}
			} catch (InputMismatchException e) {
				System.out
						.println("Error: Tipo Incorrecto. ReIntroducir un numero:");
				scanner.nextLine();
				salir = true;
			}
		} while (salir);

		return number;
	}

	// generico
	// Lector de numeros general

	@SuppressWarnings("unchecked")
	public static <T> T scanGen(char tipo, String mens) {
		boolean salir = false;
		T parm = null;

		System.out.println(mens);

		do {
			try {
				salir = false;
				switch (tipo) {
				case 'i':// Entero
					parm = (T) new Integer(scanner.nextInt());
					break;
				case 'd':// Double
					parm = (T) new Double(scanner.nextDouble());
					break;
				case 'f':// Float
					parm = (T) new Float(scanner.nextFloat());
					break;
				case 'l':// Long
					parm = (T) new Long(scanner.nextLong());
					break;
				case 's':// Short
					parm = (T) new Short(scanner.nextShort());
					break;
				case 'b':// Byte
					parm = (T) new Byte(scanner.nextByte());
					break;
				case 'c':// Char
					parm = (T) new Character(scanner.nextLine().charAt(0));
					break;
				case 't':// String
					parm = (T) new String(scanner.nextLine());
					break;
				default:
					System.out
							.println("Error: No se ha especificado el caracter correcto.\n i = Integer\n d = Double\n f = Float\n l = Long\n s = Short\n b = Byte");
				}
			} catch (InputMismatchException e) {
				System.out
						.println("Error: Tipo Incorrecto. ReIntroducir un numero:");
				scanner.nextLine();
				salir = true;
			}
		} while (salir);

		return parm;
	}

}