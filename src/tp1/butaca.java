package tp1;

public class butaca {

//	private char fila [] = {'a','b','c','d','e','f','g','h','i','j'};
//	private int columna [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
	private String butaca[][] = new String[10][14];
	private butaca[] butacasLibres = new butaca [140];

	public butaca() {
		for (int i = 0; i < butaca.length; i++) {
			for (int j = 0; j < butaca[i].length; j++) {
				if (butaca[i][j] == null) {
					this.butaca[i][j] = (char) ('A' + j) + "" + (butaca.length - i);
				}
			}
		}
	}

//	public String[] mostrarButacasLibres() {
//		for (int i = 0; i < butaca.length; i++) {
//			for (int j = 0; j < butaca[i].length; j++) {
//				String tempButaca = butaca[i][j];
//				if (butaca[i][j] != null) {
//					for (int k = 0; k < butaca.length; k++) {
//						if (butacasLibres[k] == null) {
//							butacasLibres[k]= butaca[k];			
//						}
//					}
//				}
//			}
//		}
//		return butacasLibres;
//	}

//	public String[] getButacasLibres() {
//		for(int i =0; i<butacasLibres.length;i++) {
//		return butacasLibres[i];
//		}
//	}
//
//	public void setButacasLibres(String[] butacasLibres) {
//		this.butacasLibres = butacasLibres;
//	}
//
//	@Override
//	public String toString() {
//		return "butaca [butacasLibres=" + Arrays.toString(butacasLibres) + "]";
//	}
//	
//	

}
