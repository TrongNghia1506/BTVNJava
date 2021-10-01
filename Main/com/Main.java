package Main.com;

import java.util.List;
import java.util.Scanner;

import WorkerService.com.WorkerServiceInterface;
import communityuni.com.Worker;
import service.com.WorkerService;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		WorkerServiceInterface workerservice = new WorkerService();
		System.out.println("\t\t\t"+"---Worker Manager---");
		List<Worker> workers = workerservice.insert(scanner);
		workerservice.show(workers);
		System.out.println("\t"+"---Xoa thong tin cong nhan---");
		workers = workerservice.delete(workers, scanner, null);
	}

}
