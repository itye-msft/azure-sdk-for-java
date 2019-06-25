/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2018_06_01_preview.implementation.ManagedInstanceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2018_06_01_preview.implementation.SqlManager;
import org.joda.time.DateTime;
import java.util.Map;

/**
 * Type representing ManagedInstance.
 */
public interface ManagedInstance extends HasInner<ManagedInstanceInner>, Indexable, Updatable<ManagedInstance.Update>, HasManager<SqlManager> {
    /**
     * @return the administratorLogin value.
     */
    String administratorLogin();

    /**
     * @return the administratorLoginPassword value.
     */
    String administratorLoginPassword();

    /**
     * @return the collation value.
     */
    String collation();

    /**
     * @return the dnsZone value.
     */
    String dnsZone();

    /**
     * @return the dnsZonePartner value.
     */
    String dnsZonePartner();

    /**
     * @return the fullyQualifiedDomainName value.
     */
    String fullyQualifiedDomainName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the identity value.
     */
    ResourceIdentity identity();

    /**
     * @return the instancePoolId value.
     */
    String instancePoolId();

    /**
     * @return the licenseType value.
     */
    ManagedInstanceLicenseType licenseType();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the managedInstanceCreateMode value.
     */
    ManagedServerCreateMode managedInstanceCreateMode();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the proxyOverride value.
     */
    ManagedInstanceProxyOverride proxyOverride();

    /**
     * @return the publicDataEndpointEnabled value.
     */
    Boolean publicDataEndpointEnabled();

    /**
     * @return the restorePointInTime value.
     */
    DateTime restorePointInTime();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the sourceManagedInstanceId value.
     */
    String sourceManagedInstanceId();

    /**
     * @return the state value.
     */
    String state();

    /**
     * @return the storageSizeInGB value.
     */
    Integer storageSizeInGB();

    /**
     * @return the subnetId value.
     */
    String subnetId();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the timezoneId value.
     */
    String timezoneId();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the vCores value.
     */
    Integer vCores();

    /**
     * The entirety of the ManagedInstance definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithInstancePool, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ManagedInstance definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ManagedInstance definition.
         */
        interface Blank extends WithInstancePool {
        }

        /**
         * The stage of the managedinstance definition allowing to specify InstancePool.
         */
        interface WithInstancePool {
           /**
            * Specifies resourceGroupName.
            */
            WithLocation withExistingInstancePool(String resourceGroupName);
        }

        /**
         * The stage of the managedinstance definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the managedinstance definition allowing to specify AdministratorLogin.
         */
        interface WithAdministratorLogin {
            /**
             * Specifies administratorLogin.
             */
            WithCreate withAdministratorLogin(String administratorLogin);
        }

        /**
         * The stage of the managedinstance definition allowing to specify AdministratorLoginPassword.
         */
        interface WithAdministratorLoginPassword {
            /**
             * Specifies administratorLoginPassword.
             */
            WithCreate withAdministratorLoginPassword(String administratorLoginPassword);
        }

        /**
         * The stage of the managedinstance definition allowing to specify Collation.
         */
        interface WithCollation {
            /**
             * Specifies collation.
             */
            WithCreate withCollation(String collation);
        }

        /**
         * The stage of the managedinstance definition allowing to specify DnsZonePartner.
         */
        interface WithDnsZonePartner {
            /**
             * Specifies dnsZonePartner.
             */
            WithCreate withDnsZonePartner(String dnsZonePartner);
        }

