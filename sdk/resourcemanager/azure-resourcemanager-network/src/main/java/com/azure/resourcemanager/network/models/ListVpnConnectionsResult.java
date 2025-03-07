// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.VpnConnectionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the request to list all vpn connections to a virtual wan vpn gateway. It contains a list of Vpn Connections
 * and a URL nextLink to get the next set of results.
 */
@Fluent
public final class ListVpnConnectionsResult {
    /*
     * List of Vpn Connections.
     */
    @JsonProperty(value = "value")
    private List<VpnConnectionInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of ListVpnConnectionsResult class.
     */
    public ListVpnConnectionsResult() {
    }

    /**
     * Get the value property: List of Vpn Connections.
     * 
     * @return the value value.
     */
    public List<VpnConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Vpn Connections.
     * 
     * @param value the value value to set.
     * @return the ListVpnConnectionsResult object itself.
     */
    public ListVpnConnectionsResult withValue(List<VpnConnectionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of operation list results if there are any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of operation list results if there are any.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ListVpnConnectionsResult object itself.
     */
    public ListVpnConnectionsResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
