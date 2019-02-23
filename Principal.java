package EjerciciosTema10_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	/*Para crear los dos primeros objetos, pediremos por teclado los datos
	 *  y utilizaremos los métodos setters.
	 *  Para crear los dos restantes objetos, utilizaremos constructores.*/
	private static Biblioteca libro1;
	private static Biblioteca libro2;
	static ArrayList <Biblioteca> libreria = new ArrayList<Biblioteca>(); 
			static Scanner teclado=new Scanner(System.in);
			static String titulo;
			static String autor;
			static int ejemplares;
			
		public static void CargarDatos() {
				System.out.println("Introduce el titulo del libro ");
				titulo =teclado.nextLine();
				
				System.out.println("Introduce el autor de libros ");
				autor =teclado.nextLine();
				
				System.out.println("Introduce la cantidad de ejemplares");
				ejemplares=teclado.nextInt();
				teclado.nextLine();
				
		}
			
		public static void main(String[] args) {
			int opcion;
			String aux;
			Biblioteca libro1=new Biblioteca();
			Biblioteca libro2=new Biblioteca();
//**************************** crear los objetos de la clase ************************		
			CargarDatos();
				libro1.setTitulo(titulo);
				libro1.setAutor(autor);
				libro1.setEjemplares(ejemplares);
				libreria.add(libro1);
			CargarDatos();
				libro2.setTitulo(titulo);
				libro2.setAutor(autor);
				libro2.setEjemplares(ejemplares);
				libreria.add(libro2);
			//********************* creamos los otros dos objetos con constructores
			Biblioteca libro3=new Biblioteca("Lazarillo de Tormes","Juan Bosco", 20,0 );
			Biblioteca libro4=new Biblioteca("Teo aprende a Progamar","Satanas",5,0);
			libreria.add(libro3);
			libreria.add(libro4);
			//************************************* menu***************************
			do {
			System.out.println("Que desea realizar "
					+ " \n 1.- Pedir un prestamo "
					+ "\n  2.- Realizar una devolucion "
					+ "\n  3.- Ver libro "
					+ "\n  4.- Salir");
				opcion=teclado.nextInt();
				teclado.nextLine();
		

				switch (opcion) {
			case 1:	
				System.out.println("Los libros disponibles son :"
						+ "\n"+libro1.getTitulo()+""
						+ "\n"+libro2.getTitulo()+""
						+ "\n"+libro3.getTitulo()+""
						+ "\n"+libro4.getTitulo()+""
						+"\n Elija un libro");
				aux=teclado.nextLine();

				for (int i=0;i<libreria.size();i++) {
				if(aux.equalsIgnoreCase(libreria.get(i).getTitulo())) {
					opcion=i;}}
					if(libreria.get(opcion).prestamo()==true) {
				//me llevo la posicion del arrylist al metod de prestamo
				libreria.get(opcion).prestamo();
				System.out.println("El Libro "+libreria.get(opcion).getTitulo()+" a sido prestado ");
				//a esta altura la cantidad de libros prestados y su cantidad a variado
				}else {System.out.println("El libro esta agotado");}
				
				break;
			case 2:
				System.out.println("Los libros disponibles son :"
						+ "\n"+libro1.getTitulo()+""
						+ "\n"+libro2.getTitulo()+""
						+ "\n"+libro3.getTitulo()+""
						+ "\n"+libro4.getTitulo()+""
						+"\n Elija un libro");
				aux=teclado.nextLine();

				for (int i=0;i<libreria.size();i++) {
					if(aux.equalsIgnoreCase(libreria.get(i).getTitulo())) {
						opcion=i;
					}
					}
				libreria.get(opcion).devolucion();
				break;
				
			case 3:
				for (int i=0;i<libreria.size();i++) {
				System.out.println("Titulo : "+libreria.get(i).getTitulo()
						+"\n  Autor : "+libreria.get(i).getAutor()
						+"\n Ejemplares Disponibles : "+libreria.get(i).getEjemplares() 
						+"\n Ejemplares Prestados : "+libreria.get(i).getEjemplares_prestados());
				}
				break;
			}
				
		}while(opcion!=4);}
	
}
