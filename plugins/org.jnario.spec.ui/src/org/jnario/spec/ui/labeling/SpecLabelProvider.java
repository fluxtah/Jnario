/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/*
* generated by Xtext
*/
package org.jnario.spec.ui.labeling;

import static org.eclipse.xtext.util.Strings.convertFromJavaString;

import org.eclipse.swt.graphics.Image;
import org.eclipse.xtend.ide.labeling.XtendImages;
import org.eclipse.xtend.ide.labeling.XtendLabelProvider;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.jnario.ExampleTable;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.TestFunction;

import com.google.inject.Inject;


/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class SpecLabelProvider extends XtendLabelProvider {

	@Inject
	private XtendImages images;

	@Inject
	private ExampleNameProvider exampleNameProvider;

	
	public Image image(ExampleTable element) {
		return images.forField(JvmVisibility.PROTECTED, false, false);
	}
	
	public Image image(ExampleGroup element) {
		return images.forClass(JvmVisibility.PUBLIC);
	}
	
	public Image image(TestFunction element) {
		return images.forOperation(JvmVisibility.PUBLIC, false);
	}

	public String text(ExampleGroup element) {
		return convertFromJavaString(exampleNameProvider.describe(element), true);
	}
	
	public String text(Example element) {
		return convertFromJavaString(exampleNameProvider.describe(element), true);
	}
	
	public String text(ExampleTable element) {
		return exampleNameProvider.toFieldName(element);
	}
	
	public String text(TestFunction element) {
		return exampleNameProvider.toMethodName(element);
	}
	
}