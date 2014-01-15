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

package com.microsoft.windowsazure.management.store;

import com.microsoft.windowsazure.core.ServiceOperations;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.store.models.AddOnOperationStatusResponse;
import com.microsoft.windowsazure.management.store.models.CloudServiceCreateParameters;
import com.microsoft.windowsazure.management.store.models.CloudServiceListResponse;
import com.microsoft.windowsazure.management.store.models.OperationStatus;
import com.microsoft.windowsazure.tracing.ClientRequestTrackingHandler;
import com.microsoft.windowsazure.tracing.CloudTracing;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
* Provides REST operations for working with cloud services from the Windows
* Azure store service.
*/
public class CloudServiceOperationsImpl implements ServiceOperations<StoreManagementClientImpl>, CloudServiceOperations
{
    /**
    * Initializes a new instance of the CloudServiceOperationsImpl class.
    *
    * @param client Reference to the service client.
    */
    CloudServiceOperationsImpl(StoreManagementClientImpl client)
    {
        this.client = client;
    }
    
    private StoreManagementClientImpl client;
    
    /**
    * Gets a reference to the
    * microsoft.windowsazure.management.store.StoreManagementClientImpl.
    */
    public StoreManagementClientImpl getClient()
    {
        return this.client;
    }
    
    /**
    * The Create Cloud Service operation creates a Windows Azure cloud service
    * in a Windows Azure subscription.
    *
    * @param parameters Parameters used to specify how the Create procedure
    * will function.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    @Override
    public Future<AddOnOperationStatusResponse> beginCreatingAsync(final CloudServiceCreateParameters parameters)
    {
        return this.getClient().getExecutorService().submit(new Callable<AddOnOperationStatusResponse>() { 
            @Override
            public AddOnOperationStatusResponse call() throws Exception
            {
                return beginCreating(parameters);
            }
         });
    }
    
    /**
    * The Create Cloud Service operation creates a Windows Azure cloud service
    * in a Windows Azure subscription.
    *
    * @param parameters Parameters used to specify how the Create procedure
    * will function.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    @Override
    public AddOnOperationStatusResponse beginCreating(CloudServiceCreateParameters parameters) throws ParserConfigurationException, SAXException, TransformerConfigurationException, TransformerException, UnsupportedEncodingException, IOException, ServiceException
    {
        // Validate
        if (parameters == null)
        {
            throw new NullPointerException("parameters");
        }
        if (parameters.getDescription() == null)
        {
            throw new NullPointerException("parameters.Description");
        }
        if (parameters.getGeoRegion() == null)
        {
            throw new NullPointerException("parameters.GeoRegion");
        }
        if (parameters.getLabel() == null)
        {
            throw new NullPointerException("parameters.Label");
        }
        if (parameters.getName() == null)
        {
            throw new NullPointerException("parameters.Name");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace)
        {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("parameters", parameters);
            CloudTracing.enter(invocationId, this, "beginCreatingAsync", tracingParameters);
        }
        
        // Construct URL
        String url = this.getClient().getBaseUri() + "/" + this.getClient().getCredentials().getSubscriptionId() + "/CloudServices/" + parameters.getName() + "/";
        
        // Create HTTP transport objects
        HttpPut httpRequest = new HttpPut(url);
        
        // Set Headers
        httpRequest.setHeader("Content-Type", "application/xml");
        httpRequest.setHeader("x-ms-version", "2013-06-01");
        
        // Serialize Request
        String requestContent = null;
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document requestDoc = documentBuilder.newDocument();
        
        Element cloudServiceElement = requestDoc.createElementNS("http://schemas.microsoft.com/windowsazure", "CloudService");
        requestDoc.appendChild(cloudServiceElement);
        
        Element nameElement = requestDoc.createElementNS("http://schemas.microsoft.com/windowsazure", "Name");
        nameElement.appendChild(requestDoc.createTextNode(parameters.getName()));
        cloudServiceElement.appendChild(nameElement);
        
        Element labelElement = requestDoc.createElementNS("http://schemas.microsoft.com/windowsazure", "Label");
        labelElement.appendChild(requestDoc.createTextNode(parameters.getLabel()));
        cloudServiceElement.appendChild(labelElement);
        
        Element descriptionElement = requestDoc.createElementNS("http://schemas.microsoft.com/windowsazure", "Description");
        descriptionElement.appendChild(requestDoc.createTextNode(parameters.getDescription()));
        cloudServiceElement.appendChild(descriptionElement);
        
        Element geoRegionElement = requestDoc.createElementNS("http://schemas.microsoft.com/windowsazure", "GeoRegion");
        geoRegionElement.appendChild(requestDoc.createTextNode(parameters.getGeoRegion()));
        cloudServiceElement.appendChild(geoRegionElement);
        
        DOMSource domSource = new DOMSource(requestDoc);
        StringWriter stringWriter = new StringWriter();
        StreamResult streamResult = new StreamResult(stringWriter);
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.transform(domSource, streamResult);
        requestContent = stringWriter.toString();
        StringEntity entity = new StringEntity(requestContent);
        httpRequest.setEntity(entity);
        httpRequest.setHeader("Content-Type", "application/xml");
        
        // Send Request
        HttpResponse httpResponse = null;
        if (shouldTrace)
        {
            CloudTracing.sendRequest(invocationId, httpRequest);
        }
        httpResponse = this.getClient().getHttpClient().execute(httpRequest);
        if (shouldTrace)
        {
            CloudTracing.receiveResponse(invocationId, httpResponse);
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode != HttpStatus.SC_ACCEPTED)
        {
            ServiceException ex = ServiceException.createFromXml(httpRequest, requestContent, httpResponse, httpResponse.getEntity());
            if (shouldTrace)
            {
                CloudTracing.error(invocationId, ex);
            }
            throw ex;
        }
        
        // Create Result
        AddOnOperationStatusResponse result = null;
        result = new AddOnOperationStatusResponse();
        result.setStatusCode(statusCode);
        if (httpResponse.getHeaders("x-ms-request-id").length > 0)
        {
            result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
        }
        
        if (shouldTrace)
        {
            CloudTracing.exit(invocationId, result);
        }
        return result;
    }
    
    /**
    * The Create Cloud Service operation creates a Windows Azure cloud service
    * in a Windows Azure subscription.
    *
    * @param parameters Parameters used to specify how the Create procedure
    * will function.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    @Override
    public Future<AddOnOperationStatusResponse> createAsync(final CloudServiceCreateParameters parameters)
    {
        return this.getClient().getExecutorService().submit(new Callable<AddOnOperationStatusResponse>() { 
            @Override
            public AddOnOperationStatusResponse call() throws Exception
            {
                return create(parameters);
            }
         });
    }
    
    /**
    * The Create Cloud Service operation creates a Windows Azure cloud service
    * in a Windows Azure subscription.
    *
    * @param parameters Parameters used to specify how the Create procedure
    * will function.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    @Override
    public AddOnOperationStatusResponse create(CloudServiceCreateParameters parameters) throws InterruptedException, ExecutionException, ServiceException, IOException
    {
        StoreManagementClient client2 = this.getClient();
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace)
        {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("parameters", parameters);
            CloudTracing.enter(invocationId, this, "createAsync", tracingParameters);
        }
        try
        {
            if (shouldTrace)
            {
                client2 = this.getClient().withRequestFilterLast(new ClientRequestTrackingHandler(invocationId)).withResponseFilterLast(new ClientRequestTrackingHandler(invocationId));
            }
            
            AddOnOperationStatusResponse response = client2.getCloudServicesOperations().beginCreatingAsync(parameters).get();
            AddOnOperationStatusResponse result = client2.getOperationStatusAsync(response.getRequestId()).get();
            int delayInSeconds = 30;
            while ((result.getStatus() != OperationStatus.InProgress) == false)
            {
                Thread.sleep(delayInSeconds * 1000);
                result = client2.getOperationStatusAsync(response.getRequestId()).get();
                delayInSeconds = 30;
            }
            
            if (shouldTrace)
            {
                CloudTracing.exit(invocationId, result);
            }
            
            if (result.getStatus() != OperationStatus.Succeeded)
            {
                if (result.getError() != null)
                {
                    ServiceException ex = new ServiceException(result.getError().getCode() + " : " + result.getError().getMessage());
                    ex.setErrorCode(result.getError().getCode());
                    ex.setErrorMessage(result.getError().getMessage());
                    if (shouldTrace)
                    {
                        CloudTracing.error(invocationId, ex);
                    }
                    throw ex;
                }
                else
                {
                    ServiceException ex = new ServiceException("");
                    if (shouldTrace)
                    {
                        CloudTracing.error(invocationId, ex);
                    }
                    throw ex;
                }
            }
            
            return result;
        }
        finally
        {
            if (this.getClient() != null && shouldTrace)
            {
                this.getClient().close();
            }
        }
    }
    
    /**
    * The List Cloud Services operation enumerates Windows Azure Store entries
    * that are provisioned for a subscription.
    *
    * @return The response structure for the Cloud Service List operation.
    */
    @Override
    public Future<CloudServiceListResponse> listAsync()
    {
        return this.getClient().getExecutorService().submit(new Callable<CloudServiceListResponse>() { 
            @Override
            public CloudServiceListResponse call() throws Exception
            {
                return list();
            }
         });
    }
    
