/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.storagecache.v2019_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storagecache.v2019_08_01.Skus;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.arm.utils.PagedListConverter;
import com.microsoft.azure.management.storagecache.v2019_08_01.ResourceSku;

class SkusImpl extends WrapperImpl<SkusInner> implements Skus {
    private PagedListConverter<ResourceSkuInner, ResourceSku> converter;
    private final StorageCacheManager manager;

    SkusImpl(StorageCacheManager manager) {
        super(manager.inner().skus());
        this.manager = manager;
        this.converter = new PagedListConverter<ResourceSkuInner, ResourceSku>() {
            @Override
            public Observable<ResourceSku> typeConvertAsync(ResourceSkuInner inner) {
                return Observable.just((ResourceSku) wrapModel(inner));
            }
        };
    }

    public StorageCacheManager manager() {
        return this.manager;
    }

    private ResourceSkuImpl wrapModel(ResourceSkuInner inner) {
        return  new ResourceSkuImpl(inner, manager());
    }

    @Override
    public PagedList<ResourceSku> list() {
        SkusInner client = this.inner();
        return converter.convert(client.list());
    }

    @Override
    public Observable<ResourceSku> listAsync() {
        SkusInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ResourceSkuInner>, Iterable<ResourceSkuInner>>() {
            @Override
            public Iterable<ResourceSkuInner> call(Page<ResourceSkuInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceSkuInner, ResourceSku>() {
            @Override
            public ResourceSku call(ResourceSkuInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
