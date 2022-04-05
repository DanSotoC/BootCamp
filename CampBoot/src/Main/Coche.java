package Main;

public class Coche {
	
	int cantPuertas;

	public Coche(int cantPuertas) {
		super();
		this.cantPuertas = cantPuertas;
	}

	public void AumentoNumeroPuertas(){
		this.cantPuertas++;
		System.out.print("El coche tiene "+cantPuertas+" puertas");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
