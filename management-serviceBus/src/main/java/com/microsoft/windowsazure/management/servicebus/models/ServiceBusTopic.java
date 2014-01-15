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

package com.microsoft.windowsazure.management.servicebus.models;

import java.util.ArrayList;
import java.util.Calendar;

public class ServiceBusTopic
{
    private Calendar accessedAt;
    
    /**
    * The time the queue was last accessed.
    */
    public Calendar getAccessedAt()
    {
        return this.accessedAt;
    }
    
    /**
    * The time the queue was last accessed.
    */
    public void setAccessedAt(Calendar accessedAt)
    {
        this.accessedAt = accessedAt;
    }
    
    private ArrayList<ServiceBusSharedAccessAuthorizationRule> authorizationRules;
    
    /**
    * Gets the authorization rules for the description.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    */
    public ArrayList<ServiceBusSharedAccessAuthorizationRule> getAuthorizationRules()
    {
        return this.authorizationRules;
    }
    
    /**
    * Gets the authorization rules for the description.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    */
    public void setAuthorizationRules(ArrayList<ServiceBusSharedAccessAuthorizationRule> authorizationRules)
    {
        this.authorizationRules = authorizationRules;
    }
    
    private String autoDeleteOnIdle;
    
    /**
    * Implemented.
    */
    public String getAutoDeleteOnIdle()
    {
        return this.autoDeleteOnIdle;
    }
    
    /**
    * Implemented.
    */
    public void setAutoDeleteOnIdle(String autoDeleteOnIdle)
    {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
    }
    
    private CountDetails countDetails;
    
    /**
    * Current queue statistics.
    */
    public CountDetails getCountDetails()
    {
        return this.countDetails;
    }
    
    /**
    * Current queue statistics.
    */
    public void setCountDetails(CountDetails countDetails)
    {
        this.countDetails = countDetails;
    }
    
    private Calendar createdAt;
    
    /**
    * The time the queue was created at.
    */
    public Calendar getCreatedAt()
    {
        return this.createdAt;
    }
    
    /**
    * The time the queue was created at.
    */
    public void setCreatedAt(Calendar createdAt)
    {
        this.createdAt = createdAt;
    }
    
    private String defaultMessageTimeToLive;
    
    /**
    * Determines how long a message lives in the associated subscriptions.
    * Subscriptions inherit the TTL from the topic unless they are created
    * explicitly with a smaller TTL. Based on whether dead-lettering is
    * enabled, a message whose TTL has expired will either be moved to the
    * subscription’s associated DeadLtterQueue or will be permanently deleted.
    * The following values are settable at topic creation time:* Range: 1
    * second - TimeSpan.MaxValue* Default: TimeSpan.MaxValue  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj839740.aspx for
    * more information)
    */
    public String getDefaultMessageTimeToLive()
    {
        return this.defaultMessageTimeToLive;
    }
    
    /**
    * Determines how long a message lives in the associated subscriptions.
    * Subscriptions inherit the TTL from the topic unless they are created
    * explicitly with a smaller TTL. Based on whether dead-lettering is
    * enabled, a message whose TTL has expired will either be moved to the
    * subscription’s associated DeadLtterQueue or will be permanently deleted.
    * The following values are settable at topic creation time:* Range: 1
    * second - TimeSpan.MaxValue* Default: TimeSpan.MaxValue  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj839740.aspx for
    * more information)
    */
    public void setDefaultMessageTimeToLive(String defaultMessageTimeToLive)
    {
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
    }
    
    private String duplicateDetectionHistoryTimeWindow;
    
    /**
    * Specifies the time span during which the Service Bus will detect message
    * duplication.* Range: 1 second - 7 days* Default: 10 minutes  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    */
    public String getDuplicateDetectionHistoryTimeWindow()
    {
        return this.duplicateDetectionHistoryTimeWindow;
    }
    
    /**
    * Specifies the time span during which the Service Bus will detect message
    * duplication.* Range: 1 second - 7 days* Default: 10 minutes  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    */
    public void setDuplicateDetectionHistoryTimeWindow(String duplicateDetectionHistoryTimeWindow)
    {
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
    }
    
    private boolean enableBatchedOperations;
    
    /**
    * Enables or disables service side batching behavior when performing
    * operations for the specific queue. When enabled, service bus will
    * collect/batch multiple operations to the backend to be more connection
    * efficient. If user wants lower operation latency then they can disable
    * this feature.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    */
    public boolean isEnableBatchedOperations()
    {
        return this.enableBatchedOperations;
    }
    
    /**
    * Enables or disables service side batching behavior when performing
    * operations for the specific queue. When enabled, service bus will
    * collect/batch multiple operations to the backend to be more connection
    * efficient. If user wants lower operation latency then they can disable
    * this feature.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    */
    public void setEnableBatchedOperations(boolean enableBatchedOperations)
    {
        this.enableBatchedOperations = enableBatchedOperations;
    }
    
    private String entityAvailabilityStatus;
    
    /**
    * The current availability status of the topic.
    */
    public String getEntityAvailabilityStatus()
    {
        return this.entityAvailabilityStatus;
    }
    
    /**
    * The current availability status of the topic.
    */
    public void setEntityAvailabilityStatus(String entityAvailabilityStatus)
    {
        this.entityAvailabilityStatus = entityAvailabilityStatus;
    }
    
    private boolean filteringMessagesBeforePublishing;
    
    /**
    * Gets or sets whether messages should be filtered before publishing.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    */
    public boolean isFilteringMessagesBeforePublishing()
    {
        return this.filteringMessagesBeforePublishing;
    }
    
