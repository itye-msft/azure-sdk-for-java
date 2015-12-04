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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.BaseResource;

/**
 * Management lock information.
 */
public class ManagementLockObject extends BaseResource {
    /**
     * Gets or sets the Id of the lock.
     */
    private String id;

    /**
     * Gets or sets the type of the lock.
     */
    private String type;

    /**
     * Gets or sets the name of the lock.
     */
    private String name;

    /**
     * Gets or sets the lock level of the management lock. Possible values for
     * this property include: 'NotSpecified', 'CanNotDelete', 'ReadOnly'.
     */
    @JsonProperty(value = "properties.level")
    private String level;

    /**
     * Gets or sets the notes of the management lock.
     */
    @JsonProperty(value = "properties.notes")
    private String notes;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the level value.
     *
     * @return the level value
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * Set the level value.
     *
     * @param level the level value to set
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * Get the notes value.
     *
     * @return the notes value
     */
    public String getNotes() {
        return this.notes;
    }

    /**
     * Set the notes value.
     *
     * @param notes the notes value to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

}
