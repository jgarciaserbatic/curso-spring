package es.serbatic.collections;

import java.util.List;

public class ListCollection implements Collection {
	private List<String> lista;

	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "ListCollection [lista=" + lista + "]";
	}
}
