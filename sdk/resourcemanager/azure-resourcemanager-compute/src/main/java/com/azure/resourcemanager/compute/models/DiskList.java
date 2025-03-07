// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.models.DiskInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The List Disks operation response.
 */
@Fluent
public final class DiskList {
    /*
     * A list of disks.
     */
    @JsonProperty(value = "value", required = true)
    private List<DiskInner> value;

    /*
     * The uri to fetch the next page of disks. Call ListNext() with this to fetch the next page of disks.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of DiskList class.
     */
    public DiskList() {
    }

    /**
     * Get the value property: A list of disks.
     * 
     * @return the value value.
     */
    public List<DiskInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of disks.
     * 
     * @param value the value value to set.
     * @return the DiskList object itself.
     */
    public DiskList withValue(List<DiskInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of disks. Call ListNext() with this to fetch the next
     * page of disks.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of disks. Call ListNext() with this to fetch the next
     * page of disks.
     * 
     * @param nextLink the nextLink value to set.
     * @return the DiskList object itself.
     */
    public DiskList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model DiskList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiskList.class);
}
