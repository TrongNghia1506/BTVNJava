package WorkerService.com;
import communityuni.com.*;

import java.util.List;
import java.util.Scanner;

public interface WorkerServiceInterface {
	List<Worker> insert(Scanner scanner);
	public void show(List<Worker> workers);
	List<Worker> delete(List<Worker> workers, Scanner scanner, String Id);
}
