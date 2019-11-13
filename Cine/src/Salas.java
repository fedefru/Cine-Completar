
public class Salas {
	
	private int capacidad = 20;
	private String [][] butacas = new String[3][4];
	private int cont = 1;
	
	
	public void llenarButacas() {
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				butacas[i][j]= String.valueOf(cont);
				cont++;
			}
		}
		
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas.length; j++) {
				System.out.println(butacas[i][j]);
			}
		}
	}
}
