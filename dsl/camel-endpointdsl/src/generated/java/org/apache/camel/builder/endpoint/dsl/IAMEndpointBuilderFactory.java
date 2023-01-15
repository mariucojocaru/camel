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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * To securely manage users on Huawei Cloud
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface IAMEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Huawei Identity and Access Management (IAM)
     * component.
     */
    public interface IAMEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedIAMEndpointBuilder advanced() {
            return (AdvancedIAMEndpointBuilder) this;
        }
        /**
         * Access key for the cloud user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default IAMEndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Group ID to perform operation with.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param groupId the value to set
         * @return the dsl builder
         */
        default IAMEndpointBuilder groupId(String groupId) {
            doSetProperty("groupId", groupId);
            return this;
        }
        /**
         * Ignore SSL verification.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param ignoreSslVerification the value to set
         * @return the dsl builder
         */
        default IAMEndpointBuilder ignoreSslVerification(
                boolean ignoreSslVerification) {
            doSetProperty("ignoreSslVerification", ignoreSslVerification);
            return this;
        }
        /**
         * Ignore SSL verification.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param ignoreSslVerification the value to set
         * @return the dsl builder
         */
        default IAMEndpointBuilder ignoreSslVerification(
                String ignoreSslVerification) {
            doSetProperty("ignoreSslVerification", ignoreSslVerification);
            return this;
        }
        /**
         * Proxy server ip/hostname.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default IAMEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * Proxy authentication password.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPassword the value to set
         * @return the dsl builder
         */
        default IAMEndpointBuilder proxyPassword(String proxyPassword) {
            doSetProperty("proxyPassword", proxyPassword);
            return this;
        }
        /**
         * Proxy server port.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default IAMEndpointBuilder proxyPort(int proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Proxy server port.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default IAMEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Proxy authentication user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyUser the value to set
         * @return the dsl builder
         */
        default IAMEndpointBuilder proxyUser(String proxyUser) {
            doSetProperty("proxyUser", proxyUser);
            return this;
        }
        /**
         * IAM service region.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default IAMEndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Secret key for the cloud user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default IAMEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Configuration object for cloud service authentication.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.huaweicloud.common.models.ServiceKeys&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param serviceKeys the value to set
         * @return the dsl builder
         */
        default IAMEndpointBuilder serviceKeys(
                org.apache.camel.component.huaweicloud.common.models.ServiceKeys serviceKeys) {
            doSetProperty("serviceKeys", serviceKeys);
            return this;
        }
        /**
         * Configuration object for cloud service authentication.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.huaweicloud.common.models.ServiceKeys&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param serviceKeys the value to set
         * @return the dsl builder
         */
        default IAMEndpointBuilder serviceKeys(String serviceKeys) {
            doSetProperty("serviceKeys", serviceKeys);
            return this;
        }
        /**
         * User ID to perform operation with.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param userId the value to set
         * @return the dsl builder
         */
        default IAMEndpointBuilder userId(String userId) {
            doSetProperty("userId", userId);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Huawei Identity and Access
     * Management (IAM) component.
     */
    public interface AdvancedIAMEndpointBuilder
            extends
                EndpointProducerBuilder {
        default IAMEndpointBuilder basic() {
            return (IAMEndpointBuilder) this;
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedIAMEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedIAMEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface IAMBuilders {
        /**
         * Huawei Identity and Access Management (IAM) (camel-huaweicloud-iam)
         * To securely manage users on Huawei Cloud
         * 
         * Category: cloud
         * Since: 3.11
         * Maven coordinates: org.apache.camel:camel-huaweicloud-iam
         * 
         * Syntax: <code>hwcloud-iam:operation</code>
         * 
         * Path parameter: operation (required)
         * Operation to be performed
         * 
         * @param path operation
         * @return the dsl builder
         */
        default IAMEndpointBuilder hwcloudIam(String path) {
            return IAMEndpointBuilderFactory.endpointBuilder("hwcloud-iam", path);
        }
        /**
         * Huawei Identity and Access Management (IAM) (camel-huaweicloud-iam)
         * To securely manage users on Huawei Cloud
         * 
         * Category: cloud
         * Since: 3.11
         * Maven coordinates: org.apache.camel:camel-huaweicloud-iam
         * 
         * Syntax: <code>hwcloud-iam:operation</code>
         * 
         * Path parameter: operation (required)
         * Operation to be performed
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path operation
         * @return the dsl builder
         */
        default IAMEndpointBuilder hwcloudIam(String componentName, String path) {
            return IAMEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static IAMEndpointBuilder endpointBuilder(String componentName, String path) {
        class IAMEndpointBuilderImpl extends AbstractEndpointBuilder implements IAMEndpointBuilder, AdvancedIAMEndpointBuilder {
            public IAMEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new IAMEndpointBuilderImpl(path);
    }
}