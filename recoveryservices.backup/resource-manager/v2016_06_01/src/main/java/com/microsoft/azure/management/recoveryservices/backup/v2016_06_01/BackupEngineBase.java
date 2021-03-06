/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The base backup engine class. All workload-specific backup engines derive
 * from this class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "backupEngineType")
@JsonTypeName("BackupEngineBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureBackupServerEngine", value = AzureBackupServerEngine.class),
    @JsonSubTypes.Type(name = "DpmBackupEngine", value = DpmBackupEngine.class)
})
public class BackupEngineBase {
    /**
     * The friendly name of the backup engine.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * The type of backup management associated with the backup engine.
     * Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM',
     * 'AzureBackupServer', 'AzureSql'.
     */
    @JsonProperty(value = "backupManagementType")
    private BackupManagementType backupManagementType;

    /**
     * The status of the backup engine registration with the Recovery Services
     * vault.
     */
    @JsonProperty(value = "registrationStatus")
    private String registrationStatus;

    /**
     * The backup status of the backup engine.
     */
    @JsonProperty(value = "healthStatus")
    private String healthStatus;

    /**
     * The flag indicating whether the backup engine be registered again, once
     * the engine has been initially registered.
     */
    @JsonProperty(value = "canReRegister")
    private Boolean canReRegister;

    /**
     * The ID of the backup engine.
     */
    @JsonProperty(value = "backupEngineId")
    private String backupEngineId;

    /**
     * Get the friendly name of the backup engine.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendly name of the backup engine.
     *
     * @param friendlyName the friendlyName value to set
     * @return the BackupEngineBase object itself.
     */
    public BackupEngineBase withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the type of backup management associated with the backup engine. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql'.
     *
     * @return the backupManagementType value
     */
    public BackupManagementType backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set the type of backup management associated with the backup engine. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql'.
     *
     * @param backupManagementType the backupManagementType value to set
     * @return the BackupEngineBase object itself.
     */
    public BackupEngineBase withBackupManagementType(BackupManagementType backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get the status of the backup engine registration with the Recovery Services vault.
     *
     * @return the registrationStatus value
     */
    public String registrationStatus() {
        return this.registrationStatus;
    }

    /**
     * Set the status of the backup engine registration with the Recovery Services vault.
     *
     * @param registrationStatus the registrationStatus value to set
     * @return the BackupEngineBase object itself.
     */
    public BackupEngineBase withRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
        return this;
    }

    /**
     * Get the backup status of the backup engine.
     *
     * @return the healthStatus value
     */
    public String healthStatus() {
        return this.healthStatus;
    }

    /**
     * Set the backup status of the backup engine.
     *
     * @param healthStatus the healthStatus value to set
     * @return the BackupEngineBase object itself.
     */
    public BackupEngineBase withHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * Get the flag indicating whether the backup engine be registered again, once the engine has been initially registered.
     *
     * @return the canReRegister value
     */
    public Boolean canReRegister() {
        return this.canReRegister;
    }

    /**
     * Set the flag indicating whether the backup engine be registered again, once the engine has been initially registered.
     *
     * @param canReRegister the canReRegister value to set
     * @return the BackupEngineBase object itself.
     */
    public BackupEngineBase withCanReRegister(Boolean canReRegister) {
        this.canReRegister = canReRegister;
        return this;
    }

    /**
     * Get the ID of the backup engine.
     *
     * @return the backupEngineId value
     */
    public String backupEngineId() {
        return this.backupEngineId;
    }

    /**
     * Set the ID of the backup engine.
     *
     * @param backupEngineId the backupEngineId value to set
     * @return the BackupEngineBase object itself.
     */
    public BackupEngineBase withBackupEngineId(String backupEngineId) {
        this.backupEngineId = backupEngineId;
        return this;
    }

}
