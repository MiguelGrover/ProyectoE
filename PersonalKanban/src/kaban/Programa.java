package kaban;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tarea tarea = new Tarea();
		
		tarea.setDescripcion("Completar el programa");
		tarea.setEstado(Estado.DO_TO);//TODO: Pull those changes into Github repository
		
		//ListaDeTareas lista = new ListaDeTareas();
		IDashboard lista = new ListaDeTareas();
//		IDashboard lista = new DashboardGUI();
//		IDashboard lista = new DashboardWEB();
		
		if (lista.add(tarea)){
			System.out.println("Agregada");
		}
	}

}
