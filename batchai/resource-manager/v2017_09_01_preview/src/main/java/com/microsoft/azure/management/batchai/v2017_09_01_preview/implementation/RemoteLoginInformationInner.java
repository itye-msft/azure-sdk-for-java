/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2017_09_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains remote login details to SSH/RDP to a compute node in cluster.
 */
public class RemoteLoginInformationInner {
    /**
     * Id of the compute node.
     */
    @JsonProperty(value = "nodeId", required = true)
    private String nodeId;

    /**
     * ip address.
     */
    @JsonProperty(value = "ipAddress", required = true)
    private String ipAddress;

    /**
     * port number.
     */
    @JsonProperty(value = "port", required = true)
    private double port;

    /**
     * Get id of the compute node.
     *
     * @return the nodeId value
     */
    public String nodeId() {
        return this.nodeId;
    }

    /**
     * Set id of the compute node.
     *
     * @param nodeId the nodeId value to set
     * @return the RemoteLoginInformationInner object itself.
     */
    public RemoteLoginInformationInner withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get ip address.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set ip address.
     *
     * @param ipAddress the ipAddress value to set
     * @return the RemoteLoginInformationInner object itself.
     */
    public RemoteLoginInformationInner withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the port value.
     *
     * @return the port value
     */
    public double port() {
        return this.port;
    }

    /**
     * Set the port value.
     *
     * @param port the port value to set
     * @return the RemoteLoginInformationInner object itself.
     */
    public RemoteLoginInformationInner withPort(double port) {
        this.port = port;
        return this;
    }

}
