// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Options for retrieving the list of top level domain legal agreements.
 */
@Fluent
public final class TopLevelDomainAgreementOption {
    /*
     * If <code>true</code>, then the list of agreements will include agreements for domain privacy as well; otherwise, <code>false</code>.
     */
    @JsonProperty(value = "includePrivacy")
    private Boolean includePrivacy;

    /*
     * If <code>true</code>, then the list of agreements will include agreements for domain transfer as well; otherwise, <code>false</code>.
     */
    @JsonProperty(value = "forTransfer")
    private Boolean forTransfer;

    /**
     * Creates an instance of TopLevelDomainAgreementOption class.
     */
    public TopLevelDomainAgreementOption() {
    }

    /**
     * Get the includePrivacy property: If &lt;code&gt;true&lt;/code&gt;, then the list of agreements will include
     * agreements for domain privacy as well; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the includePrivacy value.
     */
    public Boolean includePrivacy() {
        return this.includePrivacy;
    }

    /**
     * Set the includePrivacy property: If &lt;code&gt;true&lt;/code&gt;, then the list of agreements will include
     * agreements for domain privacy as well; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param includePrivacy the includePrivacy value to set.
     * @return the TopLevelDomainAgreementOption object itself.
     */
    public TopLevelDomainAgreementOption withIncludePrivacy(Boolean includePrivacy) {
        this.includePrivacy = includePrivacy;
        return this;
    }

    /**
     * Get the forTransfer property: If &lt;code&gt;true&lt;/code&gt;, then the list of agreements will include
     * agreements for domain transfer as well; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the forTransfer value.
     */
    public Boolean forTransfer() {
        return this.forTransfer;
    }

    /**
     * Set the forTransfer property: If &lt;code&gt;true&lt;/code&gt;, then the list of agreements will include
     * agreements for domain transfer as well; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param forTransfer the forTransfer value to set.
     * @return the TopLevelDomainAgreementOption object itself.
     */
    public TopLevelDomainAgreementOption withForTransfer(Boolean forTransfer) {
        this.forTransfer = forTransfer;
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
