import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DispositivoElectronico dispositivo = null;

        while (true) {
            System.out.println("Seleccione el tipo de dispositivo:");
            System.out.println("1. Laptop");
            System.out.println("2. Desktop");
            System.out.println("3. Smartphone");
            System.out.println("4. Tablet");
            System.out.println("5. Refrigerador");
            System.out.println("0. Salir");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    dispositivo = new Laptop();
                    break;
                case 2:
                    dispositivo = new Desktop();
                    break;
                case 3:
                    dispositivo = new Smartphone();
                    break;
                case 4:
                    dispositivo = new Tablet();
                    break;
                case 5:
                    dispositivo = new Refrigerador();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida");
                    continue;
            }

            if (dispositivo != null) {
                dispositivo.metodo1();
                dispositivo.metodo21();
            }
        }
    }
}

