package tools;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FieldGenerator {

	public static enum Mode {
		ALPHA, ALPHANUMERIC, NUMERIC, ALPHANUMERICSCHAR
	}

	public static enum AlphabetType {
		TR, RU, JP,
	}

	/**
	 * Generate random string of given length, based on predefined modes and a prefered alphabet type. ex RU, JP etc.
	 * @param length
	 * @param mode
	 * @return
	 */
	public static String generateRandomString(int length, Mode mode, AlphabetType alphabetType) {

		LanguageFields strangeString = setLanguage(alphabetType);
		String characters = "";

		switch (mode) {

		case ALPHA:
			characters = strangeString.getAlpha();
			break;

		case ALPHANUMERIC:
			characters = strangeString.getAlphaNumeric();
			break;

		case NUMERIC:
			characters = strangeString.getNumeric();
			break;

		case ALPHANUMERICSCHAR:
			characters = strangeString.getAlphaNumericChar();
			break;
		}

		return stringComposer(characters, length);
	}

	/**
	 * Generate random string of given length, based on predefined modes.
	 *
	 * @param length
	 * @param mode
	 * @return
	 */
	public static String generateRandomString(int length, Mode mode) {

		String characters = "";

		switch (mode) {

		case ALPHA:
			characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			break;

		case ALPHANUMERIC:
			characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			break;

		case ALPHANUMERICSCHAR:
			characters = "abcdefghijklmnopqrstuvwxyz1234567890";
			break;

		case NUMERIC:
			characters = "1234567890";
			break;
		}

		return stringComposer(characters, length);
	}

	/**
	 * Will receive an alphabet and a length and will return a random string
	 * from the alphabet of the given length.
	 * 
	 * @param alphabet
	 * @param length
	 * @return
	 */
	private static String stringComposer(String alphabet, int length) {
		StringBuffer buffer = new StringBuffer();
		int charactersLength = alphabet.length();

		for (int i = 0; i < length; i++) {
			double index = Math.random() * charactersLength;
			buffer.append(alphabet.charAt((int) index));
		}

		return buffer.toString();
	}

	/**
	 * This method should be moved. This action is called for generate random
	 * string method. The method will switch the strings from which the random
	 * strings are build. This is useful for testing region specific alphabet.
	 * 
	 * @return
	 */
	private static LanguageFields setLanguage(AlphabetType alphabetType) {
		LanguageFields returnObject = new LanguageFields();
		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream(Constants.RESOURCES_PATH + alphabetType.toString() + "_Field.properties");
			prop.load(input);
			returnObject.setAlpha(prop.getProperty("ALPHA"));
			returnObject.setAlphaNumeric(prop.getProperty("ALPHANUMERIC"));
			returnObject.setAlphaNumericChar(prop.getProperty("ALPHANUMERICSCHAR"));
			returnObject.setNumeric(prop.getProperty("NUMERIC"));

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return returnObject;
	}

	// public static void main(String args[]) {
	// String one = generateRandomString(10, Mode.ALPHA, AlphabetType.RU);
	// System.out.println("LAng: " + one);
	// }

}