/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_04_01.implementation;

import com.microsoft.azure.management.containerregistry.v2019_04_01.RegistryUsageListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.containerregistry.v2019_04_01.RegistryUsage;

class RegistryUsageListResultImpl extends WrapperImpl<RegistryUsageListResultInner> implements RegistryUsageListResult {
    private final ContainerRegistryManager manager;
    RegistryUsageListResultImpl(RegistryUsageListResultInner inner, ContainerRegistryManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public List<RegistryUsage> value() {
        return this.inner().value();
    }

}
