/*
* generated by Xtext
*/
package org.jnario.suite;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SuiteUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.jnario.suite.ui.internal.SuiteActivator.getInstance().getInjector("org.jnario.suite.Suite");
	}
	
}
