/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devspaces.v2019_01_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ControllerConnectionDetails model.
 */
public class ControllerConnectionDetails {
    /**
     * Authentication key for communicating with services.
     */
    @JsonProperty(value = "authKey", access = JsonProperty.Access.WRITE_ONLY)
    private String authKey;

    /**
     * The orchestratorSpecificConnectionDetails property.
     */
    @JsonProperty(value = "orchestratorSpecificConnectionDetails")
    private OrchestratorSpecificConnectionDetails orchestratorSpecificConnectionDetails;

    /**
     * Get authentication key for communicating with services.
     *
     * @return the authKey value
     */
    public String authKey() {
        return this.authKey;
    }

    /**
     * Get the orchestratorSpecificConnectionDetails value.
     *
     * @return the orchestratorSpecificConnectionDetails value
     */
    public OrchestratorSpecificConnectionDetails orchestratorSpecificConnectionDetails() {
        return this.orchestratorSpecificConnectionDetails;
    }

    /**
     * Set the orchestratorSpecificConnectionDetails value.
     *
     * @param orchestratorSpecificConnectionDetails the orchestratorSpecificConnectionDetails value to set
     * @return the ControllerConnectionDetails object itself.
     */
    public ControllerConnectionDetails withOrchestratorSpecificConnectionDetails(OrchestratorSpecificConnectionDetails orchestratorSpecificConnectionDetails) {
        this.orchestratorSpecificConnectionDetails = orchestratorSpecificConnectionDetails;
        return this;
    }

}
