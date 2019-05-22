/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcehealth.v2018_08_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.resourcehealth.v2018_08_01_preview.implementation.ResourceHealthManager;
import com.microsoft.azure.management.resourcehealth.v2018_08_01_preview.implementation.MetadataEntityInner;
import java.util.List;

/**
 * Type representing MetadataEntity.
 */
public interface MetadataEntity extends HasInner<MetadataEntityInner>, HasManager<ResourceHealthManager> {
    /**
     * @return the dependsOn value.
     */
    List<String> dependsOn();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isAlertable value.
     */
    Boolean isAlertable();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the supportedValues value.
     */
    List<MetadataSupportedValueDetail> supportedValues();

    /**
     * @return the type value.
     */
    String type();

}
