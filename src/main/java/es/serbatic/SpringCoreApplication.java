/**
 * 
 */
package es.serbatic;

import org.springframework.context.support.GenericXmlApplicationContext;

import es.serbatic.autowire.ComplexObject;
import es.serbatic.autowire.ComplexObjectConcreteType;
import es.serbatic.collections.ListCollection;
import es.serbatic.collections.MapCollection;
import es.serbatic.collections.PropsCollection;
import es.serbatic.collections.SetCollection;
import es.serbatic.hierarchy.impl.ClassImplementation;
import es.serbatic.hierarchy.impl.ClassWithoutImplementation;
import es.serbatic.pojo.OuterBean;
import es.serbatic.services.ConstructorArgsTestService;
import es.serbatic.services.ScopeTestService;

/**
 * Aplicación que corre con Spring Core
 * 
 * @author jgarcia
 */
public class SpringCoreApplication {

	private static final String CONTEXT_LOCATION = "spring-core-context.xml";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext(CONTEXT_LOCATION);
		testScope(context);
		
		testConstructor(context);
		
		ClassImplementation implementationClass = (ClassImplementation) context.getBean("implementationClass");
		System.out.println("Implementacion: " + implementationClass.toString());
		
		ClassImplementation implementationOverrideClass = (ClassImplementation) context.getBean("implementationOverrideClass");
		System.out.println("Implementacion: " + implementationOverrideClass.toString());
		
		ClassWithoutImplementation implementationWithoutHierarchyClass = (ClassWithoutImplementation) context.getBean("implementationWithoutHierarchyClass");
		System.out.println("Implementacion: " + implementationWithoutHierarchyClass.toString());
		
		testInnerBean(context);
		
		testCollections(context);
		
		testAutowiring(context);
		//Destruimos el contexto para probar que se invoca al método destroy
		context.destroy();
	}
	
	private static void testAutowiring(GenericXmlApplicationContext context) {
		ComplexObject autowireByName = (ComplexObject) context.getBean("autowireByName");
		System.out.println("Autowire by name: " + autowireByName);
		ComplexObjectConcreteType autowireByType = (ComplexObjectConcreteType) context.getBean("autowireByType");
		System.out.println("Autowire by type: " + autowireByType);
		ComplexObject autowireConstructor = (ComplexObject) context.getBean("autowireConstructor");
		System.out.println("Autowire constructor: " + autowireConstructor);
		ComplexObject autowireDefault = (ComplexObject) context.getBean("autowireDefault");
		System.out.println("Autowire default: " + autowireDefault);
		
	}

	private static void testCollections(GenericXmlApplicationContext context) {
		ListCollection listCollection = context.getBean(ListCollection.class);
		System.out.println("LIST COLLECTION: " + listCollection);
		
		SetCollection setCollection = context.getBean(SetCollection.class);
		System.out.println("SET COLLECTION: " + setCollection);
		
		MapCollection mapCollection = context.getBean(MapCollection.class);
		System.out.println("MAP COLLECTION: " + mapCollection);
		
		PropsCollection propsCollection = context.getBean(PropsCollection.class);
		System.out.println("PROPS COLLECTION: " + propsCollection);
	}

	/**
	 * Hace el test de que el inner bean funciona correctamente
	 * @param context Context
	 */
	private static void testInnerBean(GenericXmlApplicationContext context) {
		OuterBean outerBean = context.getBean(OuterBean.class);
		System.out.println(outerBean);
	}
	/**
	 * Hace los tests de la carga de los diferentes tipos de constructores
	 * 
	 * @param context Context
	 */
	private static void testConstructor(GenericXmlApplicationContext context) {
		ConstructorArgsTestService constructorArgsTestService = (ConstructorArgsTestService) context.getBean("constructorArgsTestService");
		System.out.println(constructorArgsTestService.toString());
		
		ConstructorArgsTestService constructorArgsTestServiceByOrder = (ConstructorArgsTestService) context.getBean("constructorArgsTestServiceByOrder");
		System.out.println(constructorArgsTestServiceByOrder.toString());
		
		ConstructorArgsTestService constructorArgsTestServiceByType = (ConstructorArgsTestService) context.getBean("constructorArgsTestServiceByType");
		System.out.println(constructorArgsTestServiceByType.toString());
	}
	/**
	 * Hace los tests del scope de los objetos de contexto Spring
	 * 
	 * @param context Context
	 */
	private static void testScope(GenericXmlApplicationContext context) {
		ScopeTestService scopeTestService = context.getBean(ScopeTestService.class);
		ScopeTestService anotherScopeTestService = context.getBean(ScopeTestService.class);
		
		scopeTestService.testSingletonObject(anotherScopeTestService.getSingletonObject());
		scopeTestService.testPrototypeObject(anotherScopeTestService.getPrototypeObject());
	}

}

