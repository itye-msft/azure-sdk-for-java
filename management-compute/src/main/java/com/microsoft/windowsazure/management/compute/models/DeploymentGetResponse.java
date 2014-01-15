/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/**
* A deployment that exists in the cloud service.
*/
public class DeploymentGetResponse extends OperationResponse
{
    private String configuration;
    
    /**
    * The configuration file of the deployment.
    */
    public String getConfiguration()
    {
        return this.configuration;
    }
    
    /**
    * The configuration file of the deployment.
    */
    public void setConfiguration(String configuration)
    {
        this.configuration = configuration;
    }
    
    private Calendar createdTime;
    
    /**
    * The time that the deployment was created.
    */
    public Calendar getCreatedTime()
    {
        return this.createdTime;
    }
    
    /**
    * The time that the deployment was created.
    */
    public void setCreatedTime(Calendar createdTime)
    {
        this.createdTime = createdTime;
    }
    
    private DeploymentSlot deploymentSlot;
    
    /**
    * The deployment environment in which this deployment is running.
    */
    public DeploymentSlot getDeploymentSlot()
    {
        return this.deploymentSlot;
    }
    
    /**
    * The deployment environment in which this deployment is running.
    */
    public void setDeploymentSlot(DeploymentSlot deploymentSlot)
    {
        this.deploymentSlot = deploymentSlot;
    }
    
    private DnsSettings dnsSettings;
    
    /**
    * The custom DNS settings that are specified for deployment.
    */
    public DnsSettings getDnsSettings()
    {
        return this.dnsSettings;
    }
    
    /**
    * The custom DNS settings that are specified for deployment.
    */
    public void setDnsSettings(DnsSettings dnsSettings)
    {
        this.dnsSettings = dnsSettings;
    }
    
    private HashMap<String, String> extendedProperties;
    
    /**
    * Optional. Represents the name of an extended cloud service property. Each
    * extended property must have both a defined name and value. You can have
    * a maximum of 50 extended property name and value pairs.  The maximum
    * length of the Name element is 64 characters, only alphanumeric
    * characters and underscores are valid in the name, and it must start with
    * a letter. Attempting to use other characters, starting with a non-letter
    * character, or entering a name that is identical to that of another
    * extended property owned by the same service, will result in a status
    * code 400 (Bad Request) error.  Each extended property value has a
    * maximum length of 255 characters.
    */
    public HashMap<String, String> getExtendedProperties()
    {
        return this.extendedProperties;
    }
    
    /**
    * Optional. Represents the name of an extended cloud service property. Each
    * extended property must have both a defined name and value. You can have
    * a maximum of 50 extended property name and value pairs.  The maximum
    * length of the Name element is 64 characters, only alphanumeric
    * characters and underscores are valid in the name, and it must start with
    * a letter. Attempting to use other characters, starting with a non-letter
    * character, or entering a name that is identical to that of another
    * extended property owned by the same service, will result in a status
    * code 400 (Bad Request) error.  Each extended property value has a
    * maximum length of 255 characters.
    */
    public void setExtendedProperties(HashMap<String, String> extendedProperties)
    {
        this.extendedProperties = extendedProperties;
    }
    
    private ExtensionConfiguration extensionConfiguration;
    
    /**
    * Represents an extension that is added to the cloud service.
    */
    public ExtensionConfiguration getExtensionConfiguration()
    {
        return this.extensionConfiguration;
    }
    
    /**
    * Represents an extension that is added to the cloud service.
    */
    public void setExtensionConfiguration(ExtensionConfiguration extensionConfiguration)
    {
        this.extensionConfiguration = extensionConfiguration;
    }
    
    private String label;
    
    /**
    * The user supplied name of the deployment. This name can be used identify
    * the deployment for tracking purposes.
    */
    public String getLabel()
    {
        return this.label;
    }
    
    /**
    * The user supplied name of the deployment. This name can be used identify
    * the deployment for tracking purposes.
    */
    public void setLabel(String label)
    {
        this.label = label;
    }
    
    private Calendar lastModifiedTime;
    
    /**
    * The last time that the deployment was modified.
    */
    public Calendar getLastModifiedTime()
    {
        return this.lastModifiedTime;
    }
    
    /**
    * The last time that the deployment was modified.
    */
    public void setLastModifiedTime(Calendar lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
    }
    
    private boolean locked;
    
    /**
    * Indicates whether the deployment is locked for new write operations. True
    * if the deployment is locked because an existing operation is updating
    * the deployment; otherwise false.
    */
    public boolean getLocked()
    {
        return this.locked;
    }
    
    /**
    * Indicates whether the deployment is locked for new write operations. True
    * if the deployment is locked because an existing operation is updating
    * the deployment; otherwise false.
    */
    public void setLocked(boolean locked)
    {
        this.locked = locked;
    }
    
    private String name;
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    private PersistentVMDowntime persistentVMDowntime;
    
    /**
    * Specifies information about when the virtual machine has been started and
    * stopped.
    */
    public PersistentVMDowntime getPersistentVMDowntime()
    {
        return this.persistentVMDowntime;
    }
    
    /**
    * Specifies information about when the virtual machine has been started and
    * stopped.
    */
    public void setPersistentVMDowntime(PersistentVMDowntime persistentVMDowntime)
    {
        this.persistentVMDowntime = persistentVMDowntime;
    }
    
    private String privateId;
    
    /**
    * The unique identifier for this deployment.
    */
    public String getPrivateId()
    {
        return this.privateId;
    }
    
