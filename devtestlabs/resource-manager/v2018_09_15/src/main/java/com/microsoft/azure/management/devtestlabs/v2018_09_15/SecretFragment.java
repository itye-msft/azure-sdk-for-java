/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A secret.
 */
@JsonFlatten
public class SecretFragment extends UpdateResource {
    /**
     * The value of the secret for secret creation.
     */
    @JsonProperty(value = "properties.value")
    private String value;

    /**
     * Get the value of the secret for secret creation.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value of the secret for secret creation.
     *
     * @param value the value value to set
     * @return the SecretFragment object itself.
     */
    public SecretFragment withValue(String value) {
        this.value = value;
        return this;
    }

}
