/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters supplied to the update operation.
 */
public class HybridRunbookWorkerGroupUpdateParameters {
    /**
     * Sets the credential of a worker group.
     */
    @JsonProperty(value = "credential")
    private RunAsCredentialAssociationProperty credential;

    /**
     * Get sets the credential of a worker group.
     *
     * @return the credential value
     */
    public RunAsCredentialAssociationProperty credential() {
        return this.credential;
    }

    /**
     * Set sets the credential of a worker group.
     *
     * @param credential the credential value to set
     * @return the HybridRunbookWorkerGroupUpdateParameters object itself.
     */
    public HybridRunbookWorkerGroupUpdateParameters withCredential(RunAsCredentialAssociationProperty credential) {
        this.credential = credential;
        return this;
    }

}
