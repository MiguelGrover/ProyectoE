package mg.proyecto.evolutivo.kanban;

import java.util.Date;

import mg.proyecto.evolutivo.kanban.model.*;

public class Program {
	
	public static IDashboard dashboard = new DashboardList();
	public static void main(String[] args) throws Exception {
		System.out.println("Start" + new Date());
		Task task;
		//IDashboard dashboard = new DashboardList();
		for (int i = 0; i < 15; i++) {
			task = new Task("Task " + i, State.DO_TO);
			if(task.save()&&dashboard.add(task)){
			//if (dashboard.add(task)) {
				System.out.println("Saved " + task.getTitle());
				System.out.println("End " + new Date());
			}
			/*if(task.save()){
				System.out.println("Added " + task.getTitle());
			}*/
		}
	}
}
