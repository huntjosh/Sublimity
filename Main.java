import io.planey.logger.ConsoleLogger;
import io.planey.sublimity.IntegrationRunner;
import io.planey.sublimity.integration.mapping.Integration;
import io.planey.sublimity.integration.mapping.PeopleEmployee;
import io.planey.sublimity.integration.scheduling.StubScheduleChecker;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class Main {
	public static void main(String[] args) {
		List<Integration> integrations = new ArrayList<>();
		integrations.add(new PeopleEmployee());
		IntegrationRunner integrationRunner = new IntegrationRunner(integrations, new StubScheduleChecker(), new ConsoleLogger());
		Timer t = new Timer();
		t.scheduleAtFixedRate(integrationRunner, 0, 1000);
	}
}