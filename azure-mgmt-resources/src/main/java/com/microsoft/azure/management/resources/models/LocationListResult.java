/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.resources.models;

import java.util.List;

/**
 * Location list operation response.
 */
public class LocationListResult {
    /**
     * Gets the locations.
     */
    private List<Location> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<Location> getValue() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     */
    public void setValue(List<Location> value) {
        this.value = value;
    }

}
