package io.planey.sublimity.integration.application;

import java.util.List;

public interface Application<T> {
	boolean hasChanges();

	List<T> getChanges();

	void pushChanges(List<T> changes);
}
