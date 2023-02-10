package cuentas;

/**
 * Permite crear objetos de tipo CCuenta
 * @author Cristina Perez Ambrosio
 *
 */
public class CCuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	/**
	 * Constructor por defecto
	 */
	public CCuenta() {
	}
	/**
	 * Constructor por parámetros.
	 * @param nom Parámetro nombre.
	 * @param cue Parámetro cuenta.
	 * @param sal Parámetro saldo.
	 * @param tipo Parámetro tipoInterés
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}
	/**
	 * Método get del atributo nombre.
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método set del atributo nombre.
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Método get del atributo cuenta.
	 * @return cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * Método set del atributo cuenta
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * Método get del atributo saldo.
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Método set del atributo saldo.
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * Método get del atributo tipoInteres.
	 * @return tipoInteres
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}
	/**
	 * Método set del atributo tipoInteres
	 * @param tipoInterés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	public double estado() {
		return saldo;
	}

	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}
}
