/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2013, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.wildfly.legacy.test.controller.subsystem_8_0_0;

import org.jboss.as.controller.Extension;
import org.jboss.as.controller.RunningModeControl;
import org.jboss.as.controller.extension.ExtensionRegistry;
import org.jboss.as.model.test.ModelTestModelControllerService;
import org.jboss.as.model.test.ModelTestOperationValidatorFilter;
import org.jboss.as.model.test.StringConfigurationPersister;
import org.jboss.as.subsystem.test.AdditionalInitialization;
import org.jboss.as.subsystem.test.AdditionalInitializationUtil;
import org.jboss.as.subsystem.test.ControllerInitializer;
import org.wildfly.legacy.test.spi.subsystem.TestModelControllerFactory;

/**
 *
 * @author <a href="kabir.khan@jboss.com">Kabir Khan</a>
 * @author <a href="mailto:jperkins@redhat.com">James R. Perkins</a>
 */
public class TestModelControllerFactory8_0_0 implements TestModelControllerFactory {

    @Override
    public ModelTestModelControllerService create(Extension mainExtension, ControllerInitializer controllerInitializer,
            AdditionalInitialization additionalInit, ExtensionRegistry extensionRegistry, StringConfigurationPersister persister,
            ModelTestOperationValidatorFilter validateOpsFilter, boolean registerTransformers) {
        return new TestModelControllerService8_0_0(mainExtension, controllerInitializer, additionalInit, new RunningModeControl(AdditionalInitializationUtil.getRunningMode(additionalInit)), extensionRegistry, persister, validateOpsFilter, registerTransformers);
    }
}
