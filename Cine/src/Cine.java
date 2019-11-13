import java.util.Scanner;

public class Cine {
	private String sala1;
	private String sala2;
	private String sala3;
	private String[] peliculas = {"El guason","La mascara","El chupacabras 4"};
	private int peli;
	private String pelicula;
	
	
	
	public String getSala1() {
		return sala1;
	}
	public void setSala1(String sala1) {
		this.sala1 = sala1;
	}
	public String getSala2() {
		return sala2;
	}
	public void setSala2(String sala2) {
		this.sala2 = sala2;
	}
	public String getSala3() {
		return sala3;
	}
	public void setSala3(String sala3) {
		this.sala3 = sala3;
	}
	
	
	public void seleccionoPeli() {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Que pelicula desea ver? 1='El guason' 2='La mascara' 3='El chupacabras 4'");
		
		peli = scn.nextInt();
		
		switch(peli) {
		
		case 1 : pelicula = peliculas[0];
			System.out.println("El guason seleccionado");
			break;
			
		case 2 : pelicula = peliculas[1];
			System.out.println("La mascara seleccionado");
			break;
			
		case 3 : pelicula = peliculas[2];
			System.out.println("El Chupacabras 4 seleccionado");
			break;
		}
		
		
		
		
	}
	
}
