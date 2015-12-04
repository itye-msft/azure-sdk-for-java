/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VpnClientParameters.
 */
public class VpnClientParameters {
    /**
     * VPN client Processor Architecture -Amd64/X86. Possible values for this
     * property include: 'Amd64', 'X86'.
     */
    @JsonProperty(value = "ProcessorArchitecture")
    private String processorArchitecture;

    /**
     * Get the processorArchitecture value.
     *
     * @return the processorArchitecture value
     */
    public String getProcessorArchitecture() {
        return this.processorArchitecture;
    }

    /**
     * Set the processorArchitecture value.
     *
     * @param processorArchitecture the processorArchitecture value to set
     */
    public void setProcessorArchitecture(String processorArchitecture) {
        this.processorArchitecture = processorArchitecture;
    }

}
