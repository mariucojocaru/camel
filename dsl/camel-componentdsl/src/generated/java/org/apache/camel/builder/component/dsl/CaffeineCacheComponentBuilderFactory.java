/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.caffeine.cache.CaffeineCacheComponent;

/**
 * Perform caching operations using Caffeine Cache.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface CaffeineCacheComponentBuilderFactory {

    /**
     * Caffeine Cache (camel-caffeine)
     * Perform caching operations using Caffeine Cache.
     * 
     * Category: cache,datagrid,clustering
     * Since: 2.20
     * Maven coordinates: org.apache.camel:camel-caffeine
     * 
     * @return the dsl builder
     */
    static CaffeineCacheComponentBuilder caffeineCache() {
        return new CaffeineCacheComponentBuilderImpl();
    }

    /**
     * Builder for the Caffeine Cache component.
     */
    interface CaffeineCacheComponentBuilder
            extends
                ComponentBuilder<CaffeineCacheComponent> {
        /**
         * To configure the default cache action. If an action is set in the
         * message header, then the operation from the header takes precedence.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param action the value to set
         * @return the dsl builder
         */
        default CaffeineCacheComponentBuilder action(java.lang.String action) {
            doSetProperty("action", action);
            return this;
        }
        /**
         * Automatic create the Caffeine cache if none has been configured or
         * exists in the registry.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param createCacheIfNotExist the value to set
         * @return the dsl builder
         */
        default CaffeineCacheComponentBuilder createCacheIfNotExist(
                boolean createCacheIfNotExist) {
            doSetProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * Set the eviction Type for this cache.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.caffeine.EvictionType&lt;/code&gt; type.
         * 
         * Default: SIZE_BASED
         * Group: producer
         * 
         * @param evictionType the value to set
         * @return the dsl builder
         */
        default CaffeineCacheComponentBuilder evictionType(
                org.apache.camel.component.caffeine.EvictionType evictionType) {
            doSetProperty("evictionType", evictionType);
            return this;
        }
        /**
         * Specifies that each entry should be automatically removed from the
         * cache once a fixed duration has elapsed after the entry's creation,
         * the most recent replacement of its value, or its last read. Access
         * time is reset by all cache read and write operations. The unit is in
         * seconds.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 300
         * Group: producer
         * 
         * @param expireAfterAccessTime the value to set
         * @return the dsl builder
         */
        default CaffeineCacheComponentBuilder expireAfterAccessTime(
                int expireAfterAccessTime) {
            doSetProperty("expireAfterAccessTime", expireAfterAccessTime);
            return this;
        }
        /**
         * Specifies that each entry should be automatically removed from the
         * cache once a fixed duration has elapsed after the entry's creation,
         * or the most recent replacement of its value. The unit is in seconds.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 300
         * Group: producer
         * 
         * @param expireAfterWriteTime the value to set
         * @return the dsl builder
         */
        default CaffeineCacheComponentBuilder expireAfterWriteTime(
                int expireAfterWriteTime) {
            doSetProperty("expireAfterWriteTime", expireAfterWriteTime);
            return this;
        }
        /**
         * Sets the minimum total size for the internal data structures.
         * Providing a large enough estimate at construction time avoids the
         * need for expensive resizing operations later, but setting this value
         * unnecessarily high wastes memory.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param initialCapacity the value to set
         * @return the dsl builder
         */
        default CaffeineCacheComponentBuilder initialCapacity(
                java.lang.Integer initialCapacity) {
            doSetProperty("initialCapacity", initialCapacity);
            return this;
        }
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param key the value to set
         * @return the dsl builder
         */
        default CaffeineCacheComponentBuilder key(java.lang.Object key) {
            doSetProperty("key", key);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default CaffeineCacheComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Specifies the maximum number of entries the cache may contain. Note
         * that the cache may evict an entry before this limit is exceeded or
         * temporarily exceed the threshold while evicting. As the cache size
         * grows close to the maximum, the cache evicts entries that are less
         * likely to be used again. For example, the cache may evict an entry
         * because it hasn't been used recently or very often. When size is
         * zero, elements will be evicted immediately after being loaded into
         * the cache. This can be useful in testing, or to disable caching
         * temporarily without a code change. As eviction is scheduled on the
         * configured executor, tests may instead prefer to configure the cache
         * to execute tasks directly on the same thread.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param maximumSize the value to set
         * @return the dsl builder
         */
        default CaffeineCacheComponentBuilder maximumSize(
                java.lang.Integer maximumSize) {
            doSetProperty("maximumSize", maximumSize);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default CaffeineCacheComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * To configure a CacheLoader in case of a LoadCache use.
         * 
         * The option is a:
         * &lt;code&gt;com.github.benmanes.caffeine.cache.CacheLoader&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param cacheLoader the value to set
         * @return the dsl builder
         */
        default CaffeineCacheComponentBuilder cacheLoader(
                com.github.benmanes.caffeine.cache.CacheLoader cacheLoader) {
            doSetProperty("cacheLoader", cacheLoader);
            return this;
        }
        /**
         * Sets the global component configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.caffeine.CaffeineConfiguration&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default CaffeineCacheComponentBuilder configuration(
                org.apache.camel.component.caffeine.CaffeineConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The cache key type, default java.lang.Object.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param keyType the value to set
         * @return the dsl builder
         */
        default CaffeineCacheComponentBuilder keyType(java.lang.String keyType) {
            doSetProperty("keyType", keyType);
            return this;
        }
        /**
         * Set a specific removal Listener for the cache.
         * 
         * The option is a:
         * &lt;code&gt;com.github.benmanes.caffeine.cache.RemovalListener&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param removalListener the value to set
         * @return the dsl builder
         */
        default CaffeineCacheComponentBuilder removalListener(
                com.github.benmanes.caffeine.cache.RemovalListener removalListener) {
            doSetProperty("removalListener", removalListener);
            return this;
        }
        /**
         * Set a specific Stats Counter for the cache stats.
         * 
         * The option is a:
         * &lt;code&gt;com.github.benmanes.caffeine.cache.stats.StatsCounter&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param statsCounter the value to set
         * @return the dsl builder
         */
        default CaffeineCacheComponentBuilder statsCounter(
                com.github.benmanes.caffeine.cache.stats.StatsCounter statsCounter) {
            doSetProperty("statsCounter", statsCounter);
            return this;
        }
        /**
         * To enable stats on the cache.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param statsEnabled the value to set
         * @return the dsl builder
         */
        default CaffeineCacheComponentBuilder statsEnabled(boolean statsEnabled) {
            doSetProperty("statsEnabled", statsEnabled);
            return this;
        }
        /**
         * The cache value type, default java.lang.Object.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param valueType the value to set
         * @return the dsl builder
         */
        default CaffeineCacheComponentBuilder valueType(
                java.lang.String valueType) {
            doSetProperty("valueType", valueType);
            return this;
        }
    }

    class CaffeineCacheComponentBuilderImpl
            extends
                AbstractComponentBuilder<CaffeineCacheComponent>
            implements
                CaffeineCacheComponentBuilder {
        @Override
        protected CaffeineCacheComponent buildConcreteComponent() {
            return new CaffeineCacheComponent();
        }
        private org.apache.camel.component.caffeine.CaffeineConfiguration getOrCreateConfiguration(
                org.apache.camel.component.caffeine.cache.CaffeineCacheComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.caffeine.CaffeineConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "action": getOrCreateConfiguration((CaffeineCacheComponent) component).setAction((java.lang.String) value); return true;
            case "createCacheIfNotExist": getOrCreateConfiguration((CaffeineCacheComponent) component).setCreateCacheIfNotExist((boolean) value); return true;
            case "evictionType": getOrCreateConfiguration((CaffeineCacheComponent) component).setEvictionType((org.apache.camel.component.caffeine.EvictionType) value); return true;
            case "expireAfterAccessTime": getOrCreateConfiguration((CaffeineCacheComponent) component).setExpireAfterAccessTime((int) value); return true;
            case "expireAfterWriteTime": getOrCreateConfiguration((CaffeineCacheComponent) component).setExpireAfterWriteTime((int) value); return true;
            case "initialCapacity": getOrCreateConfiguration((CaffeineCacheComponent) component).setInitialCapacity((java.lang.Integer) value); return true;
            case "key": getOrCreateConfiguration((CaffeineCacheComponent) component).setKey((java.lang.Object) value); return true;
            case "lazyStartProducer": ((CaffeineCacheComponent) component).setLazyStartProducer((boolean) value); return true;
            case "maximumSize": getOrCreateConfiguration((CaffeineCacheComponent) component).setMaximumSize((java.lang.Integer) value); return true;
            case "autowiredEnabled": ((CaffeineCacheComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "cacheLoader": getOrCreateConfiguration((CaffeineCacheComponent) component).setCacheLoader((com.github.benmanes.caffeine.cache.CacheLoader) value); return true;
            case "configuration": ((CaffeineCacheComponent) component).setConfiguration((org.apache.camel.component.caffeine.CaffeineConfiguration) value); return true;
            case "keyType": getOrCreateConfiguration((CaffeineCacheComponent) component).setKeyType((java.lang.String) value); return true;
            case "removalListener": getOrCreateConfiguration((CaffeineCacheComponent) component).setRemovalListener((com.github.benmanes.caffeine.cache.RemovalListener) value); return true;
            case "statsCounter": getOrCreateConfiguration((CaffeineCacheComponent) component).setStatsCounter((com.github.benmanes.caffeine.cache.stats.StatsCounter) value); return true;
            case "statsEnabled": getOrCreateConfiguration((CaffeineCacheComponent) component).setStatsEnabled((boolean) value); return true;
            case "valueType": getOrCreateConfiguration((CaffeineCacheComponent) component).setValueType((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}