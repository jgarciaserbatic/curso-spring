package es.serbatic.collections;

public class Value {

	private Integer valueCode;
	private String valueDescription;
	
	public Integer getValueCode() {
		return valueCode;
	}
	public void setValueCode(Integer valueCode) {
		this.valueCode = valueCode;
	}
	public String getValueDescription() {
		return valueDescription;
	}
	public void setValueDescription(String valueDescription) {
		this.valueDescription = valueDescription;
	}
	@Override
	public String toString() {
		return "Value [valueCode=" + valueCode + ", valueDescription=" + valueDescription + "]";
	}
	
	
	
}
