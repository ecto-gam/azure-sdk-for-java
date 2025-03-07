// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Capture Virtual Machine parameters.
 */
@Fluent
public final class VirtualMachineCaptureParameters {
    /*
     * The captured virtual hard disk's name prefix.
     */
    @JsonProperty(value = "vhdPrefix", required = true)
    private String vhdPrefix;

    /*
     * The destination container name.
     */
    @JsonProperty(value = "destinationContainerName", required = true)
    private String destinationContainerName;

    /*
     * Specifies whether to overwrite the destination virtual hard disk, in case of conflict.
     */
    @JsonProperty(value = "overwriteVhds", required = true)
    private boolean overwriteVhds;

    /**
     * Creates an instance of VirtualMachineCaptureParameters class.
     */
    public VirtualMachineCaptureParameters() {
    }

    /**
     * Get the vhdPrefix property: The captured virtual hard disk's name prefix.
     * 
     * @return the vhdPrefix value.
     */
    public String vhdPrefix() {
        return this.vhdPrefix;
    }

    /**
     * Set the vhdPrefix property: The captured virtual hard disk's name prefix.
     * 
     * @param vhdPrefix the vhdPrefix value to set.
     * @return the VirtualMachineCaptureParameters object itself.
     */
    public VirtualMachineCaptureParameters withVhdPrefix(String vhdPrefix) {
        this.vhdPrefix = vhdPrefix;
        return this;
    }

    /**
     * Get the destinationContainerName property: The destination container name.
     * 
     * @return the destinationContainerName value.
     */
    public String destinationContainerName() {
        return this.destinationContainerName;
    }

    /**
     * Set the destinationContainerName property: The destination container name.
     * 
     * @param destinationContainerName the destinationContainerName value to set.
     * @return the VirtualMachineCaptureParameters object itself.
     */
    public VirtualMachineCaptureParameters withDestinationContainerName(String destinationContainerName) {
        this.destinationContainerName = destinationContainerName;
        return this;
    }

    /**
     * Get the overwriteVhds property: Specifies whether to overwrite the destination virtual hard disk, in case of
     * conflict.
     * 
     * @return the overwriteVhds value.
     */
    public boolean overwriteVhds() {
        return this.overwriteVhds;
    }

    /**
     * Set the overwriteVhds property: Specifies whether to overwrite the destination virtual hard disk, in case of
     * conflict.
     * 
     * @param overwriteVhds the overwriteVhds value to set.
     * @return the VirtualMachineCaptureParameters object itself.
     */
    public VirtualMachineCaptureParameters withOverwriteVhds(boolean overwriteVhds) {
        this.overwriteVhds = overwriteVhds;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vhdPrefix() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property vhdPrefix in model VirtualMachineCaptureParameters"));
        }
        if (destinationContainerName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property destinationContainerName in model VirtualMachineCaptureParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineCaptureParameters.class);
}
