package kaban;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tarea tarea = new Tarea();
		
		tarea.setDescripcion("Completar el programa");
		
		//ListaDeTareas lista = new ListaDeTareas();
		IDashboard lista = new ListaDeTareas();
		if (lista.add(tarea)){
			System.out.println("Agregada");
		}
	}

}
