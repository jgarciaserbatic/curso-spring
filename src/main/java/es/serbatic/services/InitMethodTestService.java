/**
 * 
 */
package es.serbatic.services;

/**
 * Servicio para testear el atributo init-method de spring core
 * @author jgarcia
 *
 */
public class InitMethodTestService {

	public void init() {
		System.out.println("Se ha invocado al método init()");
	}
	
	public void destroy() {
		System.out.println("Se ha invocado al método destroy()");
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Se ha invocado al método finalize()");
	}
	
}
