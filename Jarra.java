public class Jarra { //atributos
	private int cantidad;
	private int capacidad;
	//constructor
	public Jarra(int capacidadInicial){
		if(capacidadInicial<=0){
		 		throw new RuntimeException("ERROR: no se pueden crear jarras
		 				con capacidad menor o igual que cero.");
		}
		this.capacidad=capacidadInicial;
	}
	// metodos
	public int capacidad(){
		 return this.capacidad;
	}
	public int cantidad(){
		 return this.cantidad;
	}
	
	public void llenaDesde(Jarra j){
		while((this.cantidad<this.capacidad)&&(j.cantidad>0)){
			this.cantidad++;
			j.cantidad--;
		}

	public String toString(){
		return ("("+this.capacidad+","+this.cantidad+")");
	}	

	public void llena(){
		this.cantidad=this.capacidad;
	}
	
	public void vacia(){
		this.cantidad=0;
	}

	public void metodoComunitario(){
		// Comentario incluido para pruebas
		System.out.println("María José Hidalgo Rodríguez");
		System.out.println("Mario Perales Díaz");
		System.out.println("Maria Vida Montañez");
	}