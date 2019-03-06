package es.serbatic.collections;

import java.util.Map;

public class MapCollection implements Collection {

	private Map<Key, Value> mapa;

	public Map<Key, Value> getMapa() {
		return mapa;
	}

	public void setMapa(Map<Key, Value> mapa) {
		this.mapa = mapa;
	}

	@Override
	public String toString() {
		return "MapCollection [mapa=" + mapa + "]";
	}
	
	
}