    /**
    * The unique identifier for this deployment.
    */
    public void setPrivateId(String privateId)
    {
        this.privateId = privateId;
    }
    
    private String reservedIPName;
    
    /**
    * Preview Only. The name of the Reserved IP that the deployment belongs to.
    */
    public String getReservedIPName()
    {
        return this.reservedIPName;
    }
    
    /**
    * Preview Only. The name of the Reserved IP that the deployment belongs to.
    */
    public void setReservedIPName(String reservedIPName)
    {
        this.reservedIPName = reservedIPName;
    }
    
    private ArrayList<RoleInstance> roleInstances;
    
    /**
    * The list of role instances in the deployment.
    */
    public ArrayList<RoleInstance> getRoleInstances()
    {
        return this.roleInstances;
    }
    
    /**
    * The list of role instances in the deployment.
    */
    public void setRoleInstances(ArrayList<RoleInstance> roleInstances)
    {
        this.roleInstances = roleInstances;
    }
    
    private ArrayList<Role> roles;
    
    /**
    * The list of roles in the deployment.
    */
    public ArrayList<Role> getRoles()
    {
        return this.roles;
    }
    
    /**
    * The list of roles in the deployment.
    */
    public void setRoles(ArrayList<Role> roles)
    {
        this.roles = roles;
    }
    
    private String rollbackAllowed;
    
    /**
    * Indicates whether the Rollback Update Or Upgrade operation is allowed at
    * this time. True if the operation is allowed; otherwise false.
    */
    public String getRollbackAllowed()
    {
        return this.rollbackAllowed;
    }
    
    /**
    * Indicates whether the Rollback Update Or Upgrade operation is allowed at
    * this time. True if the operation is allowed; otherwise false.
    */
    public void setRollbackAllowed(String rollbackAllowed)
    {
        this.rollbackAllowed = rollbackAllowed;
    }
    
    private String sdkVersion;
    
    /**
    * The version of the Windows Azure SDK that was used to generate the .cspkg
    * that created this deployment.  The first two numerical components of the
    * returned version represent the version of the SDK used to create the
    * package.
    */
    public String getSdkVersion()
    {
        return this.sdkVersion;
    }
    
    /**
    * The version of the Windows Azure SDK that was used to generate the .cspkg
    * that created this deployment.  The first two numerical components of the
    * returned version represent the version of the SDK used to create the
    * package.
    */
    public void setSdkVersion(String sdkVersion)
    {
        this.sdkVersion = sdkVersion;
    }
    
    private DeploymentStatus status;
    
    /**
    * The status of the deployment.
    */
    public DeploymentStatus getStatus()
    {
        return this.status;
    }
    
    /**
    * The status of the deployment.
    */
    public void setStatus(DeploymentStatus status)
    {
        this.status = status;
    }
    
    private int upgradeDomainCount;
    
    /**
    * The number of upgrade domains available to this cloud service.
    */
    public int getUpgradeDomainCount()
    {
        return this.upgradeDomainCount;
    }
    
    /**
    * The number of upgrade domains available to this cloud service.
    */
    public void setUpgradeDomainCount(int upgradeDomainCount)
    {
        this.upgradeDomainCount = upgradeDomainCount;
    }
    
    private UpgradeStatus upgradeStatus;
    
    /**
    * Specifies information about an update occurring on the deployment.
    */
    public UpgradeStatus getUpgradeStatus()
    {
        return this.upgradeStatus;
    }
    
    /**
    * Specifies information about an update occurring on the deployment.
    */
    public void setUpgradeStatus(UpgradeStatus upgradeStatus)
    {
        this.upgradeStatus = upgradeStatus;
    }
    
    private URI uri;
    
    /**
    * The URL used to access the hosted service. For example, if the service
    * name is MyService you could access the access the service by calling:
    * http://MyService.cloudapp.net
    */
    public URI getUri()
    {
        return this.uri;
    }
    
    /**
    * The URL used to access the hosted service. For example, if the service
    * name is MyService you could access the access the service by calling:
    * http://MyService.cloudapp.net
    */
    public void setUri(URI uri)
    {
        this.uri = uri;
    }
    
    private ArrayList<VirtualIPAddress> virtualIPAddresses;
    
    /**
    * The virtual IP addresses that are specified for thedeployment.
    */
    public ArrayList<VirtualIPAddress> getVirtualIPAddresses()
    {
        return this.virtualIPAddresses;
    }
    
    /**
    * The virtual IP addresses that are specified for thedeployment.
    */
    public void setVirtualIPAddresses(ArrayList<VirtualIPAddress> virtualIPAddresses)
    {
        this.virtualIPAddresses = virtualIPAddresses;
    }
    
    private String virtualNetworkName;
    
    /**
    * The name of the Virtual Network that the virtual machine connects to.
    */
    public String getVirtualNetworkName()
    {
        return this.virtualNetworkName;
    }
    
    /**
    * The name of the Virtual Network that the virtual machine connects to.
    */
    public void setVirtualNetworkName(String virtualNetworkName)
    {
        this.virtualNetworkName = virtualNetworkName;
    }
    
    /**
    * Initializes a new instance of the DeploymentGetResponse class.
    *
    */
    public DeploymentGetResponse()
    {
        super();
        this.extendedProperties = new HashMap<String, String>();
        this.roleInstances = new ArrayList<RoleInstance>();
        this.roles = new ArrayList<Role>();
        this.virtualIPAddresses = new ArrayList<VirtualIPAddress>();
    }
}
