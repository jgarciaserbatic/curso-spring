package es.serbatic.autowire;

import es.serbatic.collections.MapCollection;
import es.serbatic.hierarchy.impl.ClassWithoutImplementation;
import es.serbatic.scope.SingletonObject;

public class ComplexObjectConcreteType {
	
	private ClassWithoutImplementation implementationClass;
	private SingletonObject singletonBean;
	private MapCollection collection;
	
	public ComplexObjectConcreteType() {
		super();
	}

	public ComplexObjectConcreteType(ClassWithoutImplementation implementationClass, SingletonObject singletonBean,
			MapCollection collection) {
		super();
		this.implementationClass = implementationClass;
		this.singletonBean = singletonBean;
		this.collection = collection;
	}

	public ClassWithoutImplementation getImplementationClass() {
		return implementationClass;
	}

	public void setImplementationClass(ClassWithoutImplementation implementationClass) {
		this.implementationClass = implementationClass;
	}

	public SingletonObject getSingletonBean() {
		return singletonBean;
	}

	public void setSingletonBean(SingletonObject singletonBean) {
		this.singletonBean = singletonBean;
	}

	public MapCollection getCollection() {
		return collection;
	}

	public void setCollection(MapCollection collection) {
		this.collection = collection;
	}

	@Override
	public String toString() {
		return "ComplexObjectConcreteType [implementationClass=" + implementationClass + ", singletonBean="
				+ singletonBean + ", collection=" + collection + "]";
	}
	
}
