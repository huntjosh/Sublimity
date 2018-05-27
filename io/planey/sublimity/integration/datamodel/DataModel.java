package io.planey.sublimity.integration.datamodel;

/**
 * Manages the structure and parsing of data to and from applications.
 *
 * @since 0.1
 * @author Josh Hunt
 */
public interface DataModel {
	/**
	 * Converts itself into json data, ready for adding to an application.
	 *
	 * @return returns the jsonified datamodel
	 */
	String toJson();
}
