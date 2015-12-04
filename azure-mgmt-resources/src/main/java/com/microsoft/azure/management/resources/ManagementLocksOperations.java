/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.resources;

import com.microsoft.azure.management.resources.models.ManagementLockObject;
import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.HTTP;
import retrofit.http.Path;
import retrofit.http.PUT;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in ManagementLocksOperations.
 */
public interface ManagementLocksOperations {
    /**
     * The interface defining all the services for ManagementLocksOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ManagementLocksService {
        @PUT("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Authorization/locks/{lockName}")
        Call<ResponseBody> createOrUpdateAtResourceGroupLevel(@Path("resourceGroupName") String resourceGroupName, @Path("lockName") String lockName, @Path("subscriptionId") String subscriptionId, @Body ManagementLockObject parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @PUT("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{parentResourcePath}/{resourceType}/{resourceName}/providers/Microsoft.Authorization/locks/{lockName}")
        Call<ResponseBody> createOrUpdateAtResourceLevel(@Path("resourceGroupName") String resourceGroupName, @Path("resourceProviderNamespace") String resourceProviderNamespace, @Path("parentResourcePath") String parentResourcePath, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Path("lockName") String lockName, @Path("subscriptionId") String subscriptionId, @Body ManagementLockObject parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @HTTP(path = "/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{parentResourcePath}/{resourceType}/{resourceName}/providers/Microsoft.Authorization/locks/{lockName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteAtResourceLevel(@Path("resourceGroupName") String resourceGroupName, @Path("resourceProviderNamespace") String resourceProviderNamespace, @Path("parentResourcePath") String parentResourcePath, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Path("lockName") String lockName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @PUT("/subscriptions/{subscriptionId}/providers/Microsoft.Authorization/locks/{lockName}")
        Call<ResponseBody> createOrUpdateAtSubscriptionLevel(@Path("lockName") String lockName, @Path("subscriptionId") String subscriptionId, @Body ManagementLockObject parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @HTTP(path = "/subscriptions/{subscriptionId}/providers/Microsoft.Authorization/locks/{lockName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteAtSubscriptionLevel(@Path("lockName") String lockName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/providers/Microsoft.Authorization/locks/{lockName}")
        Call<ResponseBody> get(@Path("lockName") String lockName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @HTTP(path = "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Authorization/locks/{lockName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteAtResourceGroupLevel(@Path("resourceGroup") String resourceGroup, @Path("lockName") String lockName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Authorization/locks")
        Call<ResponseBody> listAtResourceGroupLevel(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{parentResourcePath}/{resourceType}/{resourceName}/providers/Microsoft.Authorization/locks")
        Call<ResponseBody> listAtResourceLevel(@Path("resourceGroupName") String resourceGroupName, @Path("resourceProviderNamespace") String resourceProviderNamespace, @Path("parentResourcePath") String parentResourcePath, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/{nextLink}")
        Call<ResponseBody> listNext(@Path("nextLink") String nextLink, @Path("subscriptionId") String subscriptionId, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/providers/Microsoft.Authorization/locks")
        Call<ResponseBody> listAtSubscriptionLevel(@Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listAtResourceGroupLevelNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listAtResourceLevelNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listNextNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listAtSubscriptionLevelNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Create or update a management lock at the resource group level.
     *
     * @param resourceGroupName The resource group name.
     * @param lockName The lock name.
     * @param parameters The management lock parameters.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ManagementLockObject object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ManagementLockObject> createOrUpdateAtResourceGroupLevel(String resourceGroupName, String lockName, ManagementLockObject parameters) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Create or update a management lock at the resource group level.
     *
     * @param resourceGroupName The resource group name.
     * @param lockName The lock name.
     * @param parameters The management lock parameters.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAtResourceGroupLevelAsync(String resourceGroupName, String lockName, ManagementLockObject parameters, final ServiceCallback<ManagementLockObject> serviceCallback);

    /**
     * Create or update a management lock at the resource level or any level below resource.
     *
     * @param resourceGroupName The name of the resource group. 
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param lockName The name of lock.
     * @param parameters Create or update management lock parameters.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ManagementLockObject object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ManagementLockObject> createOrUpdateAtResourceLevel(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String lockName, ManagementLockObject parameters) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Create or update a management lock at the resource level or any level below resource.
     *
     * @param resourceGroupName The name of the resource group. 
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param lockName The name of lock.
     * @param parameters Create or update management lock parameters.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAtResourceLevelAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String lockName, ManagementLockObject parameters, final ServiceCallback<ManagementLockObject> serviceCallback);

    /**
     * Deletes the management lock of a resource or any level below resource.
     *
     * @param resourceGroupName The name of the resource group. 
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param lockName The name of lock.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> deleteAtResourceLevel(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String lockName) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Deletes the management lock of a resource or any level below resource.
     *
     * @param resourceGroupName The name of the resource group. 
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param lockName The name of lock.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAtResourceLevelAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String lockName, final ServiceCallback<Void> serviceCallback);

    /**
     * Create or update a management lock at the subscription level.
     *
     * @param lockName The name of lock.
     * @param parameters The management lock parameters.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ManagementLockObject object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ManagementLockObject> createOrUpdateAtSubscriptionLevel(String lockName, ManagementLockObject parameters) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Create or update a management lock at the subscription level.
     *
     * @param lockName The name of lock.
     * @param parameters The management lock parameters.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAtSubscriptionLevelAsync(String lockName, ManagementLockObject parameters, final ServiceCallback<ManagementLockObject> serviceCallback);

    /**
     * Deletes the management lock of a subscription.
     *
     * @param lockName The name of lock.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> deleteAtSubscriptionLevel(String lockName) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Deletes the management lock of a subscription.
     *
     * @param lockName The name of lock.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAtSubscriptionLevelAsync(String lockName, final ServiceCallback<Void> serviceCallback);

    /**
     * Gets the management lock of a scope.
     *
     * @param lockName Name of the management lock.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ManagementLockObject object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ManagementLockObject> get(String lockName) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Gets the management lock of a scope.
     *
     * @param lockName Name of the management lock.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String lockName, final ServiceCallback<ManagementLockObject> serviceCallback);

    /**
     * Deletes the management lock of a resource group.
     *
     * @param resourceGroup The resource group names.
     * @param lockName The name of lock.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> deleteAtResourceGroupLevel(String resourceGroup, String lockName) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Deletes the management lock of a resource group.
     *
     * @param resourceGroup The resource group names.
     * @param lockName The name of lock.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAtResourceGroupLevelAsync(String resourceGroup, String lockName, final ServiceCallback<Void> serviceCallback);

    /**
     * Gets all the management locks of a resource group.
     *
     * @param resourceGroupName Resource group name.
     * @param filter The filter to apply on the operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;ManagementLockObject&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ManagementLockObject>> listAtResourceGroupLevel(String resourceGroupName, ManagementLockObject filter) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Gets all the management locks of a resource group.
     *
     * @param resourceGroupName Resource group name.
     * @param filter The filter to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAtResourceGroupLevelAsync(String resourceGroupName, ManagementLockObject filter, final ServiceCallback<PageImpl<ManagementLockObject>> serviceCallback);

    /**
     * Gets all the management locks of a resource or any level below resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param filter The filter to apply on the operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;ManagementLockObject&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ManagementLockObject>> listAtResourceLevel(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, ManagementLockObject filter) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Gets all the management locks of a resource or any level below resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param filter The filter to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAtResourceLevelAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, ManagementLockObject filter, final ServiceCallback<PageImpl<ManagementLockObject>> serviceCallback);

    /**
     * Get a list of management locks at resource level or below.
     *
     * @param nextLink NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;ManagementLockObject&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ManagementLockObject>> listNext(String nextLink) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get a list of management locks at resource level or below.
     *
     * @param nextLink NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextLink, final ServiceCallback<PageImpl<ManagementLockObject>> serviceCallback);

    /**
     * Gets all the management locks of a subscription.
     *
     * @param filter The filter to apply on the operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;ManagementLockObject&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ManagementLockObject>> listAtSubscriptionLevel(ManagementLockObject filter) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Gets all the management locks of a subscription.
     *
     * @param filter The filter to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAtSubscriptionLevelAsync(ManagementLockObject filter, final ServiceCallback<PageImpl<ManagementLockObject>> serviceCallback);

    /**
     * Gets all the management locks of a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;ManagementLockObject&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ManagementLockObject>> listAtResourceGroupLevelNext(String nextPageLink) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Gets all the management locks of a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAtResourceGroupLevelNextAsync(String nextPageLink, final ServiceCallback<PageImpl<ManagementLockObject>> serviceCallback);

    /**
     * Gets all the management locks of a resource or any level below resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;ManagementLockObject&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ManagementLockObject>> listAtResourceLevelNext(String nextPageLink) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Gets all the management locks of a resource or any level below resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAtResourceLevelNextAsync(String nextPageLink, final ServiceCallback<PageImpl<ManagementLockObject>> serviceCallback);

    /**
     * Get a list of management locks at resource level or below.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;ManagementLockObject&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ManagementLockObject>> listNextNext(String nextPageLink) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get a list of management locks at resource level or below.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextNextAsync(String nextPageLink, final ServiceCallback<PageImpl<ManagementLockObject>> serviceCallback);

    /**
     * Gets all the management locks of a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;ManagementLockObject&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ManagementLockObject>> listAtSubscriptionLevelNext(String nextPageLink) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Gets all the management locks of a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAtSubscriptionLevelNextAsync(String nextPageLink, final ServiceCallback<PageImpl<ManagementLockObject>> serviceCallback);

}
