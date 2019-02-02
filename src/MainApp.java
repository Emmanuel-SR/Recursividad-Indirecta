/*
 * Extraido de:
 * Canal de Youtube "Informática a lo Fácil"
 * Video: Un ejemplo real de Recursividad Indirecta
*/

public class MainApp {

	public static String getNextCodeLetter(final String actualCode) {
		String subCode;
		String sNextCode;

		char lastChar = actualCode.charAt(actualCode.length() - 1);
		subCode = actualCode.substring(0, actualCode.length() - 1);

		if (lastChar < 90) {
			lastChar++;
			sNextCode = subCode + lastChar;
		} else {
			sNextCode = getNextCode(subCode) + "A";
		}
		System.out.println(String.format(">inc letra:  \t%8s\t%8s", actualCode, sNextCode)); 
		
		return sNextCode;
	}

	public static String getNextCode(final String actualCode) {
		String subCode;
		String sNextCode;

		if (actualCode.equals("Z9Z9Z9Z9")) {
			return null;
		}

		subCode = actualCode.substring(0, actualCode.length() - 1);

		String lastChar = actualCode.substring(actualCode.length() - 1, actualCode.length());
		Integer lastDigit = Integer.parseInt(lastChar);

		if (lastDigit < 9) {
			lastDigit++;
			sNextCode = subCode + lastDigit.toString();
		} else {
			sNextCode = getNextCodeLetter(subCode) + "0";
		}
		System.out.println(String.format(">inc número: \t%8s\t%8s", actualCode, sNextCode));

		return sNextCode;
	}

	public static void main(String[] args) {
		String actualCode;

		// caso 1
		actualCode = "Z9Z9Z9Z9";
		System.out.println("______________________ CASO 1 ______________________\nactualCode: " + actualCode);
		System.out.println("\n" + actualCode + " -> " + MainApp.getNextCode(actualCode));

		// caso 2
		actualCode = "A0A0A0A0";
		System.out.println("\n\n______________________ CASO 2 ______________________\nactualCode: " + actualCode);
		System.out.println("\n" + actualCode + " -> " + MainApp.getNextCode(actualCode));

		// caso 3
		actualCode = "A0A0A0A9";
		System.out.println("\n\n______________________ CASO 3 ______________________\nactualCode: " + actualCode);
		System.out.println("\n" + actualCode + " -> " + MainApp.getNextCode(actualCode));

		// caso 4
		actualCode = "Z8Z9Z9Z9";
		System.out.println("\n\n______________________ CASO 4 ______________________\nactualCode: " + actualCode);
		System.out.println("\n" + actualCode + " -> " + MainApp.getNextCode(actualCode));

		// caso 5
		actualCode = "A9Z9Z9Z9";
		System.out.println("\n\n______________________ CASO 5 ______________________\nactualCode: " + actualCode);
		System.out.println("\n" + actualCode + " -> " + MainApp.getNextCode(actualCode));

		// caso 6
		actualCode = "A9X9P9Z9";
		System.out.println("\n\n______________________ CASO 6 ______________________\nactualCode: " + actualCode);
		System.out.println("\n" + actualCode + " -> " + MainApp.getNextCode(actualCode));
	}

}
