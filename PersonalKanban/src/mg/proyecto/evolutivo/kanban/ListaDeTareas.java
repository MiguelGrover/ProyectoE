package mg.proyecto.evolutivo.kanban;

public class ListaDeTareas implements IDashboard{
	private Tarea[] listaDeTareas;
	/*
	+Clasificar(Estado)
	+Agregar(Tarea)
	+Borrar(Tarea)
	+PedirTarea()
	+Ordenar()
	+Buscar()
	+PedirTarea()
	+OrdenarPorPrioridad()
	+OrdenarPorFecha()*/
	public boolean Agregar(Tarea tarea){
		return true;
	}
	public Tarea[] getListaDeTareas() {
		return listaDeTareas;
	}
	public void setListaDeTareas(Tarea[] listaDeTareas) {
		this.listaDeTareas = listaDeTareas;
	}
	@Override
	public boolean add(Tarea task) {
		// TODO Auto-generated method stub
		return true;
	}
	public boolean remove(Tarea task) {
		// TODO Auto-generated method stub
		return true;
	}
}
