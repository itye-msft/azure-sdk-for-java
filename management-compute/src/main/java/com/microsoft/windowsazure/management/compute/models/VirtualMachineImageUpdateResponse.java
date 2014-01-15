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
import java.util.Calendar;

/**
* Parameters returned from the Create Virtual Machine Image operation.
*/
public class VirtualMachineImageUpdateResponse extends OperationResponse
{
    private String category;
    
    /**
    * The repository classification of the image. All user images have the
    * category User.
    */
    public String getCategory()
    {
        return this.category;
    }
    
    /**
    * The repository classification of the image. All user images have the
    * category User.
    */
    public void setCategory(String category)
    {
        this.category = category;
    }
    
    private String description;
    
    /**
    * Specifies the description of the OS image.
    */
    public String getDescription()
    {
        return this.description;
    }
    
    /**
    * Specifies the description of the OS image.
    */
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    private String eula;
    
    /**
    * Specifies the End User License Agreement that is associated with the
    * image. The value for this element is a string, but it is recommended
    * that the value be a URL that points to a EULA.
    */
    public String getEula()
    {
        return this.eula;
    }
    
    /**
    * Specifies the End User License Agreement that is associated with the
    * image. The value for this element is a string, but it is recommended
    * that the value be a URL that points to a EULA.
    */
    public void setEula(String eula)
    {
        this.eula = eula;
    }
    
    private URI iconUri;
    
    /**
    * Specifies the Uri to the icon that is displayed for the image in the
    * Management Portal.
    */
    public URI getIconUri()
    {
        return this.iconUri;
    }
    
    /**
    * Specifies the Uri to the icon that is displayed for the image in the
    * Management Portal.
    */
    public void setIconUri(URI iconUri)
    {
        this.iconUri = iconUri;
    }
    
    private String imageFamily;
    
    /**
    * Specifies a value that can be used to group OS images.
    */
    public String getImageFamily()
    {
        return this.imageFamily;
    }
    
    /**
    * Specifies a value that can be used to group OS images.
    */
    public void setImageFamily(String imageFamily)
    {
        this.imageFamily = imageFamily;
    }
    
    private Boolean isPremium;
    
    /**
    * Indicates if the image contains software or associated services that will
    * incur charges above the core price for the virtual machine.
    */
    public Boolean getIsPremium()
    {
        return this.isPremium;
    }
    
    /**
    * Indicates if the image contains software or associated services that will
    * incur charges above the core price for the virtual machine.
    */
    public void setIsPremium(Boolean isPremium)
    {
        this.isPremium = isPremium;
    }
    
    private String label;
    
    /**
    * Specifies the friendly name of the image.
    */
    public String getLabel()
    {
        return this.label;
    }
    
    /**
    * Specifies the friendly name of the image.
    */
    public void setLabel(String label)
    {
        this.label = label;
    }
    
    private String language;
    
    /**
    * Specifies the language of the image.  The Language element is only
    * available using version 2013-03-01 or higher.
    */
    public String getLanguage()
    {
        return this.language;
    }
    
    /**
    * Specifies the language of the image.  The Language element is only
    * available using version 2013-03-01 or higher.
    */
    public void setLanguage(String language)
    {
        this.language = language;
    }
    
    private String location;
    
    /**
    * The geo-location in which this media is located. The Location value is
    * derived from storage account that contains the blob in which the media
    * is located. If the storage account belongs to an affinity group the
    * value is NULL.  If the version is set to 2012-08-01 or later, the
    * locations are returned for platform images; otherwise, this value is
    * NULL for platform images.
    */
    public String getLocation()
    {
        return this.location;
    }
    
    /**
    * The geo-location in which this media is located. The Location value is
    * derived from storage account that contains the blob in which the media
    * is located. If the storage account belongs to an affinity group the
    * value is NULL.  If the version is set to 2012-08-01 or later, the
    * locations are returned for platform images; otherwise, this value is
    * NULL for platform images.
    */
    public void setLocation(String location)
    {
        this.location = location;
    }
    
    private double logicalSizeInGB;
    
    /**
    * The size, in GB, of the image.
    */
    public double getLogicalSizeInGB()
    {
        return this.logicalSizeInGB;
    }
    
    /**
    * The size, in GB, of the image.
    */
    public void setLogicalSizeInGB(double logicalSizeInGB)
    {
        this.logicalSizeInGB = logicalSizeInGB;
    }
    
