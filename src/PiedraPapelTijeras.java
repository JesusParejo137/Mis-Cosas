import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) throws Exception {

        String[] rps = {"piedra","papel","tijeras"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        Scanner scanner = new Scanner(System.in);
        String playerMove;

        while (true) {
            System.out.println("Por favor, escribe tu jugada (piedra, papel o tijeras): ");
            playerMove = scanner.nextLine();
            if (playerMove.equals("piedra") || playerMove.equals("papel") || playerMove.equals("tijeras")){
                break;
            }
            System.out.println(playerMove + " no es un movimiento válido.");
        }
        System.out.println("Jugada del ordenador: " + computerMove);

        if (playerMove.equals(computerMove)){
            System.out.println("Ha sido un empate!");
        }
        else if (playerMove.equals("piedra")) {
            if (computerMove.equals("papel")) {
                System.out.println("Has perdido!");
            }
            else{
                System.out.println("Has ganado!");
            }
        }
        else if (playerMove.equals("papel")) {
            if (computerMove.equals("tijeras")) {
                System.out.println("Has perdido!");
            }
            else{
                System.out.println("Has ganado!");
            }
        }
        else if (playerMove.equals("tijeras")) {
            if (computerMove.equals("piedra")) {
                System.out.println("Has perdido!");
            }
            else{
                System.out.println("Has ganado!");
            }
        }
    }
}
