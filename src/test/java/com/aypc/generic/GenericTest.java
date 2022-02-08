package com.aypc.generic;

import java.util.ArrayList;
import java.util.Collection;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GenericTest {
	
	static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
	    for (T o : a) {
	        c.add(o); // Correct
	    }
	}

	@Test
	public void varityTest(){
		
		Object[] oa = new Object[100];
		String[] sa = new String[100];
		
		Collection<Object> co = new ArrayList<Object>();
		Collection<String> cs = new ArrayList<String>();

		// T inferred to be Object
		fromArrayToCollection(oa, co); 

		// T inferred to be String
		fromArrayToCollection(sa, cs);

		// T inferred to be Object
		fromArrayToCollection(sa, co);

		Integer[] ia = new Integer[100];
		Float[] fa = new Float[100];
		Number[] na = new Number[100];
		Collection<Number> cn = new ArrayList<Number>();

		// T inferred to be Number
		fromArrayToCollection(ia, cn);

		// T inferred to be Number
		fromArrayToCollection(fa, cn);

		// T inferred to be Number
		fromArrayToCollection(na, cn);

		// T inferred to be Object
		fromArrayToCollection(na, co);

		// compile-time error
//		fromArrayToCollection(na, cs);
	}
}
