package Caso3S3;

public class Contador {
	private String nom;
	private static int cont=0;//el static es un contador
	
	public Contador(String nom) {
		super();
		this.nom = nom;
		cont++;
	}
	public int Cantidad() {
		return cont;
	}
}
