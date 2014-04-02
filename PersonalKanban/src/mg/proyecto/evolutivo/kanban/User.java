package mg.proyecto.evolutivo.kanban;

import mg.proyecto.evolutivo.kanban.model.*;

public class User extends Thread {
	public void run(){
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		System.out.println("Running " + name + (" (Priority " + priority + ")..."));
		
		Task task = new Task(name, (short) priority);
		if(task.save()){
			Program.dashboard.add(task);
		}
	}
}
