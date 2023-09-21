import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }
    public void Menu(){
        int selec;
        do {
            System.out.println("¡Bienvenido al Sistema!");
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Listar los discos");
            System.out.println("2.Listar las películas");
            System.out.println("3. Comprar una película o disco");
            System.out.println("4. Listar los clientes");
            System.out.println("5. Salir");
            Scanner scanmenu = new Scanner(System.in);
            selec = scanmenu.nextInt();
            switch (selec){
                case 1:
            }
        }
        while (selec!=5);
    }



}