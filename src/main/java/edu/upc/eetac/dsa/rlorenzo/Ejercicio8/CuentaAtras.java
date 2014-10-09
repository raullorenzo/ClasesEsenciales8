package edu.upc.eetac.dsa.rlorenzo.Ejercicio8;

public class CuentaAtras extends Thread{
	
	//String mensaje;
	
	//Creamos el constructor de la clase Proceso
	public CuentaAtras(String msg){
		//Con super, heredamos el mismo constructor (propiedades) que el de la clase Thread
		super(msg);	
	}
	//Creamos el metodo run, es con el que se crean los procesos de threads
	public void run(){
		int count=11;
		System.out.println("Cuenta atrás de 10 números con extends Thread:");

		for(int i=0;i<11;i++){
			count=count-1;
			System.out.println(count);
//	con el Thread sleep se entrelazan los procesos
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("El proceso: "+this.getName()+" con ID: "+this.getId()+" y prioridad: "+this.getPriority()+" ha terminado");
	}
//	public void setMensaje(String mensaje){
//		this.mensaje=mensaje;
//	}
	

}
