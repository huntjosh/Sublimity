package io.planey.logger;

public class ConsoleLogger implements Logger {
	@Override
	public void trace(String log) {
		print(log);
	}

	@Override
	public void debug(String log) {
		print("[Debug] ".concat(log));
	}

	@Override
	public void info(String log) {
		print("[Info] ".concat(log));
	}

	@Override
	public void warn(String log) {
		print("[Warning] ".concat(log));
	}

	@Override
	public void error(String log) {
		print("[*ERROR*] ".concat(log));
	}

	@Override
	public void fatal(String log) {
		print("[*FATAL*] ".concat(log));
	}

	private void print(String string) {
		System.out.println(string);
	}
}
