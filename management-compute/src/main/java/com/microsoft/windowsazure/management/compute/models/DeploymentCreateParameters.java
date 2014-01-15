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

import java.net.URI;
import java.util.HashMap;

/**
* Parameters supplied to the Create Deployment operation.
*/
public class DeploymentCreateParameters
{
    private String configuration;
    
    /**
    * Required. The service configuration file for the deployment.
    */
    public String getConfiguration()
    {
        return this.configuration;
    }
    
    /**
    * Required. The service configuration file for the deployment.
    */
    public void setConfiguration(String configuration)
    {
        this.configuration = configuration;
    }
    
    private HashMap<String, String> extendedProperties;
    
    /**
    * Optional. Represents the name of an extended deployment property. Each
    * extended property must have both a defined name and value. You can have
    * a maximum of 25 extended property name/value pairs. The maximum length
    * of the Name element is 64 characters, only alphanumeric characters and
    * underscores are valid in the Name, and the name must start with a
    * letter. Attempting to use other characters, starting the Name with a
    * non-letter character, or entering a name that is identical to that of
    * another extended property owned by the same hosted service, will result
    * in a status code 400 (Bad Request) error.
    */
    public HashMap<String, String> getExtendedProperties()
    {
        return this.extendedProperties;
    }
    
    /**
    * Optional. Represents the name of an extended deployment property. Each
    * extended property must have both a defined name and value. You can have
    * a maximum of 25 extended property name/value pairs. The maximum length
    * of the Name element is 64 characters, only alphanumeric characters and
    * underscores are valid in the Name, and the name must start with a
    * letter. Attempting to use other characters, starting the Name with a
    * non-letter character, or entering a name that is identical to that of
    * another extended property owned by the same hosted service, will result
    * in a status code 400 (Bad Request) error.
    */
    public void setExtendedProperties(HashMap<String, String> extendedProperties)
    {
        this.extendedProperties = extendedProperties;
    }
    
    private ExtensionConfiguration extensionConfiguration;
    
    /**
    * Optional. Represents an extension that is added to the cloud service. In
    * Windows Azure, a process can run as an extension of a cloud service. For
    * example, Remote Desktop Access or the Windows Azure Diagnostics Agent
    * can run as extensions to the cloud service. You must add an extension to
    * the cloud service by using Add Extension before it can be added to the
    * deployment.
    */
    public ExtensionConfiguration getExtensionConfiguration()
    {
        return this.extensionConfiguration;
    }
    
    /**
    * Optional. Represents an extension that is added to the cloud service. In
    * Windows Azure, a process can run as an extension of a cloud service. For
    * example, Remote Desktop Access or the Windows Azure Diagnostics Agent
    * can run as extensions to the cloud service. You must add an extension to
    * the cloud service by using Add Extension before it can be added to the
    * deployment.
    */
    public void setExtensionConfiguration(ExtensionConfiguration extensionConfiguration)
    {
        this.extensionConfiguration = extensionConfiguration;
    }
    
    private String label;
    
    /**
    * Required. A name for the hosted service. The name can be up to 100
    * characters in length. It is recommended that the label be unique within
    * the subscription. The name can be used identify the hosted service for
    * your tracking purposes.
    */
    public String getLabel()
    {
        return this.label;
    }
    
    /**
    * Required. A name for the hosted service. The name can be up to 100
    * characters in length. It is recommended that the label be unique within
    * the subscription. The name can be used identify the hosted service for
    * your tracking purposes.
    */
    public void setLabel(String label)
    {
        this.label = label;
    }
    
    private String name;
    
    /**
    * Required. The name for the deployment. The deployment name must be unique
    * among other deployments for the cloud service.
    */
    public String getName()
    {
        return this.name;
    }
    
    /**
    * Required. The name for the deployment. The deployment name must be unique
    * among other deployments for the cloud service.
    */
    public void setName(String name)
    {
        this.name = name;
    }
    
    private URI packageUri;
    
    /**
    * Required. A URL that refers to the location of the service package in the
    * Blob service. The service package can be located either in a storage
    * account beneath the same subscription or a Shared Access Signature (SAS)
    * URI from any storage account. For more info about Shared Access
    * Signatures, see Delegating Access with a Shared Access Signature (REST
    * API) at
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee395415.aspx.
    */
    public URI getPackageUri()
    {
        return this.packageUri;
    }
    
    /**
    * Required. A URL that refers to the location of the service package in the
    * Blob service. The service package can be located either in a storage
    * account beneath the same subscription or a Shared Access Signature (SAS)
    * URI from any storage account. For more info about Shared Access
    * Signatures, see Delegating Access with a Shared Access Signature (REST
    * API) at
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee395415.aspx.
    */
    public void setPackageUri(URI packageUri)
    {
        this.packageUri = packageUri;
    }
    
    private Boolean startDeployment;
    
    /**
    * Optional. Indicates whether to start the deployment immediately after it
    * is created. The default value is false.  If false, the service model is
    * still deployed to the virtual machines but the code is not run
    * immediately. Instead, the service is Suspended until you call Update
    * Deployment Status and set the status toRunning, at which time the
    * service will be started. A deployed service still incurs charges, even
    * if it is suspended.
    */
    public Boolean getStartDeployment()
    {
        return this.startDeployment;
    }
    
    /**
    * Optional. Indicates whether to start the deployment immediately after it
    * is created. The default value is false.  If false, the service model is
    * still deployed to the virtual machines but the code is not run
    * immediately. Instead, the service is Suspended until you call Update
    * Deployment Status and set the status toRunning, at which time the
    * service will be started. A deployed service still incurs charges, even
    * if it is suspended.
    */
    public void setStartDeployment(Boolean startDeployment)
    {
        this.startDeployment = startDeployment;
    }
    
    private Boolean treatWarningsAsError;
    
    /**
    * Optional. Indicates whether to treat package validation warnings as
    * errors. The default value is false. If set to true, the Created
    * Deployment operation fails if there are validation warnings on the
    * service package.
    */
    public Boolean getTreatWarningsAsError()
    {
        return this.treatWarningsAsError;
    }
    
    /**
    * Optional. Indicates whether to treat package validation warnings as
    * errors. The default value is false. If set to true, the Created
    * Deployment operation fails if there are validation warnings on the
    * service package.
    */
    public void setTreatWarningsAsError(Boolean treatWarningsAsError)
    {
        this.treatWarningsAsError = treatWarningsAsError;
    }
    
    /**
    * Initializes a new instance of the DeploymentCreateParameters class.
    *
    */
    public DeploymentCreateParameters()
    {
        this.extendedProperties = new HashMap<String, String>();
    }
}
