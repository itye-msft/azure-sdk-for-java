/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.iothub.v2018_04_01.implementation.IoTHubManager;
import com.microsoft.azure.management.iothub.v2018_04_01.implementation.SharedAccessSignatureAuthorizationRuleInner;

/**
 * Type representing SharedAccessSignatureAuthorizationRule.
 */
public interface SharedAccessSignatureAuthorizationRule extends HasInner<SharedAccessSignatureAuthorizationRuleInner>, HasManager<IoTHubManager> {
    /**
     * @return the keyName value.
     */
    String keyName();

    /**
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * @return the rights value.
     */
    AccessRights rights();

    /**
     * @return the secondaryKey value.
     */
    String secondaryKey();

}
