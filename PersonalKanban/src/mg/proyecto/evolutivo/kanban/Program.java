package mg.proyecto.evolutivo.kanban;

import java.util.Date;
import java.util.Random;

import mg.proyecto.evolutivo.kanban.model.*;

public class Program {
	
	public static IDashboard dashboard = new DashboardList();
	public static void main(String[] args) throws Exception {
		System.out.println("Start" + new Date());
		User user;
		for(int i = 0; i < 15; i++){
			user = new User();
			user.setName("Title " + i);
			int priority  =  1 + (int) (Math.random()*((10-1)+1));
			user.setPriority(priority);
			
			user.start();
		}
		System.out.println("End " + new Date());
		/*Task task;
		IDashboard dashboard = new DashboardList();
		for (int i = 0; i < 15; i++) {
			task = new Task("Task " + (i+1), State.DO_TO);
			if(task.save()&& dashboard.add(task)){
			if (dashboard.add(task)) {
				System.out.println("Saved " + task.getTitle());
				System.out.println("End " + new Date());
			}
			if(task.add()){
				System.out.println("Added " + task.getTitle());
			}
		}*/
	}
}
