import io.planey.logger.ConsoleLogger;
import io.planey.sublimity.integration.mapping.PeopleEmployee;
import io.planey.sublimity.integration.scheduling.IntegrationManager;
import io.planey.sublimity.integration.scheduling.StubScheduleChecker;

import java.util.Timer;

public class Main {
	public static void main(String[] args) {
		IntegrationManager integrationManager = new IntegrationManager(new PeopleEmployee(), new ConsoleLogger(), new StubScheduleChecker());
		integrationManager.spawnWorkerPool(10);
		Timer t = new Timer();
		t.scheduleAtFixedRate(integrationManager, 0, 100);
	}
}