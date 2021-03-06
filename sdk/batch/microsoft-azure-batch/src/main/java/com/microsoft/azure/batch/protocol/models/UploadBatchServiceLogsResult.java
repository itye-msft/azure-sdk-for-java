/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The result of uploading Batch service log files from a specific Compute
 * Node.
 */
public class UploadBatchServiceLogsResult {
    /**
     * The virtual directory within Azure Blob Storage container to which the
     * Batch Service log file(s) will be uploaded.
     * The virtual directory name is part of the blob name for each log file
     * uploaded, and it is built based poolId, nodeId and a unique identifier.
     */
    @JsonProperty(value = "virtualDirectoryName", required = true)
    private String virtualDirectoryName;

    /**
     * The number of log files which will be uploaded.
     */
    @JsonProperty(value = "numberOfFilesUploaded", required = true)
    private int numberOfFilesUploaded;

    /**
     * Get the virtual directory name is part of the blob name for each log file uploaded, and it is built based poolId, nodeId and a unique identifier.
     *
     * @return the virtualDirectoryName value
     */
    public String virtualDirectoryName() {
        return this.virtualDirectoryName;
    }

    /**
     * Set the virtual directory name is part of the blob name for each log file uploaded, and it is built based poolId, nodeId and a unique identifier.
     *
     * @param virtualDirectoryName the virtualDirectoryName value to set
     * @return the UploadBatchServiceLogsResult object itself.
     */
    public UploadBatchServiceLogsResult withVirtualDirectoryName(String virtualDirectoryName) {
        this.virtualDirectoryName = virtualDirectoryName;
        return this;
    }

    /**
     * Get the numberOfFilesUploaded value.
     *
     * @return the numberOfFilesUploaded value
     */
    public int numberOfFilesUploaded() {
        return this.numberOfFilesUploaded;
    }

    /**
     * Set the numberOfFilesUploaded value.
     *
     * @param numberOfFilesUploaded the numberOfFilesUploaded value to set
     * @return the UploadBatchServiceLogsResult object itself.
     */
    public UploadBatchServiceLogsResult withNumberOfFilesUploaded(int numberOfFilesUploaded) {
        this.numberOfFilesUploaded = numberOfFilesUploaded;
        return this;
    }

}
