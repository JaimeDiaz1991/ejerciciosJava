package test;

import EjerciciosTema10_1.Biblioteca;
import EjerciciosTema10_1.Cuenta;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CajeroTest {

  // No se puede hacer prestamos porque no hay libros disponibles
  @Test
  public void ingresoTestKO(){

    Cuenta cuenta = new Cuenta();
    cuenta.setNombre_cliente("WillyFox");
    cuenta.setNumero_cuenta("15869a");
    cuenta.setTipo_interes(1);
    cuenta.setSaldo(123);
    Assert.assertTrue(cuenta.ingreso(50));

  }




}
