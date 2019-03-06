/**
 * 
 */
package es.serbatic.services;

import es.serbatic.scope.PrototypeObject;
import es.serbatic.scope.SingletonObject;

/**
 * Testea los diferentes scopes de un bean en spring core
 * 
 * @author jgarcia
 */
public class ScopeTestService {

	private SingletonObject singletonObject;
	private PrototypeObject prototypeObject;
	
	public void testSingletonObject(SingletonObject singletonObject) {
		System.out.println(singletonObject.equals(this.singletonObject) ? "El objeto " + singletonObject + " es SINGLETON": "El objeto " + singletonObject + " NO es SINGLETON");
	}

	public void testPrototypeObject(PrototypeObject prototypeObject) {
		System.out.println(!prototypeObject.equals(this.prototypeObject) ? "El objeto " + prototypeObject + " es PROTOTYPE": "El objeto " + prototypeObject + " NO es PROTOTYPE");
	}

	public SingletonObject getSingletonObject() {
		return singletonObject;
	}

	public void setSingletonObject(SingletonObject singletonObject) {
		this.singletonObject = singletonObject;
	}

	public PrototypeObject getPrototypeObject() {
		return prototypeObject;
	}

	public void setPrototypeObject(PrototypeObject prototypeObject) {
		this.prototypeObject = prototypeObject;
	}
}
