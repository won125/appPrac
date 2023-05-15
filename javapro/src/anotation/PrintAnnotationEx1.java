package anotation;

import java.lang.reflect.Method;

public class PrintAnnotationEx1 {

	public static void main(String[] args) {
		Method[] deMethods = Service.class.getDeclaredMethods();
		for(Method m : deMethods) {
			if(m.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnn = m.getAnnotation(PrintAnnotation.class);
				System.out.println("매서드 이름 : "+m.getName());
				for(int i = 0; i<printAnn.number();i++) {
					System.out.print(printAnn.value());
				}
				System.out.println();
			}
		}

	}

}
