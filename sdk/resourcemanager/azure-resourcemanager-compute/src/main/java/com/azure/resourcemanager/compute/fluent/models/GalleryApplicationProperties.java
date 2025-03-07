// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.GalleryApplicationCustomAction;
import com.azure.resourcemanager.compute.models.OperatingSystemTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Describes the properties of a gallery Application Definition.
 */
@Fluent
public final class GalleryApplicationProperties {
    /*
     * The description of this gallery Application Definition resource. This property is updatable.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The Eula agreement for the gallery Application Definition.
     */
    @JsonProperty(value = "eula")
    private String eula;

    /*
     * The privacy statement uri.
     */
    @JsonProperty(value = "privacyStatementUri")
    private String privacyStatementUri;

    /*
     * The release note uri.
     */
    @JsonProperty(value = "releaseNoteUri")
    private String releaseNoteUri;

    /*
     * The end of life date of the gallery Application Definition. This property can be used for decommissioning
     * purposes. This property is updatable.
     */
    @JsonProperty(value = "endOfLifeDate")
    private OffsetDateTime endOfLifeDate;

    /*
     * This property allows you to specify the supported type of the OS that application is built for. Possible values
     * are: **Windows,** **Linux.**
     */
    @JsonProperty(value = "supportedOSType", required = true)
    private OperatingSystemTypes supportedOSType;

    /*
     * A list of custom actions that can be performed with all of the Gallery Application Versions within this Gallery
     * Application.
     */
    @JsonProperty(value = "customActions")
    private List<GalleryApplicationCustomAction> customActions;

    /**
     * Creates an instance of GalleryApplicationProperties class.
     */
    public GalleryApplicationProperties() {
    }

    /**
     * Get the description property: The description of this gallery Application Definition resource. This property is
     * updatable.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of this gallery Application Definition resource. This property is
     * updatable.
     * 
     * @param description the description value to set.
     * @return the GalleryApplicationProperties object itself.
     */
    public GalleryApplicationProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the eula property: The Eula agreement for the gallery Application Definition.
     * 
     * @return the eula value.
     */
    public String eula() {
        return this.eula;
    }

    /**
     * Set the eula property: The Eula agreement for the gallery Application Definition.
     * 
     * @param eula the eula value to set.
     * @return the GalleryApplicationProperties object itself.
     */
    public GalleryApplicationProperties withEula(String eula) {
        this.eula = eula;
        return this;
    }

    /**
     * Get the privacyStatementUri property: The privacy statement uri.
     * 
     * @return the privacyStatementUri value.
     */
    public String privacyStatementUri() {
        return this.privacyStatementUri;
    }

    /**
     * Set the privacyStatementUri property: The privacy statement uri.
     * 
     * @param privacyStatementUri the privacyStatementUri value to set.
     * @return the GalleryApplicationProperties object itself.
     */
    public GalleryApplicationProperties withPrivacyStatementUri(String privacyStatementUri) {
        this.privacyStatementUri = privacyStatementUri;
        return this;
    }

    /**
     * Get the releaseNoteUri property: The release note uri.
     * 
     * @return the releaseNoteUri value.
     */
    public String releaseNoteUri() {
        return this.releaseNoteUri;
    }

    /**
     * Set the releaseNoteUri property: The release note uri.
     * 
     * @param releaseNoteUri the releaseNoteUri value to set.
     * @return the GalleryApplicationProperties object itself.
     */
    public GalleryApplicationProperties withReleaseNoteUri(String releaseNoteUri) {
        this.releaseNoteUri = releaseNoteUri;
        return this;
    }

    /**
     * Get the endOfLifeDate property: The end of life date of the gallery Application Definition. This property can be
     * used for decommissioning purposes. This property is updatable.
     * 
     * @return the endOfLifeDate value.
     */
    public OffsetDateTime endOfLifeDate() {
        return this.endOfLifeDate;
    }

    /**
     * Set the endOfLifeDate property: The end of life date of the gallery Application Definition. This property can be
     * used for decommissioning purposes. This property is updatable.
     * 
     * @param endOfLifeDate the endOfLifeDate value to set.
     * @return the GalleryApplicationProperties object itself.
     */
    public GalleryApplicationProperties withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        this.endOfLifeDate = endOfLifeDate;
        return this;
    }

    /**
     * Get the supportedOSType property: This property allows you to specify the supported type of the OS that
     * application is built for. Possible values are: **Windows,** **Linux.**.
     * 
     * @return the supportedOSType value.
     */
    public OperatingSystemTypes supportedOSType() {
        return this.supportedOSType;
    }

    /**
     * Set the supportedOSType property: This property allows you to specify the supported type of the OS that
     * application is built for. Possible values are: **Windows,** **Linux.**.
     * 
     * @param supportedOSType the supportedOSType value to set.
     * @return the GalleryApplicationProperties object itself.
     */
    public GalleryApplicationProperties withSupportedOSType(OperatingSystemTypes supportedOSType) {
        this.supportedOSType = supportedOSType;
        return this;
    }

    /**
     * Get the customActions property: A list of custom actions that can be performed with all of the Gallery
     * Application Versions within this Gallery Application.
     * 
     * @return the customActions value.
     */
    public List<GalleryApplicationCustomAction> customActions() {
        return this.customActions;
    }

    /**
     * Set the customActions property: A list of custom actions that can be performed with all of the Gallery
     * Application Versions within this Gallery Application.
     * 
     * @param customActions the customActions value to set.
     * @return the GalleryApplicationProperties object itself.
     */
    public GalleryApplicationProperties withCustomActions(List<GalleryApplicationCustomAction> customActions) {
        this.customActions = customActions;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedOSType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property supportedOSType in model GalleryApplicationProperties"));
        }
        if (customActions() != null) {
            customActions().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GalleryApplicationProperties.class);
}
