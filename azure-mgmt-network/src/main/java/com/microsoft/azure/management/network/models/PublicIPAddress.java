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
 * PublicIPAddress resource.
 */
public class PublicIPAddress extends Resource {
    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    private String etag;

    /**
     * Gets or sets PublicIP allocation method (Static/Dynamic). Possible
     * values for this property include: 'Static', 'Dynamic'.
     */
    @JsonProperty(value = "properties.publicIPAllocationMethod", required = true)
    private String publicIPAllocationMethod;

    /**
     * The ipConfiguration property.
     */
    @JsonProperty(value = "properties.ipConfiguration")
    private IPConfiguration ipConfiguration;

    /**
     * Gets or sets FQDN of the DNS record associated with the public IP
     * address.
     */
    @JsonProperty(value = "properties.dnsSettings")
    private PublicIPAddressDnsSettings dnsSettings;

    /**
     * The ipAddress property.
     */
    @JsonProperty(value = "properties.ipAddress")
    private String ipAddress;

    /**
     * Gets or sets the Idletimeout of the public IP address.
     */
    @JsonProperty(value = "properties.idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /**
     * Gets or sets resource guid property of the PublicIP resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     */
    public void setEtag(String etag) {
        this.etag = etag;
    }

    /**
     * Get the publicIPAllocationMethod value.
     *
     * @return the publicIPAllocationMethod value
     */
    public String getPublicIPAllocationMethod() {
        return this.publicIPAllocationMethod;
    }

    /**
     * Set the publicIPAllocationMethod value.
     *
     * @param publicIPAllocationMethod the publicIPAllocationMethod value to set
     */
    public void setPublicIPAllocationMethod(String publicIPAllocationMethod) {
        this.publicIPAllocationMethod = publicIPAllocationMethod;
    }

    /**
     * Get the ipConfiguration value.
     *
     * @return the ipConfiguration value
     */
    public IPConfiguration getIpConfiguration() {
        return this.ipConfiguration;
    }

    /**
     * Set the ipConfiguration value.
     *
     * @param ipConfiguration the ipConfiguration value to set
     */
    public void setIpConfiguration(IPConfiguration ipConfiguration) {
        this.ipConfiguration = ipConfiguration;
    }

    /**
     * Get the dnsSettings value.
     *
     * @return the dnsSettings value
     */
    public PublicIPAddressDnsSettings getDnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings value.
     *
     * @param dnsSettings the dnsSettings value to set
     */
    public void setDnsSettings(PublicIPAddressDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
    }

    /**
     * Get the ipAddress value.
     *
     * @return the ipAddress value
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress value.
     *
     * @param ipAddress the ipAddress value to set
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Get the idleTimeoutInMinutes value.
     *
     * @return the idleTimeoutInMinutes value
     */
    public Integer getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes value.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set
     */
    public void setIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
    }

    /**
     * Get the resourceGuid value.
     *
     * @return the resourceGuid value
     */
    public String getResourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid value.
     *
     * @param resourceGuid the resourceGuid value to set
     */
    public void setResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     */
    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

}
