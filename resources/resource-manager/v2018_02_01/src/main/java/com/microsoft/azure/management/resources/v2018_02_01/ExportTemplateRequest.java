/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_02_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Export resource group template request parameters.
 */
public class ExportTemplateRequest {
    /**
     * The IDs of the resources. The only supported string currently is '*'
     * (all resources). Future updates will support exporting specific
     * resources.
     */
    @JsonProperty(value = "resources")
    private List<String> resources;

    /**
     * The export template options. Supported values include
     * 'IncludeParameterDefaultValue', 'IncludeComments' or
     * 'IncludeParameterDefaultValue, IncludeComments.
     */
    @JsonProperty(value = "options")
    private String options;

    /**
     * Get the resources value.
     *
     * @return the resources value
     */
    public List<String> resources() {
        return this.resources;
    }

    /**
     * Set the resources value.
     *
     * @param resources the resources value to set
     * @return the ExportTemplateRequest object itself.
     */
    public ExportTemplateRequest withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the options value.
     *
     * @return the options value
     */
    public String options() {
        return this.options;
    }

    /**
     * Set the options value.
     *
     * @param options the options value to set
     * @return the ExportTemplateRequest object itself.
     */
    public ExportTemplateRequest withOptions(String options) {
        this.options = options;
        return this;
    }

}