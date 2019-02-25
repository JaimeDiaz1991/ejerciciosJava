package test;

import EjerciciosTema10_1.Biblioteca;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BibliotecaTest {

  // No se puede hacer prestamos porque no hay libros disponibles
  @Test
  public void prestamoTestKO(){

    Biblioteca biblioteca = new Biblioteca();
    biblioteca.setAutor("WillyFox");
    biblioteca.setTitulo("Perros");
    biblioteca.setEjemplares(1);
    biblioteca.setEjemplares_prestados(1);
    biblioteca.prestamo();
    Assert.assertFalse(biblioteca.prestamo());

  }

  @Test
  public void prestamoVariosTestKO(){

    Biblioteca biblioteca = new Biblioteca();
    biblioteca.setAutor("WillyFox");
    biblioteca.setTitulo("Perros");
    biblioteca.setEjemplares(4);
    biblioteca.setEjemplares_prestados(1);

    Assert.assertTrue(biblioteca.prestamo());
    Assert.assertTrue(biblioteca.prestamo());
    Assert.assertTrue(biblioteca.prestamo());
    Assert.assertTrue(biblioteca.prestamo());
    Assert.assertFalse(biblioteca.prestamo());

  }

  // Si se puede hacer prestamos porque hay libros disponibles
  @Test
  public void prestamoTestOK(){

    Biblioteca biblioteca = new Biblioteca();
    biblioteca.setAutor("WillyFox");
    biblioteca.setTitulo("Perros");
    biblioteca.setEjemplares(10);
    biblioteca.setEjemplares_prestados(1);
    Assert.assertTrue(biblioteca.prestamo());
    Assert.assertEquals(2,biblioteca.getEjemplares_prestados());
  }

  @Test
  public void prestamoVariosTestOK(){

    Biblioteca biblioteca = new Biblioteca();
    biblioteca.setAutor("WillyFox");
    biblioteca.setTitulo("Perros");
    biblioteca.setEjemplares(5);
    biblioteca.setEjemplares_prestados(1);
    //5 veces
    Assert.assertTrue(biblioteca.prestamo());
    Assert.assertEquals(2,biblioteca.getEjemplares_prestados());
    Assert.assertEquals(4,biblioteca.getEjemplares());
    Assert.assertTrue(biblioteca.prestamo());
    Assert.assertEquals(3,biblioteca.getEjemplares_prestados());
    Assert.assertEquals(3,biblioteca.getEjemplares());
    Assert.assertTrue(biblioteca.prestamo());
    Assert.assertEquals(4,biblioteca.getEjemplares_prestados());
    Assert.assertEquals(2,biblioteca.getEjemplares());
    Assert.assertTrue(biblioteca.prestamo());
    Assert.assertEquals(5,biblioteca.getEjemplares_prestados());
    Assert.assertEquals(1,biblioteca.getEjemplares());

  }



    // Si se puede devolver porque hay libros prestados
  @Test
  public void devolucionTestOK(){

    Biblioteca biblioteca = new Biblioteca();
    biblioteca.setAutor("WillyFox");
    biblioteca.setTitulo("Perros");
    biblioteca.setEjemplares(1);
    biblioteca.setEjemplares_prestados(1);

    //Assert.assertTrue(biblioteca.devolucion());
    Assert.assertEquals(0,biblioteca.getEjemplares_prestados());

  }

  @Test
  public void devolucionVariosTestOK(){

    Biblioteca biblioteca = new Biblioteca();
    biblioteca.setAutor("WillyFox");
    biblioteca.setTitulo("Perros");
    biblioteca.setEjemplares(4);
    biblioteca.setEjemplares_prestados(3);

//    Assert.assertTrue(biblioteca.devolucion());
    Assert.assertEquals(2,biblioteca.getEjemplares_prestados());

//    Assert.assertTrue(biblioteca.devolucion());
    Assert.assertEquals(1,biblioteca.getEjemplares_prestados());

//    Assert.assertTrue(biblioteca.devolucion());
    Assert.assertEquals(0,biblioteca.getEjemplares_prestados());
  }

  // No se puede puede devolver porque no hay libros prestados
  @Test
  public void devolucionTestKO(){

    Biblioteca biblioteca = new Biblioteca();
    biblioteca.setAutor("WillyFox");
    biblioteca.setTitulo("Perros");
    biblioteca.setEjemplares(10);
    biblioteca.setEjemplares_prestados(0);
//    Assert.assertFalse(biblioteca.devolucion());
  }

  @Test
  public void devolucionVariosTestKO(){

    Biblioteca biblioteca = new Biblioteca();
    biblioteca.setAutor("WillyFox");
    biblioteca.setTitulo("Perros");
    biblioteca.setEjemplares(10);
    biblioteca.setEjemplares_prestados(2);

//    Assert.assertTrue(biblioteca.devolucion());
    Assert.assertEquals(1,biblioteca.getEjemplares_prestados());

//    Assert.assertTrue(biblioteca.devolucion());
    Assert.assertEquals(0,biblioteca.getEjemplares_prestados());

//    Assert.assertFalse(biblioteca.devolucion());
  }


}