    /**
    * The List Cloud Services operation enumerates Windows Azure Store entries
    * that are provisioned for a subscription.
    *
    * @return The response structure for the Cloud Service List operation.
    */
    @Override
    public CloudServiceListResponse list() throws IOException, ServiceException, ParserConfigurationException, SAXException
    {
        // Validate
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace)
        {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            CloudTracing.enter(invocationId, this, "listAsync", tracingParameters);
        }
        
        // Construct URL
        String url = this.getClient().getBaseUri() + "/" + this.getClient().getCredentials().getSubscriptionId() + "/CloudServices/";
        
        // Create HTTP transport objects
        HttpGet httpRequest = new HttpGet(url);
        
        // Set Headers
        httpRequest.setHeader("x-ms-version", "2013-06-01");
        
        // Send Request
        HttpResponse httpResponse = null;
        if (shouldTrace)
        {
            CloudTracing.sendRequest(invocationId, httpRequest);
        }
        httpResponse = this.getClient().getHttpClient().execute(httpRequest);
        if (shouldTrace)
        {
            CloudTracing.receiveResponse(invocationId, httpResponse);
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode != HttpStatus.SC_OK)
        {
            ServiceException ex = ServiceException.createFromXml(httpRequest, null, httpResponse, httpResponse.getEntity());
            if (shouldTrace)
            {
                CloudTracing.error(invocationId, ex);
            }
            throw ex;
        }
        
