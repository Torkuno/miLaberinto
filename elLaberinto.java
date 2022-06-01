import java.util.Arrays;
import java.util.Scanner;

class elLaberinto{

    private static int posicionX, posicionY;

    public static void main (String[] args){

        int[][] elMapa = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,1,0,0,0,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,3,1,1,1,0,3,0,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,0,0,0,1,1,1,1,1,1,1},
            {2,1,1,1,1,1,1,1,1,1,1,1,1,3,1,1,1,1,1,1,1,1,1,1,1,1},
            {2,2,1,1,1,1,1,1,1,1,1,1,1,3,1,1,1,1,1,1,1,1,1,1,1,1},
            {2,2,2,2,2,1,1,1,1,1,1,1,0,3,0,1,1,1,1,1,1,1,1,1,1,1},
            {2,2,2,2,2,2,2,2,2,2,2,2,0,3,0,2,2,2,2,2,2,2,2,2,2,2},
            {2,2,1,1,1,1,1,1,1,1,1,1,0,3,0,1,1,1,1,1,1,1,1,1,1,2},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,0,0,0,3,1,1,1,3,0,0,0,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,0,3,0,3,1,1,1,3,0,3,0,1,1,0,0,0,1,1,1,1},
            {1,1,1,1,1,1,0,0,0,3,1,1,1,3,0,0,0,1,1,0,3,0,1,1,1,1},
            {1,1,1,1,1,1,3,3,3,3,3,3,3,3,1,1,1,1,1,0,3,0,1,1,1,1},
            {1,1,1,1,1,1,0,0,0,0,3,3,3,3,3,3,3,3,3,0,3,0,1,1,1,1},
            {1,1,1,1,1,1,0,3,3,0,3,0,0,0,0,0,0,1,1,0,3,0,1,1,1,1},
            {1,1,1,1,1,1,0,3,3,0,3,0,3,3,3,3,0,1,1,0,0,0,1,1,1,1},
            {1,1,1,1,1,1,0,0,0,0,3,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1}
        };

        posicionX = 10;
        posicionY = 1;

        do {
			imprimeMapa(unMapa);
		} while (procesaMovimiento(unMapa));
	}

    private static boolean procesaMovimiento(int[][] elMapa){
        
        Scanner entrada = new Scanner(System.in);
        String inputUsuario;

        inputUsuario = entrada.nextLine();
        if (inputUsuario.equals("w") && (elMapa[posicionY - 1][posicionX]!=0)) {posicionY = posicionY - 1;} else
        if (inputUsuario.equals("s") && (elMapa[posicionY + 1][posicionX]!=0)) {posicionY = posicionY + 1;} else
        if (inputUsuario.equals("a") && (elMapa[posicionY][posicionX - 1]!=0)) {posicionX = posicionX - 1;} else
        if (inputUsuario.equals("d") && (elMapa[posicionY][posicionX + 1]!=0)) {posicionX = posicionX + 1;}
        if (inputUsuario.equals("f")) {return false;}

        return true;
    }

    private static void imprimePared(){
		System.out.print("[#] ");
	}
	
	private static void imprimeSuelo(){
		System.out.print(". * ");
	}

	private static void imprimeAgua(){
		System.out.print("~ ~ ");
	}

    private static void imprimePersonaje(){
		System.out.print("\\O/ ");
	}

    private static void imprimeBordeHorizontal(int laLongitud){

		System.out.print("+");
		for (int j=0;j<laLongitud;j=j+1){
			System.out.print("---");
		}
		System.out.println("+");		
	}

	private static void imprimeBordeVertical(boolean bordeDerecho){
		System.out.print("|");
		if (bordeDerecho) {System.out.println();}
    }

    private static void imprimeMapa(int[][] mapaPorImprimir){
		
		imprimeBordeHorizontal(mapaPorImprimir[0].length);
		
		for (int i=0; i<mapaPorImprimir.length; i=i+1){
			imprimeBordeVertical(false);
			for (int j=0; j<mapaPorImprimir[i].length; j=j+1) {
				if (i==posicionY && j==posicionX) {
					imprimePersonaje();
				} else {
					if (mapaPorImprimir[i][j]==0) {
						imprimeSuelo();	
					} else if (mapaPorImprimir[i][j]==1) {	
						imprimePared();	
					}
				}
			}
			imprimeBordeVertical(true);
		}		
		imprimeBordeHorizontal(mapaPorImprimir[0].length);
		
		System.out.println("Personaje en X:["+posicionX+"] Y:["+posicionY+"]");
	}
}

            //for (int i=0 ; i < elMapa.length; i++){
                //for (int j=0; j < elMapa[i].length; j++){

                    //if (i == posicionY && j == posicionX) {System.out.print("\\O/ ");} else
                    //if (elMapa[i][j] == 0) {System.out.print("[#] ");} else
                    //if (elMapa[i][j] == 1) {System.out.print(". * ");} else
                    //if (elMapa[i][j] == 2) {System.out.print("~ ~ ");} else
                    //if (elMapa[i][j] == 3) {System.out.print("    ");}
                //}
                //System.out.println();
            //}

        //} while (true);
