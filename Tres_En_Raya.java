package Juegos;
import java.util.Scanner;

public class Tres_En_Raya {
    private static char[][] tablero = new char[3][3];
    private static char jugadorActual = 'X';

    public static void main(String[] args) {
        inicializarTablero();
        jugar();
    }

    private static void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-'; // Inicializar el tablero con '-'
            }
        }
    }

    private static void jugar() {
        boolean juegoEnMarcha = true;
        Scanner scanner = new Scanner(System.in);

        while (juegoEnMarcha) {
            imprimirTablero();
            movimientoJugador(scanner);
            juegoEnMarcha = !verificarGanador();
            if (!juegoEnMarcha) {
                imprimirTablero(); // Imprimir el tablero final
                System.out.println("¡Jugador " + jugadorActual + " gana!");
            } else if (tableroCompleto()) {
                imprimirTablero(); // Imprimir el tablero final
                System.out.println("¡Es un empate!");
                juegoEnMarcha = false;
            }
            cambiarJugador();
        }

        scanner.close();
    }

    private static void imprimirTablero() {
        System.out.println("Tablero actual:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) System.out.print(" | "); // Separador vertical
            }
            System.out.println();
            if (i < 2) System.out.println("---------"); // Separador horizontal
        }
        System.out.println(); // Línea en blanco para separar el tablero de la siguiente entrada
    }

    private static void movimientoJugador(Scanner scanner) {
        int fila, columna;
        while (true) {
            System.out.println("Jugador " + jugadorActual + ", ingresa tu movimiento (fila y columna): ");
            fila = scanner.nextInt() - 1; // Convertir a índice (0-2)
            columna = scanner.nextInt() - 1; // Convertir a índice (0-2)
            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == '-') {
                tablero[fila][columna] = jugadorActual; // Actualizar el tablero
                break; // Salir del bucle si el movimiento es válido
            } else {
                System.out.println("Movimiento inválido, intenta de nuevo."); // Mensaje de error
            }
        }
    }

    private static boolean verificarGanador() {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) ||
                    (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual)) {
                return true; // Se encontró un ganador
            }
        }
        // Verificar diagonales
        if ((tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) ||
                (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual)) {
            return true; // Se encontró un ganador
        }
        return false; // No hay ganador
    }

    private static boolean tableroCompleto() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '-') {
                    return false; // Hay espacio disponible
                }
            }
        }
        return true; // No hay espacios disponibles
    }

    private static void cambiarJugador() {
        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X'; // Cambiar de jugador
    }
}
