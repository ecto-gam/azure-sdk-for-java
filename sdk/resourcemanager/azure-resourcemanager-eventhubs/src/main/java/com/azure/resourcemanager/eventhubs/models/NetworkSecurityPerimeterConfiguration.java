// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.eventhubs.fluent.models.NetworkSecurityPerimeterConfigurationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Network Security Perimeter related configurations of a given namespace.
 */
@Immutable
public final class NetworkSecurityPerimeterConfiguration extends ProxyResource {
    /*
     * Properties of the Network Security Perimeter Configuration
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private NetworkSecurityPerimeterConfigurationProperties innerProperties;

    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Creates an instance of NetworkSecurityPerimeterConfiguration class.
     */
    public NetworkSecurityPerimeterConfiguration() {
    }

    /**
     * Get the innerProperties property: Properties of the Network Security Perimeter Configuration.
     *
     * @return the innerProperties value.
     */
    private NetworkSecurityPerimeterConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the provisioningState property: Provisioning state of NetworkSecurityPerimeter configuration propagation.
     *
     * @return the provisioningState value.
     */
    public NetworkSecurityPerimeterConfigurationProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Provisioning state of NetworkSecurityPerimeter configuration propagation.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the NetworkSecurityPerimeterConfiguration object itself.
     */
    public NetworkSecurityPerimeterConfiguration
        withProvisioningState(NetworkSecurityPerimeterConfigurationProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterConfigurationProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the provisioningIssues property: List of Provisioning Issues if any.
     *
     * @return the provisioningIssues value.
     */
    public List<ProvisioningIssue> provisioningIssues() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningIssues();
    }

    /**
     * Set the provisioningIssues property: List of Provisioning Issues if any.
     *
     * @param provisioningIssues the provisioningIssues value to set.
     * @return the NetworkSecurityPerimeterConfiguration object itself.
     */
    public NetworkSecurityPerimeterConfiguration withProvisioningIssues(List<ProvisioningIssue> provisioningIssues) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterConfigurationProperties();
        }
        this.innerProperties().withProvisioningIssues(provisioningIssues);
        return this;
    }

    /**
     * Get the networkSecurityPerimeter property: NetworkSecurityPerimeter related information.
     *
     * @return the networkSecurityPerimeter value.
     */
    public NetworkSecurityPerimeter networkSecurityPerimeter() {
        return this.innerProperties() == null ? null : this.innerProperties().networkSecurityPerimeter();
    }

    /**
     * Get the resourceAssociation property: Information about resource association.
     *
     * @return the resourceAssociation value.
     */
    public NetworkSecurityPerimeterConfigurationPropertiesResourceAssociation resourceAssociation() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceAssociation();
    }

    /**
     * Get the profile property: Information about current network profile.
     *
     * @return the profile value.
     */
    public NetworkSecurityPerimeterConfigurationPropertiesProfile profile() {
        return this.innerProperties() == null ? null : this.innerProperties().profile();
    }

    /**
     * Get the isBackingResource property: True if the EventHub namespace is backed by another Azure resource and not
     * visible to end users.
     *
     * @return the isBackingResource value.
     */
    public Boolean isBackingResource() {
        return this.innerProperties() == null ? null : this.innerProperties().isBackingResource();
    }

    /**
     * Get the applicableFeatures property: Indicates that the NSP controls related to backing association are only
     * applicable to a specific feature in backing resource's data plane.
     *
     * @return the applicableFeatures value.
     */
    public List<String> applicableFeatures() {
        return this.innerProperties() == null ? null : this.innerProperties().applicableFeatures();
    }

    /**
     * Get the parentAssociationName property: Source Resource Association name.
     *
     * @return the parentAssociationName value.
     */
    public String parentAssociationName() {
        return this.innerProperties() == null ? null : this.innerProperties().parentAssociationName();
    }

    /**
     * Get the sourceResourceId property: ARM Id of source resource.
     *
     * @return the sourceResourceId value.
     */
    public String sourceResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceResourceId();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
