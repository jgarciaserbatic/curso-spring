package es.serbatic.pojo;

public class InnerBean {

	private String innerProperty;

	public String getInnerProperty() {
		return innerProperty;
	}

	public void setInnerProperty(String innerProperty) {
		this.innerProperty = innerProperty;
	}

	@Override
	public String toString() {
		return "InnerBean [innerProperty=" + innerProperty + "]";
	}
	
}
