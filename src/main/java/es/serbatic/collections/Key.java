package es.serbatic.collections;

public class Key {

	private Integer keyNumber;
	private String key;
	public Integer getKeyNumber() {
		return keyNumber;
	}
	public void setKeyNumber(Integer keyNumber) {
		this.keyNumber = keyNumber;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	@Override
	public String toString() {
		return "Key [keyNumber=" + keyNumber + ", key=" + key + "]";
	}
	
	//PUESTO QUE ALGUNAS COLECCIONES NO ADMITEN VALORES DUPLICADOS, DEBEMOS IMPLEMENTAR EL MÉTODO equals y hashCode
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
