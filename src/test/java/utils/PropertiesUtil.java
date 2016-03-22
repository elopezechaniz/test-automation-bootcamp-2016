package utils;

import java.io.IOException;
import java.util.Properties;

/**
 * Properties file manager util.
 * 
 * @author ELopezEchaniz
 *
 */
public class PropertiesUtil {

	private static final String FRAMEWORK_PROPERTIES_FILE_NAME = "/resources/testAutomation.properties";

	/**
	 * Given a property name returns the value for that property from the
	 * FRAMEWORK_PROPERTIES_FILE_NAME properties file.
	 * 
	 * @author ELopezEchaniz
	 *
	 * @param propertyName
	 *            : String
	 * @return String
	 */
	public static String getProperty(String propertyName) {
		Properties properties = new Properties();
		try {
			properties.load(PropertiesUtil.class.getResourceAsStream(FRAMEWORK_PROPERTIES_FILE_NAME));
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
		return properties.getProperty(propertyName);
	}
}
