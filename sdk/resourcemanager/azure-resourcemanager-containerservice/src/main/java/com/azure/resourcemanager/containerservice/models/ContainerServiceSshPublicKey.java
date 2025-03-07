// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains information about SSH certificate public key data.
 */
@Fluent
public final class ContainerServiceSshPublicKey {
    /*
     * Certificate public key used to authenticate with VMs through SSH. The certificate must be in PEM format with or
     * without headers.
     */
    @JsonProperty(value = "keyData", required = true)
    private String keyData;

    /**
     * Creates an instance of ContainerServiceSshPublicKey class.
     */
    public ContainerServiceSshPublicKey() {
    }

    /**
     * Get the keyData property: Certificate public key used to authenticate with VMs through SSH. The certificate must
     * be in PEM format with or without headers.
     * 
     * @return the keyData value.
     */
    public String keyData() {
        return this.keyData;
    }

    /**
     * Set the keyData property: Certificate public key used to authenticate with VMs through SSH. The certificate must
     * be in PEM format with or without headers.
     * 
     * @param keyData the keyData value to set.
     * @return the ContainerServiceSshPublicKey object itself.
     */
    public ContainerServiceSshPublicKey withKeyData(String keyData) {
        this.keyData = keyData;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyData() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property keyData in model ContainerServiceSshPublicKey"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContainerServiceSshPublicKey.class);
}
