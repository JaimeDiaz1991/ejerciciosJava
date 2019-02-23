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
			Biblioteca libro3=new Biblioteca("Lazarrillo de tormes","Juan Bosco", 20 );
			Biblioteca libro4=new Biblioteca("Teo aprende a Progamar","Satanas",5);
			libreria.add(libro3);
			libreria.add(libro4);
			//************************************* menu***************************
			System.out.println("Que desea realizar "
					+ " \n 1.- Pedir un prestamo "
					+ "\n  2.- Realizar una devolucion "
					+ "\n  3.- Salir del programa");
				opcion=teclado.nextInt();
				teclado.nextLine();
			switch (opcion) {
			case 1:
				System.out.println("Que libro desea elejir"
						+ "\n"+libro1.getTitulo()+""
						+ "\n"+libro2.getTitulo()+""
						+ "\n"+libro3.getTitulo()+""
						+ "\n"+libro4.getTitulo()+"");
				aux=teclado.nextLine();

				for (int i=0;i<libreria.size();i++) {
				if(aux.equals(libreria.get(i).getTitulo())) {
					opcion=i;
				System.out.println(libreria.get(i));
				System.out.println("ESto es antes  "+libreria.get(i).getEjemplares()
					+libreria.get(i).getEjemplares_prestados());
				libreria.get(i).prestamo();	
				System.out.println("esto es despues   "+libreria.get(i).getEjemplares()
						+libreria.get(i).getEjemplares_prestados());
				}
				}
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			}
		}
	
}
