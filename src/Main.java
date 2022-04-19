import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombre;
        int velocidadx;
        int velocidadY;
        int coordenadaX;
        int coordenadaY;
        int direccionX;
        int direccionY;
        int opcion;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el nombre de la nave:");
        nombre = scanner.next();

        System.out.println("Introduzca la velocidad x de la nave:");
        velocidadx = scanner.nextInt();

        System.out.println("Introduzca la velocidad y de la nave:");
        velocidadY = scanner.nextInt();

        System.out.println("Introduzca la coordenada x de la nave:");
        coordenadaX= scanner.nextInt();

        System.out.println("Introduzca la coordenada Y de la nave:");
        coordenadaY= scanner.nextInt();

        System.out.println("Introduzca la direccion X de la nave:");
        direccionX= scanner.nextInt();

        System.out.println("Introduzca la direccion Y de la nave:");
        direccionY= scanner.nextInt();






        SpaceShip nave = new SpaceShip(nombre,velocidadx,velocidadY,coordenadaX,coordenadaY,direccionX,direccionY);
        System.out.println(nave);

        do{

            System.out.println("Por favor introduzca la opcion de que desee de las siguientes: \n" +
                    "1- Acelerar la nave \n" +
                    "2- Frene la nave \n" +
                    "3- Pare la nave \n " +
                    "4- Salir ");
            opcion= scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("La nave acelera!!!");
                    System.out.println("Las coordenadas de la nave ahora son "+ nave.speedUp());
                    break;
                case 2:
                    System.out.println("La nave frena!!!");
                    System.out.println("Las coordenadas de la nave ahora son "+ nave.brake());
                    break;
                case 3:
                    System.out.println("La nave pare!!!");
                    System.out.println("Las coordenadas de la nave ahora son "+ nave.emergencyStop());
                    break;
                case 4:
                    System.out.println("Salir");
                    break;

            }
        }while(opcion!=4);


    }
}
