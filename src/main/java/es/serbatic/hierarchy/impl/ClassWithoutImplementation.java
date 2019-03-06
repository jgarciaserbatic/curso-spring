/**
 * 
 */
package es.serbatic.hierarchy.impl;

/**
 * @author jgarcia
 *
 */
public class ClassWithoutImplementation {

	private String mensajeConcreto;
	private String tipo;
	private String mensaje;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getMensajeConcreto() {
		return mensajeConcreto;
	}

	public void setMensajeConcreto(String mensajeConcreto) {
		this.mensajeConcreto = mensajeConcreto;
	}
	@Override
	public String toString() {
		return "ClassWithoutImplementation [mensajeConcreto=" + mensajeConcreto + ", tipo=" + tipo + ", mensaje="
				+ mensaje + "]";
	}
	
}
