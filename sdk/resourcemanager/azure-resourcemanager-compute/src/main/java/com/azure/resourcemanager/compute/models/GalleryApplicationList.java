// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.models.GalleryApplicationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The List Gallery Applications operation response.
 */
@Fluent
public final class GalleryApplicationList {
    /*
     * A list of Gallery Applications.
     */
    @JsonProperty(value = "value", required = true)
    private List<GalleryApplicationInner> value;

    /*
     * The uri to fetch the next page of Application Definitions in the Application Gallery. Call ListNext() with this
     * to fetch the next page of gallery Application Definitions.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of GalleryApplicationList class.
     */
    public GalleryApplicationList() {
    }

    /**
     * Get the value property: A list of Gallery Applications.
     * 
     * @return the value value.
     */
    public List<GalleryApplicationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of Gallery Applications.
     * 
     * @param value the value value to set.
     * @return the GalleryApplicationList object itself.
     */
    public GalleryApplicationList withValue(List<GalleryApplicationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of Application Definitions in the Application Gallery.
     * Call ListNext() with this to fetch the next page of gallery Application Definitions.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of Application Definitions in the Application Gallery.
     * Call ListNext() with this to fetch the next page of gallery Application Definitions.
     * 
     * @param nextLink the nextLink value to set.
     * @return the GalleryApplicationList object itself.
     */
    public GalleryApplicationList withNextLink(String nextLink) {
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
                .log(new IllegalArgumentException("Missing required property value in model GalleryApplicationList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GalleryApplicationList.class);
}
