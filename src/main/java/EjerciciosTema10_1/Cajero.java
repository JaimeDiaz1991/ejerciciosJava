package EjerciciosTema10_1;

import java.util.*;

public class Cajero {
  static Scanner teclado=new Scanner(System.in);
  static ArrayList<Cuenta>clientes= new ArrayList<Cuenta>();
  static int opcion;
  static int aux;
  static boolean bandera=false;
  //metodo para buscar la cuenta a actualizar asi como un poco mas de seguridad al comprobar
  //nombre y  numero de cuenta
  public static void cargar() {
    String nombre;
    String numero;
    do {
      System.out.println("Introduzca el nombre del cliente ");
      nombre=teclado.nextLine();
      System.out.println("introduzca el numero de la cuenta ");
      numero =teclado.nextLine();


      for (int i=0;i<clientes.size();i++) {
        if (nombre.equalsIgnoreCase(clientes.get(i).getNombre_cliente())&& numero.equalsIgnoreCase(clientes.get(i).getNumero_cuenta())) {
          aux=i;
          bandera=true;
          menu(clientes.get(i));
        }
      }
      if(bandera==false) {
        System.out.println("El nombre introducido es incorrecto");
      }}while(bandera==false);
    bandera=false;
  }
  // con este menu decido la operacion que quiero realizar
  public static void menu(Cuenta pos) {
    int cantidad;
    String aux;
    do {
      System.out.println("Que operacion desea realizar?"
          + "\n 1.Ingresar dinero"
          + "\n 2.Retirer dinero"
          + "\n 3.Hacer transferencia"
          + "\n 4.Salir");
      opcion=teclado.nextInt();
      teclado.nextLine();
// en esta parte del codigo llamo al metodo que me hara la operacion

      switch (opcion) {
        case 1:
          System.out.println("Que cantidad desea ingresar? ");
          cantidad = teclado.nextInt();
          if(pos.ingreso(cantidad)==true) {
            System.out.println("El saldo de su cuenta es "+pos.getSaldo());
          }else {
            System.out.println("La cantidad introducida tiene que ser mayor a 0");
            System.out.println("el saldo de su cuenta es de "+pos.getSaldo());
          }
          break;
        case 2:
          System.out.println("Que cantidad desea retirar? ");
          cantidad = teclado.nextInt();
          if (pos.extraer(cantidad)==true) {
            System.out.println("Su dinero a sido retirado "
                + "\n El saldo de su cuenta es"+pos.getSaldo());
          }else {System.out.println("La cantidad introducida no es correcta"
              + "\n El saldo de su cuenta es "+pos.getSaldo());}
          break;
        case 3:
          System.out.println("Introduzca el numero de la cuenta al que va a realizar la transferencia");
          aux=teclado.nextLine();
          for (int i=0;i<clientes.size();i++) {
            if (aux.equalsIgnoreCase(clientes.get(i).getNumero_cuenta())) {
              System.out.println("Que cantidad desea transferir");
              cantidad=teclado.nextInt();

              if ( pos.transferencia(clientes.get(i),cantidad)==true){
                bandera=true;
                System.out.println("Su transferencia a sido realizada");
              }else {if (pos.transferencia(clientes.get(i),cantidad)==false) {
                System.out.println("Su transferencia no se a podido realizar por motivos de money");
              }}


            }
          }
          if (bandera == false ) {
            System.out.println("El nombre introducido es incorrecto");
          }
          bandera=false;
          break;

      }
    }while(opcion!=4);
    cargar();
  }


  public static void main(String[] args) {
    //creo los 4 objetos de la clase de cuenta mediante constructores y los introduzco
    //dentro del arraylist que e credo de la otra clase cuenta.
    Cuenta cliente1=new Cuenta("Ramon","3215B",1.15,2500);
    Cuenta cliente2=new Cuenta("Juan","1234A",0.15,0);
    Cuenta cliente3=new Cuenta("Maria","0258B",0.5,700);
    Cuenta cliente4=new Cuenta("Tomas","8520L",0.35,0);
    clientes.add(cliente1);
    clientes.add(cliente2);
    clientes.add(cliente3);
    clientes.add(cliente4);
// desde aqui empieza mi programa llamando a mi metodo
    cargar();


  }

}