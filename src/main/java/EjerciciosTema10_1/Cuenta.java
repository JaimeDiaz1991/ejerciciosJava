package EjerciciosTema10_1;

public class Cuenta {
  private String nombre_cliente;
  private String numero_cuenta;
  private double tipo_interes;
  private double saldo;

  // creo todos los constructores posibles de esta clase
  public Cuenta() {
	  
  }
  public Cuenta(double saldo) {
    super();
    this.saldo = saldo;
  }
  public Cuenta(String nombre_cliente) {
    super();
    this.nombre_cliente = nombre_cliente;
  }
  public Cuenta(String nombre_cliente, double saldo) {
    super();
    this.nombre_cliente = nombre_cliente;
    this.saldo = saldo;
  }
  public Cuenta(double tipo_interes, double saldo) {
    super();
    this.tipo_interes = tipo_interes;
    this.saldo = saldo;
  }
  public Cuenta(String nombre_cliente, String numero_cuenta) {
    super();
    this.nombre_cliente = nombre_cliente;
    this.numero_cuenta = numero_cuenta;
  }
  public Cuenta(String nombre_cliente, double tipo_interes, double saldo) {
    super();
    this.nombre_cliente = nombre_cliente;
    this.tipo_interes = tipo_interes;
    this.saldo = saldo;
  }
  public Cuenta(String nombre_cliente, String numero_cuenta, double tipo_interes) {
    super();
    this.nombre_cliente = nombre_cliente;
    this.numero_cuenta = numero_cuenta;
    this.tipo_interes = tipo_interes;
  }
  public Cuenta(String nombre_cliente, String numero_cuenta, double tipo_interes, double saldo) {
    super();
    this.nombre_cliente = nombre_cliente;
    this.numero_cuenta = numero_cuenta;
    this.tipo_interes = tipo_interes;
    this.saldo = saldo;
  }
  // ahora creo todos los metodos gettes y settes para introducir
  //datos dentro de mis objetos
  public String getNombre_cliente() {
    return nombre_cliente;
  }
  public void setNombre_cliente(String nombre_cliente) {
    this.nombre_cliente = nombre_cliente;
  }
  public String getNumero_cuenta() {
    return numero_cuenta;
  }
  public void setNumero_cuenta(String numero_cuenta) {
    this.numero_cuenta = numero_cuenta;
  }
  public double getTipo_interes() {
    return tipo_interes;
  }
  public void setTipo_interes(double tipo_interes) {
    this.tipo_interes = tipo_interes;
  }
  public double getSaldo() {
    return saldo;
  }
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  //por ultimo creo los metodos pedidos en el enunciado
  public boolean ingreso(int cantidad){
    boolean bandera=false;
    if(cantidad>0) {
      saldo=saldo + cantidad;
      bandera=true;
    }
    return bandera;
  }
  public boolean extraer(int cantidad) {
    boolean bandera1=false;
    if(cantidad>=0 && saldo>=cantidad) {
      saldo=saldo-cantidad;
      bandera1=true;
    }
    return bandera1;
  }
  public boolean transferencia(Cuenta aux,int cantidad) {
    boolean bandera3=false;
    if (saldo>=cantidad) {
      saldo=saldo-cantidad;
      aux.setSaldo(cantidad+aux.getSaldo());
      bandera3=true;
    }
    return bandera3;
  }
}