package es.serbatic.services;

import es.serbatic.scope.ScopeObject;

public class ConstructorArgsTestService {

	private String nombre;
	private ScopeObject scope;
	
	
	/**
	 * Constructor con argumentos porque es el que utilizamos en el ejemplo
	 * @param nombre nombre
	 * @param scope scope
	 */
	public ConstructorArgsTestService(String nombre, ScopeObject scope) {
		super();
		this.nombre = nombre;
		this.scope = scope;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ScopeObject getScope() {
		return scope;
	}
	public void setScope(ScopeObject scope) {
		this.scope = scope;
	}
	@Override
	public String toString() {
		return "ConstructorArgsObject [nombre=" + nombre + ", scope=" + scope + "]";
	}
	
	
}
