package Main;

public class Main {
	
	
	public static void SumaEntreSi(int a, int b, int c) {
		int suma = a+ b+ c;
		System.out.println("La Suma de los numeros es: "+ suma);
	}
	
	static Coche miCoche = new Coche(4);
	
	public static void main(String[] args) {
		SumaEntreSi(5,7,9);
		//miCoche.AumentoNumeroPuertas();
		System.out.println("La Cantidad de puertas de mi Coche son: "+ miCoche.cantPuertas);
	}


}
