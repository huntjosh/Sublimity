package io.planey.logger;

public interface Logger {
	void trace(String log);
	void debug(String log);
	void info(String log);
	void warn(String log);
	void error(String log);
	void fatal(String log);
}
