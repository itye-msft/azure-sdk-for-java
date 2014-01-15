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

import java.net.InetAddress;
import java.util.ArrayList;

/**
* Details of a specific role instance.
*/
public class RoleInstance
{
    private String hostName;
    
    /**
    * The DNS host name of the service in which the role instance is running.
    * This element is only listed for Virtual Machine deployments.
    */
    public String getHostName()
    {
        return this.hostName;
    }
    
    /**
    * The DNS host name of the service in which the role instance is running.
    * This element is only listed for Virtual Machine deployments.
    */
    public void setHostName(String hostName)
    {
        this.hostName = hostName;
    }
    
    private ArrayList<InstanceEndpoint> instanceEndpoints;
    
    /**
    * The list of instance endpoints for the role.
    */
    public ArrayList<InstanceEndpoint> getInstanceEndpoints()
    {
        return this.instanceEndpoints;
    }
    
    /**
    * The list of instance endpoints for the role.
    */
    public void setInstanceEndpoints(ArrayList<InstanceEndpoint> instanceEndpoints)
    {
        this.instanceEndpoints = instanceEndpoints;
    }
    
    private String instanceErrorCode;
    
    /**
    * An error code that can be provided to WindowsAzure support to assist in
    * resolution of errors. Typicallythis field will be empty.
    */
    public String getInstanceErrorCode()
    {
        return this.instanceErrorCode;
    }
    
    /**
    * An error code that can be provided to WindowsAzure support to assist in
    * resolution of errors. Typicallythis field will be empty.
    */
    public void setInstanceErrorCode(String instanceErrorCode)
    {
        this.instanceErrorCode = instanceErrorCode;
    }
    
    private Integer instanceFaultDomain;
    
    /**
    * The fault domain that this role instance belongs to. Role instances that
    * are part of the same fault domain may all be vulnerable to the failure
    * of the same piece of shared hardware.
    */
    public Integer getInstanceFaultDomain()
    {
        return this.instanceFaultDomain;
    }
    
    /**
    * The fault domain that this role instance belongs to. Role instances that
    * are part of the same fault domain may all be vulnerable to the failure
    * of the same piece of shared hardware.
    */
    public void setInstanceFaultDomain(Integer instanceFaultDomain)
    {
        this.instanceFaultDomain = instanceFaultDomain;
    }
    
    private String instanceName;
    
    /**
    * TThe name of the specific role instance, if an instance of the role is
    * running.
    */
    public String getInstanceName()
    {
        return this.instanceName;
    }
    
    /**
    * TThe name of the specific role instance, if an instance of the role is
    * running.
    */
    public void setInstanceName(String instanceName)
    {
        this.instanceName = instanceName;
    }
    
    private VirtualMachineRoleSize instanceSize;
    
    /**
    * The size of the role instance.
    */
    public VirtualMachineRoleSize getInstanceSize()
    {
        return this.instanceSize;
    }
    
    /**
    * The size of the role instance.
    */
    public void setInstanceSize(VirtualMachineRoleSize instanceSize)
    {
        this.instanceSize = instanceSize;
    }
    
    private String instanceStateDetails;
    
    /**
    * The instance state is returned as a string that, when present, provides a
    * snapshot of the state of the virtual machine at the time the operation
    * was called.
    */
    public String getInstanceStateDetails()
    {
        return this.instanceStateDetails;
    }
    
    /**
    * The instance state is returned as a string that, when present, provides a
    * snapshot of the state of the virtual machine at the time the operation
    * was called.
    */
    public void setInstanceStateDetails(String instanceStateDetails)
    {
        this.instanceStateDetails = instanceStateDetails;
    }
    
    private String instanceStatus;
    
    /**
    * The current status of this instance.
    */
    public String getInstanceStatus()
    {
        return this.instanceStatus;
    }
    
    /**
    * The current status of this instance.
    */
    public void setInstanceStatus(String instanceStatus)
    {
        this.instanceStatus = instanceStatus;
    }
    
    private Integer instanceUpgradeDomain;
    
    /**
    * The update domain that this role instance belongs to. During an Upgrade
    * Deployment, all roles in the same update domain are updated at the same
    * time.
    */
    public Integer getInstanceUpgradeDomain()
    {
        return this.instanceUpgradeDomain;
    }
    
    /**
    * The update domain that this role instance belongs to. During an Upgrade
    * Deployment, all roles in the same update domain are updated at the same
    * time.
    */
    public void setInstanceUpgradeDomain(Integer instanceUpgradeDomain)
    {
        this.instanceUpgradeDomain = instanceUpgradeDomain;
    }
    
    private InetAddress iPAddress;
    
    /**
    * The IP address of the role instance (DIP).
    */
    public InetAddress getIPAddress()
    {
        return this.iPAddress;
    }
    
    /**
    * The IP address of the role instance (DIP).
    */
    public void setIPAddress(InetAddress iPAddress)
    {
        this.iPAddress = iPAddress;
    }
    
    private RoleInstancePowerState powerState;
    
    /**
    * The running state of the role instance.
    */
    public RoleInstancePowerState getPowerState()
    {
        return this.powerState;
    }
    
    /**
    * The running state of the role instance.
    */
    public void setPowerState(RoleInstancePowerState powerState)
    {
        this.powerState = powerState;
    }
    
    private String remoteAccessCertificateThumbprint;
    
    /**
    * The thumbprint of the RDP server certificate (in Windows) or SSH server
    * certificate (in Linux). The thumbprint is only used for Virtual Machines
    * that have been created from an image.
    */
    public String getRemoteAccessCertificateThumbprint()
    {
        return this.remoteAccessCertificateThumbprint;
    }
    
    /**
    * The thumbprint of the RDP server certificate (in Windows) or SSH server
    * certificate (in Linux). The thumbprint is only used for Virtual Machines
    * that have been created from an image.
    */
    public void setRemoteAccessCertificateThumbprint(String remoteAccessCertificateThumbprint)
    {
        this.remoteAccessCertificateThumbprint = remoteAccessCertificateThumbprint;
    }
    
    private String roleName;
    
    /**
    * The name of the role.
    */
    public String getRoleName()
    {
        return this.roleName;
    }
    
    /**
    * The name of the role.
    */
    public void setRoleName(String roleName)
    {
        this.roleName = roleName;
    }
    
    /**
    * Initializes a new instance of the RoleInstance class.
    *
    */
    public RoleInstance()
    {
        this.instanceEndpoints = new ArrayList<InstanceEndpoint>();
    }
}
