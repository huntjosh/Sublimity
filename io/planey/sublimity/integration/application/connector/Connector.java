package io.planey.sublimity.integration.application.connector;

import java.util.List;

public interface Connector<T> {
	boolean hasChanges();

	String getChangedData();

	void pushChangedData(List<T> changes);
}
