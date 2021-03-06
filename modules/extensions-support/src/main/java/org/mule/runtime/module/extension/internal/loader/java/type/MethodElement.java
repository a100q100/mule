/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.module.extension.internal.loader.java.type;

import org.mule.runtime.api.meta.NamedObject;

import java.lang.reflect.Method;
import java.util.Optional;

/**
 * A contract for an element to be considered as a Method
 *
 * @since 4.0
 */
public interface MethodElement
    extends WithParameters, WithReturnType, NamedObject, WithAnnotations, WithAlias, WithDeclaringClass {

  /**
   * @return The represented method
   */
  Optional<Method> getMethod();

  /**
   * @return The {@link OperationContainerElement} which contains the current {@link MethodElement}
   */
  OperationContainerElement getEnclosingType();
}
