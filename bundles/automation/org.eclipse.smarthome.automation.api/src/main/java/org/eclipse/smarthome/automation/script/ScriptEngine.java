/*******************************************************************************
 * Copyright (c) 1997, 2015 by ProSyst Software GmbH
 * http://www.prosyst.com
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    ProSyst Software GmbH - initial API and implementation
 *******************************************************************************/

package org.eclipse.smarthome.automation.script;

import org.eclipse.smarthome.automation.Module;

/**
 * @author Yordan Mihaylov - Initial Contribution
 * @author Ana Dimova - Initial Contribution
 */
public interface ScriptEngine {

    public static final String LANGUAGE = "language";

    public static final String JUEL = "JUEL";

    Script createScript(Module module);
}