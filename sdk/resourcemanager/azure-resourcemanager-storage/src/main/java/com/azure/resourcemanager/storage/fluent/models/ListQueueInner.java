// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The ListQueue model.
 */
@Fluent
public final class ListQueueInner extends ProxyResource {
    /*
     * List Queue resource properties.
     */
    @JsonProperty(value = "properties")
    private ListQueueProperties innerQueueProperties;

    /**
     * Creates an instance of ListQueueInner class.
     */
    public ListQueueInner() {
    }

    /**
     * Get the innerQueueProperties property: List Queue resource properties.
     * 
     * @return the innerQueueProperties value.
     */
    private ListQueueProperties innerQueueProperties() {
        return this.innerQueueProperties;
    }

    /**
     * Get the metadata property: A name-value pair that represents queue metadata.
     * 
     * @return the metadata value.
     */
    public Map<String, String> metadata() {
        return this.innerQueueProperties() == null ? null : this.innerQueueProperties().metadata();
    }

    /**
     * Set the metadata property: A name-value pair that represents queue metadata.
     * 
     * @param metadata the metadata value to set.
     * @return the ListQueueInner object itself.
     */
    public ListQueueInner withMetadata(Map<String, String> metadata) {
        if (this.innerQueueProperties() == null) {
            this.innerQueueProperties = new ListQueueProperties();
        }
        this.innerQueueProperties().withMetadata(metadata);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerQueueProperties() != null) {
            innerQueueProperties().validate();
        }
    }
}
