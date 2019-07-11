package org.api4.java.common.control;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public interface IConfig extends Map<Object, Object> {

	/**
	 * Reads properties of a config from a config file.
	 *
	 * @param file The file to read in as properties.
	 * @throws IOException Throws an IOException if an issue occurs while reading in the properties from the given file.
	 */
	default IConfig loadPropertiesFromFile(final File file) {
		try (BufferedReader r = Files.newBufferedReader(Paths.get(file.getAbsolutePath()), StandardCharsets.UTF_8)) {
			String line;
			final List<String> lines = new LinkedList<>();
			while ((line = r.readLine()) != null) {
				lines.add(line);
			}
			return loadPropertiesFromList(lines);
		} catch (IOException e) {
			throw new PropertiesLoadFailedException("Could not load properties from the given file.", e);
		}
	}

	/**
	 * Loads properties from a resource (instead of a file).
	 *
	 * @param resourcePath The path to the resource.
	 * @throws IOException Throws an IOException if an issue occurs while reading in the properties from the given resource.
	 */
	default IConfig loadPropertiesFromResource(final String resourcePath) throws IOException {
		// Get file from resources folder
		ClassLoader classLoader = this.getClass().getClassLoader();
		String content = null;
		try (InputStream inputStream = classLoader.getResourceAsStream(resourcePath)) {
			ByteArrayOutputStream result = new ByteArrayOutputStream(1024);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = inputStream.read(buffer)) != -1) {
				result.write(buffer, 0, length);
			}
			content = result.toString(StandardCharsets.UTF_8.name());
		}

		if (content != null) {
			return loadPropertiesFromList(Arrays.asList(content.split("\n")));
		}
		return this;
	}

	/**
	 * Loads a properties config from a list of property assignments.
	 *
	 * @param propertiesList The list of property assignments.
	 */
	default IConfig loadPropertiesFromList(final List<String> propertiesList) {
		for (String line : propertiesList) {
			if (!line.contains("=") || line.startsWith("#")) {
				continue;
			}
			String[] split = line.split("=");
			setProperty(split[0].trim(), split[1].trim());
		}
		return this;
	}

	public String setProperty(String key, String value);

}
