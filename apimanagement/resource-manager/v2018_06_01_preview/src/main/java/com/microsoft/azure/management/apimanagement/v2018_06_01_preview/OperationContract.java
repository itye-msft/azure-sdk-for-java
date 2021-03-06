/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.OperationContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.ApiManagementManager;
import java.util.List;

/**
 * Type representing OperationContract.
 */
public interface OperationContract extends HasInner<OperationContractInner>, Indexable, Refreshable<OperationContract>, Updatable<OperationContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the method value.
     */
    String method();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the policies value.
     */
    String policies();

    /**
     * @return the request value.
     */
    RequestContract request();

    /**
     * @return the responses value.
     */
    List<ResponseContract> responses();

    /**
     * @return the templateParameters value.
     */
    List<ParameterContract> templateParameters();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the urlTemplate value.
     */
    String urlTemplate();

    /**
     * The entirety of the OperationContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithApi, DefinitionStages.WithIfMatch, DefinitionStages.WithDisplayName, DefinitionStages.WithMethod, DefinitionStages.WithUrlTemplate, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of OperationContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a OperationContract definition.
         */
        interface Blank extends WithApi {
        }

        /**
         * The stage of the operationcontract definition allowing to specify Api.
         */
        interface WithApi {
           /**
            * Specifies resourceGroupName, serviceName, apiId.
            * @param resourceGroupName The name of the resource group
            * @param serviceName The name of the API Management service
            * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number
            * @return the next definition stage
            */
            WithIfMatch withExistingApi(String resourceGroupName, String serviceName, String apiId);
        }

        /**
         * The stage of the operationcontract definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
            * @return the next definition stage
            */
            WithDisplayName withIfMatch(String ifMatch);
        }

        /**
         * The stage of the operationcontract definition allowing to specify DisplayName.
         */
        interface WithDisplayName {
           /**
            * Specifies displayName.
            * @param displayName Operation Name
            * @return the next definition stage
            */
            WithMethod withDisplayName(String displayName);
        }

        /**
         * The stage of the operationcontract definition allowing to specify Method.
         */
        interface WithMethod {
           /**
            * Specifies method.
            * @param method A Valid HTTP Operation Method. Typical Http Methods like GET, PUT, POST but not limited by only them
            * @return the next definition stage
            */
            WithUrlTemplate withMethod(String method);
        }

        /**
         * The stage of the operationcontract definition allowing to specify UrlTemplate.
         */
        interface WithUrlTemplate {
           /**
            * Specifies urlTemplate.
            * @param urlTemplate Relative URL template identifying the target resource for this operation. May include parameters. Example: /customers/{cid}/orders/{oid}/?date={date}
            * @return the next definition stage
            */
            WithCreate withUrlTemplate(String urlTemplate);
        }

        /**
         * The stage of the operationcontract definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Description of the operation. May include HTML formatting tags
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the operationcontract definition allowing to specify Policies.
         */
        interface WithPolicies {
            /**
             * Specifies policies.
             * @param policies Operation Policies
             * @return the next definition stage
             */
            WithCreate withPolicies(String policies);
        }

        /**
         * The stage of the operationcontract definition allowing to specify Request.
         */
        interface WithRequest {
            /**
             * Specifies request.
             * @param request An entity containing request details
             * @return the next definition stage
             */
            WithCreate withRequest(RequestContract request);
        }

        /**
         * The stage of the operationcontract definition allowing to specify Responses.
         */
        interface WithResponses {
            /**
             * Specifies responses.
             * @param responses Array of Operation responses
             * @return the next definition stage
             */
            WithCreate withResponses(List<ResponseContract> responses);
        }

        /**
         * The stage of the operationcontract definition allowing to specify TemplateParameters.
         */
        interface WithTemplateParameters {
            /**
             * Specifies templateParameters.
             * @param templateParameters Collection of URL template parameters
             * @return the next definition stage
             */
            WithCreate withTemplateParameters(List<ParameterContract> templateParameters);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<OperationContract>, DefinitionStages.WithDescription, DefinitionStages.WithPolicies, DefinitionStages.WithRequest, DefinitionStages.WithResponses, DefinitionStages.WithTemplateParameters {
        }
    }
    /**
     * The template for a OperationContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<OperationContract>, UpdateStages.WithIfMatch, UpdateStages.WithDescription, UpdateStages.WithPolicies, UpdateStages.WithRequest, UpdateStages.WithResponses, UpdateStages.WithTemplateParameters {
    }

    /**
     * Grouping of OperationContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the operationcontract update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the operationcontract update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Description of the operation. May include HTML formatting tags
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the operationcontract update allowing to specify Policies.
         */
        interface WithPolicies {
            /**
             * Specifies policies.
             * @param policies Operation Policies
             * @return the next update stage
             */
            Update withPolicies(String policies);
        }

        /**
         * The stage of the operationcontract update allowing to specify Request.
         */
        interface WithRequest {
            /**
             * Specifies request.
             * @param request An entity containing request details
             * @return the next update stage
             */
            Update withRequest(RequestContract request);
        }

        /**
         * The stage of the operationcontract update allowing to specify Responses.
         */
        interface WithResponses {
            /**
             * Specifies responses.
             * @param responses Array of Operation responses
             * @return the next update stage
             */
            Update withResponses(List<ResponseContract> responses);
        }

        /**
         * The stage of the operationcontract update allowing to specify TemplateParameters.
         */
        interface WithTemplateParameters {
            /**
             * Specifies templateParameters.
             * @param templateParameters Collection of URL template parameters
             * @return the next update stage
             */
            Update withTemplateParameters(List<ParameterContract> templateParameters);
        }

    }
}
