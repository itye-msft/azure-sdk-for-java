/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ProductPolicys;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.apimanagement.v2019_01_01.PolicyCollection;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ProductPolicyContract;

class ProductPolicysImpl extends WrapperImpl<ProductPolicysInner> implements ProductPolicys {
    private final ApiManagementManager manager;

    ProductPolicysImpl(ApiManagementManager manager) {
        super(manager.inner().productPolicys());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public ProductPolicyContractImpl define(String name) {
        return wrapModel(name);
    }

    private ProductPolicyContractImpl wrapModel(PolicyContractInner inner) {
        return  new ProductPolicyContractImpl(inner, manager());
    }

    private ProductPolicyContractImpl wrapModel(String name) {
        return new ProductPolicyContractImpl(name, this.manager());
    }

    @Override
    public Observable<PolicyCollection> listByProductAsync(String resourceGroupName, String serviceName, String productId) {
        ProductPolicysInner client = this.inner();
        return client.listByProductAsync(resourceGroupName, serviceName, productId)
        .map(new Func1<PolicyCollectionInner, PolicyCollection>() {
            @Override
            public PolicyCollection call(PolicyCollectionInner inner) {
                return new PolicyCollectionImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName, String productId) {
        ProductPolicysInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName, productId).toCompletable();
    }

    @Override
    public Observable<ProductPolicyContract> getAsync(String resourceGroupName, String serviceName, String productId) {
        ProductPolicysInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, productId)
        .flatMap(new Func1<PolicyContractInner, Observable<ProductPolicyContract>>() {
            @Override
            public Observable<ProductPolicyContract> call(PolicyContractInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ProductPolicyContract)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, String productId, String ifMatch) {
        ProductPolicysInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, productId, ifMatch).toCompletable();
    }

}