        /**
         * The stage of the managedinstance definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             */
            WithCreate withIdentity(ResourceIdentity identity);
        }

        /**
         * The stage of the managedinstance definition allowing to specify InstancePoolId.
         */
        interface WithInstancePoolId {
            /**
             * Specifies instancePoolId.
             */
            WithCreate withInstancePoolId(String instancePoolId);
        }

        /**
         * The stage of the managedinstance definition allowing to specify LicenseType.
         */
        interface WithLicenseType {
            /**
             * Specifies licenseType.
             */
            WithCreate withLicenseType(ManagedInstanceLicenseType licenseType);
        }

        /**
         * The stage of the managedinstance definition allowing to specify ManagedInstanceCreateMode.
         */
        interface WithManagedInstanceCreateMode {
            /**
             * Specifies managedInstanceCreateMode.
             */
            WithCreate withManagedInstanceCreateMode(ManagedServerCreateMode managedInstanceCreateMode);
        }

        /**
         * The stage of the managedinstance definition allowing to specify ProxyOverride.
         */
        interface WithProxyOverride {
            /**
             * Specifies proxyOverride.
             */
            WithCreate withProxyOverride(ManagedInstanceProxyOverride proxyOverride);
        }

        /**
         * The stage of the managedinstance definition allowing to specify PublicDataEndpointEnabled.
         */
        interface WithPublicDataEndpointEnabled {
            /**
             * Specifies publicDataEndpointEnabled.
             */
            WithCreate withPublicDataEndpointEnabled(Boolean publicDataEndpointEnabled);
        }

        /**
         * The stage of the managedinstance definition allowing to specify RestorePointInTime.
         */
        interface WithRestorePointInTime {
            /**
             * Specifies restorePointInTime.
             */
            WithCreate withRestorePointInTime(DateTime restorePointInTime);
        }

        /**
         * The stage of the managedinstance definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the managedinstance definition allowing to specify SourceManagedInstanceId.
         */
        interface WithSourceManagedInstanceId {
            /**
             * Specifies sourceManagedInstanceId.
             */
            WithCreate withSourceManagedInstanceId(String sourceManagedInstanceId);
        }

        /**
         * The stage of the managedinstance definition allowing to specify StorageSizeInGB.
         */
        interface WithStorageSizeInGB {
            /**
             * Specifies storageSizeInGB.
             */
            WithCreate withStorageSizeInGB(Integer storageSizeInGB);
        }

        /**
         * The stage of the managedinstance definition allowing to specify SubnetId.
         */
        interface WithSubnetId {
            /**
             * Specifies subnetId.
             */
            WithCreate withSubnetId(String subnetId);
        }

        /**
         * The stage of the managedinstance definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the managedinstance definition allowing to specify TimezoneId.
         */
        interface WithTimezoneId {
            /**
             * Specifies timezoneId.
             */
            WithCreate withTimezoneId(String timezoneId);
        }

        /**
         * The stage of the managedinstance definition allowing to specify VCores.
         */
        interface WithVCores {
            /**
             * Specifies vCores.
             */
            WithCreate withVCores(Integer vCores);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ManagedInstance>, DefinitionStages.WithAdministratorLogin, DefinitionStages.WithAdministratorLoginPassword, DefinitionStages.WithCollation, DefinitionStages.WithDnsZonePartner, DefinitionStages.WithIdentity, DefinitionStages.WithInstancePoolId, DefinitionStages.WithLicenseType, DefinitionStages.WithManagedInstanceCreateMode, DefinitionStages.WithProxyOverride, DefinitionStages.WithPublicDataEndpointEnabled, DefinitionStages.WithRestorePointInTime, DefinitionStages.WithSku, DefinitionStages.WithSourceManagedInstanceId, DefinitionStages.WithStorageSizeInGB, DefinitionStages.WithSubnetId, DefinitionStages.WithTags, DefinitionStages.WithTimezoneId, DefinitionStages.WithVCores {
        }
    }
    /**
     * The template for a ManagedInstance update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ManagedInstance>, UpdateStages.WithAdministratorLogin, UpdateStages.WithAdministratorLoginPassword, UpdateStages.WithCollation, UpdateStages.WithDnsZonePartner, UpdateStages.WithInstancePoolId, UpdateStages.WithLicenseType, UpdateStages.WithManagedInstanceCreateMode, UpdateStages.WithProxyOverride, UpdateStages.WithPublicDataEndpointEnabled, UpdateStages.WithRestorePointInTime, UpdateStages.WithSku, UpdateStages.WithSourceManagedInstanceId, UpdateStages.WithStorageSizeInGB, UpdateStages.WithSubnetId, UpdateStages.WithTags, UpdateStages.WithTimezoneId, UpdateStages.WithVCores {
    }

    /**
     * Grouping of ManagedInstance update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the managedinstance update allowing to specify AdministratorLogin.
         */
        interface WithAdministratorLogin {
            /**
             * Specifies administratorLogin.
             */
            Update withAdministratorLogin(String administratorLogin);
        }

        /**
         * The stage of the managedinstance update allowing to specify AdministratorLoginPassword.
         */
        interface WithAdministratorLoginPassword {
            /**
             * Specifies administratorLoginPassword.
             */
            Update withAdministratorLoginPassword(String administratorLoginPassword);
        }

        /**
         * The stage of the managedinstance update allowing to specify Collation.
         */
        interface WithCollation {
            /**
             * Specifies collation.
             */
            Update withCollation(String collation);
        }

        /**
         * The stage of the managedinstance update allowing to specify DnsZonePartner.
         */
        interface WithDnsZonePartner {
            /**
             * Specifies dnsZonePartner.
             */
            Update withDnsZonePartner(String dnsZonePartner);
        }

        /**
         * The stage of the managedinstance update allowing to specify InstancePoolId.
         */
        interface WithInstancePoolId {
            /**
             * Specifies instancePoolId.
             */
            Update withInstancePoolId(String instancePoolId);
        }

        /**
         * The stage of the managedinstance update allowing to specify LicenseType.
         */
        interface WithLicenseType {
            /**
             * Specifies licenseType.
             */
            Update withLicenseType(ManagedInstanceLicenseType licenseType);
        }

        /**
         * The stage of the managedinstance update allowing to specify ManagedInstanceCreateMode.
         */
        interface WithManagedInstanceCreateMode {
            /**
             * Specifies managedInstanceCreateMode.
             */
            Update withManagedInstanceCreateMode(ManagedServerCreateMode managedInstanceCreateMode);
        }

        /**
         * The stage of the managedinstance update allowing to specify ProxyOverride.
         */
        interface WithProxyOverride {
            /**
             * Specifies proxyOverride.
             */
            Update withProxyOverride(ManagedInstanceProxyOverride proxyOverride);
        }

        /**
         * The stage of the managedinstance update allowing to specify PublicDataEndpointEnabled.
         */
        interface WithPublicDataEndpointEnabled {
            /**
             * Specifies publicDataEndpointEnabled.
             */
            Update withPublicDataEndpointEnabled(Boolean publicDataEndpointEnabled);
        }

        /**
         * The stage of the managedinstance update allowing to specify RestorePointInTime.
         */
        interface WithRestorePointInTime {
            /**
             * Specifies restorePointInTime.
             */
            Update withRestorePointInTime(DateTime restorePointInTime);
        }

        /**
         * The stage of the managedinstance update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the managedinstance update allowing to specify SourceManagedInstanceId.
         */
        interface WithSourceManagedInstanceId {
            /**
             * Specifies sourceManagedInstanceId.
             */
            Update withSourceManagedInstanceId(String sourceManagedInstanceId);
        }

        /**
         * The stage of the managedinstance update allowing to specify StorageSizeInGB.
         */
        interface WithStorageSizeInGB {
            /**
             * Specifies storageSizeInGB.
             */
            Update withStorageSizeInGB(Integer storageSizeInGB);
        }

        /**
         * The stage of the managedinstance update allowing to specify SubnetId.
         */
        interface WithSubnetId {
            /**
             * Specifies subnetId.
             */
            Update withSubnetId(String subnetId);
        }

        /**
         * The stage of the managedinstance update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the managedinstance update allowing to specify TimezoneId.
         */
        interface WithTimezoneId {
            /**
             * Specifies timezoneId.
             */
            Update withTimezoneId(String timezoneId);
        }

        /**
         * The stage of the managedinstance update allowing to specify VCores.
         */
        interface WithVCores {
            /**
             * Specifies vCores.
             */
            Update withVCores(Integer vCores);
        }

    }
}