    private URI mediaLinkUri;
    
    /**
    * Specifies the location of the blob in Windows Azure storage. The blob
    * location must belong to a storage account in the subscription specified
    * by the SubscriptionId value in the operation call.  Example:
    * http://example.blob.core.windows.net/disks/mydisk.vhd
    */
    public URI getMediaLinkUri()
    {
        return this.mediaLinkUri;
    }
    
    /**
    * Specifies the location of the blob in Windows Azure storage. The blob
    * location must belong to a storage account in the subscription specified
    * by the SubscriptionId value in the operation call.  Example:
    * http://example.blob.core.windows.net/disks/mydisk.vhd
    */
    public void setMediaLinkUri(URI mediaLinkUri)
    {
        this.mediaLinkUri = mediaLinkUri;
    }
    
    private String name;
    
    /**
    * Specifies a name that Windows Azure uses to identify the image when
    * creating one or more virtual machines.
    */
    public String getName()
    {
        return this.name;
    }
    
    /**
    * Specifies a name that Windows Azure uses to identify the image when
    * creating one or more virtual machines.
    */
    public void setName(String name)
    {
        this.name = name;
    }
    
    private String operatingSystemType;
    
    /**
    * The operating system type of the OS image. Possible values are: Linux,
    * Windows.
    */
    public String getOperatingSystemType()
    {
        return this.operatingSystemType;
    }
    
    /**
    * The operating system type of the OS image. Possible values are: Linux,
    * Windows.
    */
    public void setOperatingSystemType(String operatingSystemType)
    {
        this.operatingSystemType = operatingSystemType;
    }
    
    private URI privacyUri;
    
    /**
    * Specifies the URI that points to a document that contains the privacy
    * policy related to the OS image.
    */
    public URI getPrivacyUri()
    {
        return this.privacyUri;
    }
    
    /**
    * Specifies the URI that points to a document that contains the privacy
    * policy related to the OS image.
    */
    public void setPrivacyUri(URI privacyUri)
    {
        this.privacyUri = privacyUri;
    }
    
    private Calendar publishedDate;
    
    /**
    * Specifies the date when the OS image was added to the image repository.
    */
    public Calendar getPublishedDate()
    {
        return this.publishedDate;
    }
    
    /**
    * Specifies the date when the OS image was added to the image repository.
    */
    public void setPublishedDate(Calendar publishedDate)
    {
        this.publishedDate = publishedDate;
    }
    
    private String publisherName;
    
    /**
    * Specifies the name of the publisher of the image.
    */
    public String getPublisherName()
    {
        return this.publisherName;
    }
    
    /**
    * Specifies the name of the publisher of the image.
    */
    public void setPublisherName(String publisherName)
    {
        this.publisherName = publisherName;
    }
    
    private VirtualMachineRoleSize recommendedVMSize;
    
    /**
    * Specifies the size to use for the virtual machine that is created from
    * the OS image.
    */
    public VirtualMachineRoleSize getRecommendedVMSize()
    {
        return this.recommendedVMSize;
    }
    
    /**
    * Specifies the size to use for the virtual machine that is created from
    * the OS image.
    */
    public void setRecommendedVMSize(VirtualMachineRoleSize recommendedVMSize)
    {
        this.recommendedVMSize = recommendedVMSize;
    }
    
    private Boolean showInGui;
    
    /**
    * Specifies whether the image should appear in the image gallery.
    */
    public Boolean getShowInGui()
    {
        return this.showInGui;
    }
    
    /**
    * Specifies whether the image should appear in the image gallery.
    */
    public void setShowInGui(Boolean showInGui)
    {
        this.showInGui = showInGui;
    }
    
    private URI smallIconUri;
    
    /**
    * Specifies the URI to the small icon that is displayed when the image is
    * presented in the Windows Azure Management Portal.  The SmallIconUri
    * element is only available using version 2013-03-01 or higher.
    */
    public URI getSmallIconUri()
    {
        return this.smallIconUri;
    }
    
    /**
    * Specifies the URI to the small icon that is displayed when the image is
    * presented in the Windows Azure Management Portal.  The SmallIconUri
    * element is only available using version 2013-03-01 or higher.
    */
    public void setSmallIconUri(URI smallIconUri)
    {
        this.smallIconUri = smallIconUri;
    }
}
