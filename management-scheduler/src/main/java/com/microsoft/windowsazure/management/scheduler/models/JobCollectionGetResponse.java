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

package com.microsoft.windowsazure.management.scheduler.models;

import com.microsoft.windowsazure.core.OperationResponse;

/**
* The Get Job Collection operation response.
*/
public class JobCollectionGetResponse extends OperationResponse
{
    private String eTag;
    
    /**
    * ETag of the Job Collection.
    */
    public String getETag()
    {
        return this.eTag;
    }
    
    /**
    * ETag of the Job Collection.
    */
    public void setETag(String eTag)
    {
        this.eTag = eTag;
    }
    
    private JobCollectionIntrinsicSettings intrinsicSettings;
    
    /**
    * Intrinsic settings for the scheduler job collections.
    */
    public JobCollectionIntrinsicSettings getIntrinsicSettings()
    {
        return this.intrinsicSettings;
    }
    
    /**
    * Intrinsic settings for the scheduler job collections.
    */
    public void setIntrinsicSettings(JobCollectionIntrinsicSettings intrinsicSettings)
    {
        this.intrinsicSettings = intrinsicSettings;
    }
    
    private String label;
    
    /**
    * Label for the resource.
    */
    public String getLabel()
    {
        return this.label;
    }
    
    /**
    * Label for the resource.
    */
    public void setLabel(String label)
    {
        this.label = label;
    }
    
    private JobCollectionGetResponse.OperationStatus lastOperationStatus;
    
    /**
    * The promotion code for buying the resource.
    */
    public JobCollectionGetResponse.OperationStatus getLastOperationStatus()
    {
        return this.lastOperationStatus;
    }
    
    /**
    * The promotion code for buying the resource.
    */
    public void setLastOperationStatus(JobCollectionGetResponse.OperationStatus lastOperationStatus)
    {
        this.lastOperationStatus = lastOperationStatus;
    }
    
    private String name;
    
    /**
    * Name of the Job Collection.
    */
    public String getName()
    {
        return this.name;
    }
    
    /**
    * Name of the Job Collection.
    */
    public void setName(String name)
    {
        this.name = name;
    }
    
    private String plan;
    
    /**
    * The plan of the resource.
    */
    public String getPlan()
    {
        return this.plan;
    }
    
    /**
    * The plan of the resource.
    */
    public void setPlan(String plan)
    {
        this.plan = plan;
    }
    
    private String promotionCode;
    
    /**
    * The promotion code for buying the resource.
    */
    public String getPromotionCode()
    {
        return this.promotionCode;
    }
    
    /**
    * The promotion code for buying the resource.
    */
    public void setPromotionCode(String promotionCode)
    {
        this.promotionCode = promotionCode;
    }
    
    private String schemaVersion;
    
    /**
    * The version of the Intrinsic Properties for your Resource. If not
    * specified, you must conform to the contract resource version you
    * registered as default.
    */
    public String getSchemaVersion()
    {
        return this.schemaVersion;
    }
    
    /**
    * The version of the Intrinsic Properties for your Resource. If not
    * specified, you must conform to the contract resource version you
    * registered as default.
    */
    public void setSchemaVersion(String schemaVersion)
    {
        this.schemaVersion = schemaVersion;
    }
    
    private JobCollectionState state;
    
    /**
    * State of the Job Collection.
    */
    public JobCollectionState getState()
    {
        return this.state;
    }
    
    /**
    * State of the Job Collection.
    */
    public void setState(JobCollectionState state)
    {
        this.state = state;
    }
    
    /**
    * Result of a previous operation.
    */
    public static class OperationStatus
    {
        private JobCollectionGetResponse.OperationStatusResponseDetails responseDetails;
        
        /**
        * Details about the last operation.
        */
        public JobCollectionGetResponse.OperationStatusResponseDetails getResponseDetails()
        {
            return this.responseDetails;
        }
        
        /**
        * Details about the last operation.
        */
        public void setResponseDetails(JobCollectionGetResponse.OperationStatusResponseDetails responseDetails)
        {
            this.responseDetails = responseDetails;
        }
        
        private SchedulerOperationStatus status;
        
        /**
        * Status of the last operation.
        */
        public SchedulerOperationStatus getStatus()
        {
            return this.status;
        }
        
        /**
        * Status of the last operation.
        */
        public void setStatus(SchedulerOperationStatus status)
        {
            this.status = status;
        }
    }
    
    /**
    * Response details about an operation.
    */
    public static class OperationStatusResponseDetails
    {
        private String message;
        
        /**
        * Message returned by the operation.
        */
        public String getMessage()
        {
            return this.message;
        }
        
        /**
        * Message returned by the operation.
        */
        public void setMessage(String message)
        {
            this.message = message;
        }
        
        private Integer statusCode;
        
        /**
        * The HTTP status code of the operation.
        */
        public Integer getStatusCode()
        {
            return this.statusCode;
        }
        
        /**
        * The HTTP status code of the operation.
        */
        public void setStatusCode(Integer statusCode)
        {
            this.statusCode = statusCode;
        }
    }
}
