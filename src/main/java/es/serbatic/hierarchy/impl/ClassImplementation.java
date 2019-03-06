/**
 * 
 */
package es.serbatic.hierarchy.impl;

import es.serbatic.hierarchy.ClaseAbstracta;

/**
 * @author jgarcia
 *
 */
public class ClassImplementation extends ClaseAbstracta {

	private String mensajeConcreto;

	public String getMensajeConcreto() {
		return mensajeConcreto;
	}

	public void setMensajeConcreto(String mensajeConcreto) {
		this.mensajeConcreto = mensajeConcreto;
	}

	@Override
	public String toString() {
		return "ClassImplementation [mensajeConcreto=" + mensajeConcreto + " tipo=\"" + getTipo() + "\", mensaje=\"" + getMensaje() + "\"]";
	}
	
	
}
