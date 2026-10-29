import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        final String CORRECTA = "programacion101";
        String contraseña;
        do {
            System.out.println("Introduce una contraseña:");
            contraseña = sc.nextLine();
        } while (!contraseña.equals(CORRECTA));
        System.out.println("Acceso concedido");
    }
}