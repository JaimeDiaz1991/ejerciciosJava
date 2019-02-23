package EjerciciosTema10_1;


/*	•	Constructor por defecto.
• este no le tengo	Constructor con parámetros, todos los posibles constructores.
•	Métodos Setters/getters
Método préstamo 
Método devolución 
Método Mostrar*/


public class Biblioteca {
		private String Titulo;
		private String Autor;
		private int ejemplares;
		private int ejemplares_prestados;
		
		public Biblioteca() {
			
		}
		public Biblioteca(int ejemplares) {
			this.ejemplares = ejemplares;
		}
		public Biblioteca(String titulo) {
			Titulo = titulo;
		}
		public Biblioteca(int ejemplares, int ejemplares_prestados) {
			super();
			this.ejemplares = ejemplares;
			this.ejemplares_prestados = ejemplares_prestados;
		}
		public Biblioteca(String titulo, String autor) {
			Titulo = titulo;
			Autor = autor;
		}

		public Biblioteca(String autor, int ejemplares_prestados) {
			Autor = autor;
			this.ejemplares_prestados = ejemplares_prestados;
		}
		public Biblioteca(String autor, int ejemplares, int ejemplares_prestados) {
			Autor = autor;
			this.ejemplares = ejemplares;
			this.ejemplares_prestados = ejemplares_prestados;
		}


		public Biblioteca(String titulo, String autor, int ejemplares_prestados) {
			Titulo = titulo;
			Autor = autor;
			this.ejemplares_prestados = ejemplares_prestados;
		}
		public Biblioteca(String titulo, String autor, int ejemplares, int ejemplares_prestados) {
			super();
			Titulo = titulo;
			Autor = autor;
			this.ejemplares = ejemplares;
			this.ejemplares_prestados = ejemplares_prestados;
		}

		public boolean prestamo() {
			boolean b;
			b=false;
			if(ejemplares>0) {	
				b=true;
			ejemplares--;
			ejemplares_prestados++;
			}
			return b;
		}
		public void devolucion() {
				ejemplares++;
				ejemplares_prestados--;
		}

		public String getTitulo() {
			return Titulo;
		}

		public void setTitulo(String titulo) {
			Titulo = titulo;
		}

		public String getAutor() {
			return Autor;
		}

		public void setAutor(String autor) {
			Autor = autor;
		}

		public int getEjemplares() {
			return ejemplares;
		}

		public void setEjemplares(int ejemplares) {
			this.ejemplares = ejemplares;
		}

		public int getEjemplares_prestados() {
			return ejemplares_prestados;
		}

		public void setEjemplares_prestados(int ejemplares_prestados) {
			this.ejemplares_prestados = ejemplares_prestados;
		}

}
