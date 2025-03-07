// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The UserAssignedIdentityProperties model.
 */
@Fluent
public final class UserAssignedIdentityProperties {
    /*
     * ARM ID of user Identity selected for encryption
     */
    @JsonProperty(value = "userAssignedIdentity")
    private String userAssignedIdentity;

    /**
     * Creates an instance of UserAssignedIdentityProperties class.
     */
    public UserAssignedIdentityProperties() {
    }

    /**
     * Get the userAssignedIdentity property: ARM ID of user Identity selected for encryption.
     * 
     * @return the userAssignedIdentity value.
     */
    public String userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    /**
     * Set the userAssignedIdentity property: ARM ID of user Identity selected for encryption.
     * 
     * @param userAssignedIdentity the userAssignedIdentity value to set.
     * @return the UserAssignedIdentityProperties object itself.
     */
    public UserAssignedIdentityProperties withUserAssignedIdentity(String userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
