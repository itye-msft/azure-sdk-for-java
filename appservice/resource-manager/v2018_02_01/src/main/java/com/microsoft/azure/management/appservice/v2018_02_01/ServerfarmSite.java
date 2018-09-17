/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.SiteInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.CertificateRegistrationManager;
import java.util.List;
import org.joda.time.DateTime;
import java.util.Map;

/**
 * Type representing ServerfarmSite.
 */
public interface ServerfarmSite extends HasInner<SiteInner>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the availabilityState value.
     */
    SiteAvailabilityState availabilityState();

    /**
     * @return the clientAffinityEnabled value.
     */
    Boolean clientAffinityEnabled();

    /**
     * @return the clientCertEnabled value.
     */
    Boolean clientCertEnabled();

    /**
     * @return the cloningInfo value.
     */
    CloningInfo cloningInfo();

    /**
     * @return the containerSize value.
     */
    Integer containerSize();

    /**
     * @return the dailyMemoryTimeQuota value.
     */
    Integer dailyMemoryTimeQuota();

    /**
     * @return the defaultHostName value.
     */
    String defaultHostName();

    /**
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * @return the enabledHostNames value.
     */
    List<String> enabledHostNames();

    /**
     * @return the hostingEnvironmentProfile value.
     */
    HostingEnvironmentProfile hostingEnvironmentProfile();

    /**
     * @return the hostNames value.
     */
    List<String> hostNames();

    /**
     * @return the hostNamesDisabled value.
     */
    Boolean hostNamesDisabled();

    /**
     * @return the hostNameSslStates value.
     */
    List<HostNameSslState> hostNameSslStates();

    /**
     * @return the httpsOnly value.
     */
    Boolean httpsOnly();

    /**
     * @return the hyperV value.
     */
    Boolean hyperV();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * @return the isDefaultContainer value.
     */
    Boolean isDefaultContainer();

    /**
     * @return the isXenon value.
     */
    Boolean isXenon();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the lastModifiedTimeUtc value.
     */
    DateTime lastModifiedTimeUtc();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the maxNumberOfWorkers value.
     */
    Integer maxNumberOfWorkers();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the outboundIpAddresses value.
     */
    String outboundIpAddresses();

    /**
     * @return the possibleOutboundIpAddresses value.
     */
    String possibleOutboundIpAddresses();

    /**
     * @return the repositorySiteName value.
     */
    String repositorySiteName();

    /**
     * @return the reserved value.
     */
    Boolean reserved();

    /**
     * @return the resourceGroup value.
     */
    String resourceGroup();

    /**
     * @return the scmSiteAlsoStopped value.
     */
    Boolean scmSiteAlsoStopped();

    /**
     * @return the serverFarmId value.
     */
    String serverFarmId();

    /**
     * @return the siteConfig value.
     */
    SiteConfig siteConfig();

    /**
     * @return the slotSwapStatus value.
     */
    SlotSwapStatus slotSwapStatus();

    /**
     * @return the state value.
     */
    String state();

    /**
     * @return the suspendedTill value.
     */
    DateTime suspendedTill();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the targetSwapSlot value.
     */
    String targetSwapSlot();

    /**
     * @return the trafficManagerHostNames value.
     */
    List<String> trafficManagerHostNames();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the usageState value.
     */
    UsageState usageState();

}