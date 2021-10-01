package service.com;
import communityuni.com.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import WorkerService.com.WorkerServiceInterface;

public class WorkerService implements WorkerServiceInterface{

	@Override
	public List<Worker> insert(Scanner scanner) {
		List<Worker> workers = new ArrayList<Worker>();
		System.out.println("Nhap vao so luong cong nhan: ");
		int total = scanner.nextInt();
		scanner.nextLine();
		
		for(int index = 0; index < total; index++) {
			Worker worker = new Worker();
			worker.input(scanner, index);
			scanner.nextLine();
			workers.add(worker);
		}
		return workers;
	}
	
	@Override
	public void show(List<Worker> workers) {
		int index = 0;
		for(Worker worker : workers) {
			worker.output(index);
			index++;
		}
	}

	@Override
	public List<Worker> delete(List<Worker> workers, Scanner scanner, String Id) {
		boolean check = false;
		System.out.println("Nhap vao Id muon xoa: ");
		Id = scanner.nextLine();
		for(Worker worker : workers) {
			if(worker.getID().equals(Id)) {
				boolean remove = workers.remove(workers);
				check = true;
				break;
			}
		}
		if(check) {
			System.out.println("Cong nhan co ID = " + Id + " Da bi xoa khoi list!!");
		}
		show(workers);
		return workers;
	}
}
