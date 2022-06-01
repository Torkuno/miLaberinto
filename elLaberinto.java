import java.util.Arrays;
import java.util.Scanner;

public class elLaberinto{

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

        int posicionX = 10;
        int posicionY = 1;
        
        Scanner entrada = new Scanner(System.in);
        String inputUsuario;
        do {
            inputUsuario = entrada.nextLine();
                if (inputUsuario.equals("w") && (elMapa[posicionY - 1][posicionX]!=0)) {posicionY = posicionY - 1;} else
                if (inputUsuario.equals("s") && (elMapa[posicionY + 1][posicionX]!=0)) {posicionY = posicionY + 1;} else
                if (inputUsuario.equals("a") && (elMapa[posicionY][posicionX - 1]!=0)) {posicionX = posicionX - 1;} else
                if (inputUsuario.equals("d") && (elMapa[posicionY][posicionX + 1]!=0)) {posicionX = posicionX + 1;}

            for (int i=0 ; i < elMapa.length; i++){
                for (int j=0; j < elMapa[i].length; j++){

                    if (i == posicionY && j == posicionX) {System.out.print("\\O/ ");} else
                    if (elMapa[i][j] == 0) {System.out.print("[#] ");} else
                    if (elMapa[i][j] == 1) {System.out.print(". * ");} else
                    if (elMapa[i][j] == 2) {System.out.print("~ ~ ");} else
                    if (elMapa[i][j] == 3) {System.out.print("    ");}
                }
                System.out.println();
            }

        } while (true);
    }
}
