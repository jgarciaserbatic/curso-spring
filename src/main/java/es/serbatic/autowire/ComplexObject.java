package es.serbatic.autowire;

import es.serbatic.collections.Collection;
import es.serbatic.hierarchy.impl.ClassImplementation;
import es.serbatic.scope.SingletonObject;

public class ComplexObject {

	private ClassImplementation implementationClass;
	private SingletonObject singletonBean;
	private Collection collection;
	
	
	public ComplexObject() {
		super();
	}


	public ComplexObject(ClassImplementation implementationClass, SingletonObject singletonBean,
			Collection mapCollection) {
		super();
		this.implementationClass = implementationClass;
		this.singletonBean = singletonBean;
		this.collection = mapCollection;
	}


	public ClassImplementation getImplementationClass() {
		return implementationClass;
	}


	public void setImplementationClass(ClassImplementation implementationClass) {
		this.implementationClass = implementationClass;
	}


	public SingletonObject getSingletonBean() {
		return singletonBean;
	}


	public void setSingletonBean(SingletonObject singletonBean) {
		this.singletonBean = singletonBean;
	}


	public Collection getCollection() {
		return collection;
	}


	public void setCollection(Collection collection) {
		this.collection = collection;
	}


	@Override
	public String toString() {
		return "ComplexObject [implementationClass=" + implementationClass + ", singletonBean=" + singletonBean
				+ ", collection=" + collection + "]";
	}
	
}