        // Create Result
        CloudServiceListResponse result = null;
        // Deserialize Response
        InputStream responseContent = httpResponse.getEntity().getContent();
        result = new CloudServiceListResponse();
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document responseDoc = documentBuilder.parse(responseContent);
        
        NodeList elements = responseDoc.getElementsByTagName("CloudServices");
        Element cloudServicesSequenceElement = elements.getLength() > 0 ? ((Element) elements.item(0)) : null;
        if (cloudServicesSequenceElement != null)
        {
            for (int i1 = 0; i1 < cloudServicesSequenceElement.getElementsByTagName("CloudService").getLength(); i1 = i1 + 1)
            {
                org.w3c.dom.Element cloudServicesElement = ((org.w3c.dom.Element) cloudServicesSequenceElement.getElementsByTagName("CloudService").item(i1));
                CloudServiceListResponse.CloudService cloudServiceInstance = new CloudServiceListResponse.CloudService();
                result.getCloudServices().add(cloudServiceInstance);
                
                NodeList elements2 = cloudServicesElement.getElementsByTagName("Name");
                Element nameElement = elements2.getLength() > 0 ? ((Element) elements2.item(0)) : null;
                if (nameElement != null)
                {
                    String nameInstance;
                    nameInstance = nameElement.getTextContent();
                    cloudServiceInstance.setName(nameInstance);
                }
                
                NodeList elements3 = cloudServicesElement.getElementsByTagName("Label");
                Element labelElement = elements3.getLength() > 0 ? ((Element) elements3.item(0)) : null;
                if (labelElement != null)
                {
                    String labelInstance;
                    labelInstance = labelElement.getTextContent() != null ? new String(Base64.decodeBase64(labelElement.getTextContent().getBytes())) : null;
                    cloudServiceInstance.setLabel(labelInstance);
                }
                
                NodeList elements4 = cloudServicesElement.getElementsByTagName("Description");
                Element descriptionElement = elements4.getLength() > 0 ? ((Element) elements4.item(0)) : null;
                if (descriptionElement != null)
                {
                    String descriptionInstance;
                    descriptionInstance = descriptionElement.getTextContent();
                    cloudServiceInstance.setDescription(descriptionInstance);
                }
                
                NodeList elements5 = cloudServicesElement.getElementsByTagName("GeoRegion");
                Element geoRegionElement = elements5.getLength() > 0 ? ((Element) elements5.item(0)) : null;
                if (geoRegionElement != null)
                {
                    String geoRegionInstance;
                    geoRegionInstance = geoRegionElement.getTextContent();
                    cloudServiceInstance.setGeoRegion(geoRegionInstance);
                }
                
                NodeList elements6 = cloudServicesElement.getElementsByTagName("Resources");
                Element resourcesSequenceElement = elements6.getLength() > 0 ? ((Element) elements6.item(0)) : null;
                if (resourcesSequenceElement != null)
                {
                    for (int i2 = 0; i2 < resourcesSequenceElement.getElementsByTagName("Resource").getLength(); i2 = i2 + 1)
                    {
                        org.w3c.dom.Element resourcesElement = ((org.w3c.dom.Element) resourcesSequenceElement.getElementsByTagName("Resource").item(i2));
                        CloudServiceListResponse.CloudService.AddOnResource resourceInstance = new CloudServiceListResponse.CloudService.AddOnResource();
                        cloudServiceInstance.getResources().add(resourceInstance);
                        
                        NodeList elements7 = resourcesElement.getElementsByTagName("ResourceProviderNamespace");
                        Element resourceProviderNamespaceElement = elements7.getLength() > 0 ? ((Element) elements7.item(0)) : null;
                        if (resourceProviderNamespaceElement != null)
                        {
                            String resourceProviderNamespaceInstance;
                            resourceProviderNamespaceInstance = resourceProviderNamespaceElement.getTextContent();
                            resourceInstance.setNamespace(resourceProviderNamespaceInstance);
                        }
                        
                        NodeList elements8 = resourcesElement.getElementsByTagName("Type");
                        Element typeElement = elements8.getLength() > 0 ? ((Element) elements8.item(0)) : null;
                        if (typeElement != null)
                        {
                            String typeInstance;
                            typeInstance = typeElement.getTextContent();
                            resourceInstance.setType(typeInstance);
                        }
                        
                        NodeList elements9 = resourcesElement.getElementsByTagName("Name");
                        Element nameElement2 = elements9.getLength() > 0 ? ((Element) elements9.item(0)) : null;
                        if (nameElement2 != null)
                        {
                            String nameInstance2;
                            nameInstance2 = nameElement2.getTextContent();
                            resourceInstance.setName(nameInstance2);
                        }
                        
                        NodeList elements10 = resourcesElement.getElementsByTagName("Plan");
                        Element planElement = elements10.getLength() > 0 ? ((Element) elements10.item(0)) : null;
                        if (planElement != null)
                        {
                            String planInstance;
                            planInstance = planElement.getTextContent();
                            resourceInstance.setPlan(planInstance);
                        }
                        
                        NodeList elements11 = resourcesElement.getElementsByTagName("SchemaVersion");
                        Element schemaVersionElement = elements11.getLength() > 0 ? ((Element) elements11.item(0)) : null;
                        if (schemaVersionElement != null)
                        {
                            String schemaVersionInstance;
                            schemaVersionInstance = schemaVersionElement.getTextContent();
                            resourceInstance.setSchemaVersion(schemaVersionInstance);
                        }
                        
                        NodeList elements12 = resourcesElement.getElementsByTagName("ETag");
                        Element eTagElement = elements12.getLength() > 0 ? ((Element) elements12.item(0)) : null;
                        if (eTagElement != null)
                        {
                            String eTagInstance;
                            eTagInstance = eTagElement.getTextContent();
                            resourceInstance.setETag(eTagInstance);
                        }
                        
                        NodeList elements13 = resourcesElement.getElementsByTagName("State");
                        Element stateElement = elements13.getLength() > 0 ? ((Element) elements13.item(0)) : null;
                        if (stateElement != null)
                        {
                            String stateInstance;
                            stateInstance = stateElement.getTextContent();
                            resourceInstance.setState(stateInstance);
                        }
                        
                        NodeList elements14 = resourcesElement.getElementsByTagName("UsageMeters");
                        Element usageMetersSequenceElement = elements14.getLength() > 0 ? ((Element) elements14.item(0)) : null;
                        if (usageMetersSequenceElement != null)
                        {
                            for (int i3 = 0; i3 < usageMetersSequenceElement.getElementsByTagName("UsageMeter").getLength(); i3 = i3 + 1)
                            {
                                org.w3c.dom.Element usageMetersElement = ((org.w3c.dom.Element) usageMetersSequenceElement.getElementsByTagName("UsageMeter").item(i3));
                                CloudServiceListResponse.CloudService.AddOnResource.UsageLimit usageMeterInstance = new CloudServiceListResponse.CloudService.AddOnResource.UsageLimit();
                                resourceInstance.getUsageLimits().add(usageMeterInstance);
                                
                                NodeList elements15 = usageMetersElement.getElementsByTagName("Name");
                                Element nameElement3 = elements15.getLength() > 0 ? ((Element) elements15.item(0)) : null;
                                if (nameElement3 != null)
                                {
                                    String nameInstance3;
                                    nameInstance3 = nameElement3.getTextContent();
                                    usageMeterInstance.setName(nameInstance3);
                                }
                                
                                NodeList elements16 = usageMetersElement.getElementsByTagName("Unit");
                                Element unitElement = elements16.getLength() > 0 ? ((Element) elements16.item(0)) : null;
                                if (unitElement != null)
                                {
                                    String unitInstance;
                                    unitInstance = unitElement.getTextContent();
                                    usageMeterInstance.setUnit(unitInstance);
                                }
                                
                                NodeList elements17 = usageMetersElement.getElementsByTagName("Included");
                                Element includedElement = elements17.getLength() > 0 ? ((Element) elements17.item(0)) : null;
                                if (includedElement != null)
                                {
                                    long includedInstance;
                                    includedInstance = Long.parseLong(includedElement.getTextContent());
                                    usageMeterInstance.setAmountIncluded(includedInstance);
                                }
                                
                                NodeList elements18 = usageMetersElement.getElementsByTagName("Used");
                                Element usedElement = elements18.getLength() > 0 ? ((Element) elements18.item(0)) : null;
                                if (usedElement != null)
                                {
                                    long usedInstance;
                                    usedInstance = Long.parseLong(usedElement.getTextContent());
                                    usageMeterInstance.setAmountUsed(usedInstance);
                                }
                            }
                        }
                        
                        NodeList elements19 = resourcesElement.getElementsByTagName("OutputItems");
                        Element outputItemsSequenceElement = elements19.getLength() > 0 ? ((Element) elements19.item(0)) : null;
                        if (outputItemsSequenceElement != null)
                        {
                            for (int i4 = 0; i4 < outputItemsSequenceElement.getElementsByTagName("OutputItem").getLength(); i4 = i4 + 1)
                            {
                                org.w3c.dom.Element outputItemsElement = ((org.w3c.dom.Element) outputItemsSequenceElement.getElementsByTagName("OutputItem").item(i4));
                                NodeList elements20 = outputItemsElement.getElementsByTagName("Key");
                                String outputItemsKey = elements20.getLength() > 0 ? ((org.w3c.dom.Element) elements20.item(0)).getTextContent() : null;
                                NodeList elements21 = outputItemsElement.getElementsByTagName("Value");
                                String outputItemsValue = elements21.getLength() > 0 ? ((org.w3c.dom.Element) elements21.item(0)).getTextContent() : null;
                                resourceInstance.getOutputItems().put(outputItemsKey, outputItemsValue);
                            }
                        }
                        
                        NodeList elements22 = resourcesElement.getElementsByTagName("OperationStatus");
                        Element operationStatusElement = elements22.getLength() > 0 ? ((Element) elements22.item(0)) : null;
                        if (operationStatusElement != null)
                        {
                            CloudServiceListResponse.CloudService.AddOnResource.OperationStatus operationStatusInstance = new CloudServiceListResponse.CloudService.AddOnResource.OperationStatus();
                            resourceInstance.setStatus(operationStatusInstance);
                            
                            NodeList elements23 = operationStatusElement.getElementsByTagName("Type");
                            Element typeElement2 = elements23.getLength() > 0 ? ((Element) elements23.item(0)) : null;
                            if (typeElement2 != null)
                            {
                                String typeInstance2;
                                typeInstance2 = typeElement2.getTextContent();
                                operationStatusInstance.setType(typeInstance2);
                            }
                            
                            NodeList elements24 = operationStatusElement.getElementsByTagName("Result");
                            Element resultElement = elements24.getLength() > 0 ? ((Element) elements24.item(0)) : null;
                            if (resultElement != null)
                            {
                                String resultInstance;
                                resultInstance = resultElement.getTextContent();
                                operationStatusInstance.setResult(resultInstance);
                            }
                        }
                    }
                }
            }
        }
        
        result.setStatusCode(statusCode);
        if (httpResponse.getHeaders("x-ms-request-id").length > 0)
        {
            result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
        }
        
        if (shouldTrace)
        {
            CloudTracing.exit(invocationId, result);
        }
        return result;
    }
}
