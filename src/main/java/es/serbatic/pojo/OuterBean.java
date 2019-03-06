package es.serbatic.pojo;

public class OuterBean {

	private InnerBean innerBean;

	public InnerBean getInnerBean() {
		return innerBean;
	}

	public void setInnerBean(InnerBean innerBean) {
		this.innerBean = innerBean;
	}

	@Override
	public String toString() {
		return "OuterBean [innerBean=" + innerBean + "]";
	}
}
