package PracticoCondicionalesRepetitivas;

import java.util.Scanner;

public class Ejercicio3B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        System.out.println("\nHola muy buenas y bienvenido a tu planificadora de viajes con alto prestigio en busqueda.");
        System.out.println("\nA continuación cada opción contendra una localidad distinta con su respectivo precio y tiempo de duración definido.");
        System.out.println("\nEsperamos cumplir con tus expectativas, ahi van las distintas opciones: ");

        System.out.println("Tenemos 3 localidades distintas para ti...");
        System.out.println("\n1. España ");
        System.out.println("\n2. Francia ");
        System.out.println("\n3. Italia ");
        System.out.println("Dinos si alguna es de tu interes...si ninguna de las opciones es de tu interes escribe el numero 4 para terminar la busqueda.");
        opcion = sc.nextInt();


        if (opcion == 1){
            System.out.println("Si eliges la opción numero 1...");
            System.out.println("\nCiudad de destino: Barcelona");
            System.out.println("**Costo aproximado:**\n" +
                    "  - **Vuelo de ida (de tu ciudad a Barcelona):** $300\n" +
                    "  - **Alojamiento (5 noches en un hostel):** $150 ($30/noche)\n" +
                    "  - **Comidas (5 días):** $150 ($30/día)\n" +
                    "  - **Transporte local:** $50\n" +
                    "  - **Entradas a atracciones (Sagrada Familia, Parque Güell, etc.):** $100\n" +
                    "- **Total:** **$750**");
        } else if (opcion == 2) {
            System.out.println("Si eliges la opcion numero 2...");
            System.out.println("\nCiudad de destino: París");
            System.out.println("- **Costo aproximado:**\n" +
                    "  - **Vuelo de ida (de tu ciudad a París):** $285\n" +
                    "  - **Alojamiento (5 noches en un hostel):** $150 ($30/noche)\n" +
                    "  - **Comidas (5 días):** $150 ($30/día)\n" +
                    "  - **Transporte local:** $30\n" +
                    "  - **Entradas a atracciones (Torre Eiffel, Louvre, etc.):** $100\n" +
                    "- **Total:** **$715**");
        } else if (opcion == 3) {
            System.out.println("Si eliges la opcion numero 3...");
            System.out.println("\nCiudad de destino: Italia");
            System.out.println("- **Costo aproximado:**\n" +
                    "  - **Vuelo de ida (de tu ciudad a Italia):** $350\n" +
                    "  - **Alojamiento (5 noches en un hostel):** $150 ($30/noche)\n" +
                    "  - **Comidas (5 días):** $110 ($22/día)\n" +
                    "  - **Transporte local:** $45\n" +
                    "  - **Entradas a atracciones (Coliseo, Vaticano, etc.):** $125\n" +
                    "- **Total:** **$735**");
        } else if (opcion == 4) {
            System.out.println("Lamentamos que ninguna de nuestras opciones le pudiera interesar.");
            System.out.println("De igual forma le agradecemos por su tiempo.");
        } else {
            System.out.println("Error!!! La opcion que usted ingreso no concuerda con las presentes. Intente nuevamente...");
        }
        System.out.println("Muchas gracias y saludos cordiales.");

    }
}