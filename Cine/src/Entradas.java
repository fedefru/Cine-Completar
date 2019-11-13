import java.util.Scanner;

public class Entradas {
	
	
	private int entradas;
	private int evaluoEntrada;
	private int[] precios = {15,20,18};
	private int total;
	private String rta;
	
	Scanner scn = new Scanner(System.in);
	
	public void calculaPrecio() {
		
		do {
		
		System.out.println("Cuantas entradas desea adquirir? ");
		entradas = scn.nextInt();
		
		for (int j = 1; j <= entradas; j++) {
			
			System.out.println("Precio de la entrada n°"+(j)+" || 1 = $15{ninio} 2 = $20{adulto} 3 = 18{mayor}");
			evaluoEntrada = scn.nextInt();
			
			switch(evaluoEntrada) {
			
			case 1: total = total + precios[0];
			break;
			
			case 2: total = total + precios[1];
			break;
			
			case 3: total = total + precios[2];
			break;
			}
			
			
		}
		
		System.out.println("Total $"+total);
		System.out.println("Desea comprar mas entradas?  s | n");
		
		rta = scn.next();
		
		}while(rta.equals("s"));
		
		
		
	}

}
