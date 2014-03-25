package mg.proyecto.evolutivo.kanban.model;

public interface IDashboard {
	public abstract boolean add(Task task);
	boolean remove(Task task);
	void clear();
}