    /**
    * Gets or sets whether messages should be filtered before publishing.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    */
    public void setFilteringMessagesBeforePublishing(boolean filteringMessagesBeforePublishing)
    {
        this.filteringMessagesBeforePublishing = filteringMessagesBeforePublishing;
    }
    
    private boolean isAnonymousAccessible;
    
    /**
    * Gets whether anonymous access is allowed.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    */
    public boolean isAnonymousAccessible()
    {
        return this.isAnonymousAccessible;
    }
    
    /**
    * Gets whether anonymous access is allowed.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    */
    public void setIsAnonymousAccessible(boolean isAnonymousAccessible)
    {
        this.isAnonymousAccessible = isAnonymousAccessible;
    }
    
    private int maxSizeInMegabytes;
    
    /**
    * Specifies the maximum topic size in megabytes. Any attempt to enqueue a
    * message that will cause the topic to exceed this value will fail. All
    * messages that are stored in the topic or any of its subscriptions count
    * towards this value. Multiple copies of a message that reside in one or
    * multiple subscriptions count as a single messages. For example, if
    * message m exists once in subscription s1 and twice in subscription s2, m
    * is counted as a single message. You can only set this parameter at topic
    * creation time using the following values:* Range: 1 - 5*1024 MB*
    * Default: 1*1024  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    */
    public int getMaxSizeInMegabytes()
    {
        return this.maxSizeInMegabytes;
    }
    
    /**
    * Specifies the maximum topic size in megabytes. Any attempt to enqueue a
    * message that will cause the topic to exceed this value will fail. All
    * messages that are stored in the topic or any of its subscriptions count
    * towards this value. Multiple copies of a message that reside in one or
    * multiple subscriptions count as a single messages. For example, if
    * message m exists once in subscription s1 and twice in subscription s2, m
    * is counted as a single message. You can only set this parameter at topic
    * creation time using the following values:* Range: 1 - 5*1024 MB*
    * Default: 1*1024  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    */
    public void setMaxSizeInMegabytes(int maxSizeInMegabytes)
    {
        this.maxSizeInMegabytes = maxSizeInMegabytes;
    }
    
    private String name;
    
    /**
    * The name of the topic.
    */
    public String getName()
    {
        return this.name;
    }
    
    /**
    * The name of the topic.
    */
    public void setName(String name)
    {
        this.name = name;
    }
    
    private boolean requiresDuplicateDetection;
    
    /**
    * If enabled, the topic will detect duplicate messages within the time span
    * specified by the DuplicateDetectionHistoryTimeWindow property. Settable
    * only at topic creation time.* Default: false  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    */
    public boolean isRequiresDuplicateDetection()
    {
        return this.requiresDuplicateDetection;
    }
    
    /**
    * If enabled, the topic will detect duplicate messages within the time span
    * specified by the DuplicateDetectionHistoryTimeWindow property. Settable
    * only at topic creation time.* Default: false  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    */
    public void setRequiresDuplicateDetection(boolean requiresDuplicateDetection)
    {
        this.requiresDuplicateDetection = requiresDuplicateDetection;
    }
    
    private int sizeInBytes;
    
    /**
    * Reflects the actual bytes toward the topic quota that messages in the
    * topic currently occupy. (read-only)* Range: 0 -MaxTopicSizeinMegaBytes
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx
    * for more information)
    */
    public int getSizeInBytes()
    {
        return this.sizeInBytes;
    }
    
    /**
    * Reflects the actual bytes toward the topic quota that messages in the
    * topic currently occupy. (read-only)* Range: 0 -MaxTopicSizeinMegaBytes
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx
    * for more information)
    */
    public void setSizeInBytes(int sizeInBytes)
    {
        this.sizeInBytes = sizeInBytes;
    }
    
    private String status;
    
    /**
    * Gets or sets the current status of the topic (enabled or disabled). When
    * a topic is disabled, that topic cannot send or receive messages.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    */
    public String getStatus()
    {
        return this.status;
    }
    
    /**
    * Gets or sets the current status of the topic (enabled or disabled). When
    * a topic is disabled, that topic cannot send or receive messages.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    */
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    private int subscriptionCount;
    
    /**
    * The current number of subscriptions to the topic.
    */
    public int getSubscriptionCount()
    {
        return this.subscriptionCount;
    }
    
    /**
    * The current number of subscriptions to the topic.
    */
    public void setSubscriptionCount(int subscriptionCount)
    {
        this.subscriptionCount = subscriptionCount;
    }
    
    private boolean supportOrdering;
    
    /**
    * Gets or sets whether the topics can be ordered.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    */
    public boolean isSupportOrdering()
    {
        return this.supportOrdering;
    }
    
    /**
    * Gets or sets whether the topics can be ordered.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780749.aspx for
    * more information)
    */
    public void setSupportOrdering(boolean supportOrdering)
    {
        this.supportOrdering = supportOrdering;
    }
    
    private Calendar updatedAt;
    
    /**
    * The time the queue was last updated.
    */
    public Calendar getUpdatedAt()
    {
        return this.updatedAt;
    }
    
    /**
    * The time the queue was last updated.
    */
    public void setUpdatedAt(Calendar updatedAt)
    {
        this.updatedAt = updatedAt;
    }
    
    /**
    * Initializes a new instance of the ServiceBusTopic class.
    *
    */
    public ServiceBusTopic()
    {
        this.authorizationRules = new ArrayList<ServiceBusSharedAccessAuthorizationRule>();
    }
}
