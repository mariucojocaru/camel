/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.consul.cloud;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.consul.cloud.ConsulServiceDiscoveryFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ConsulServiceDiscoveryFactoryConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.consul.cloud.ConsulServiceDiscoveryFactory target = (org.apache.camel.component.consul.cloud.ConsulServiceDiscoveryFactory) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acltoken":
        case "aclToken": target.setAclToken(property(camelContext, java.lang.String.class, value)); return true;
        case "blockseconds":
        case "blockSeconds": target.setBlockSeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "connecttimeout":
        case "connectTimeout": target.setConnectTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        case "datacenter": target.setDatacenter(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "readtimeout":
        case "readTimeout": target.setReadTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "url": target.setUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "userName": target.setUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "writetimeout":
        case "writeTimeout": target.setWriteTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acltoken":
        case "aclToken": return java.lang.String.class;
        case "blockseconds":
        case "blockSeconds": return java.lang.Integer.class;
        case "connecttimeout":
        case "connectTimeout": return java.time.Duration.class;
        case "datacenter": return java.lang.String.class;
        case "password": return java.lang.String.class;
        case "readtimeout":
        case "readTimeout": return java.time.Duration.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "url": return java.lang.String.class;
        case "username":
        case "userName": return java.lang.String.class;
        case "writetimeout":
        case "writeTimeout": return java.time.Duration.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.consul.cloud.ConsulServiceDiscoveryFactory target = (org.apache.camel.component.consul.cloud.ConsulServiceDiscoveryFactory) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acltoken":
        case "aclToken": return target.getAclToken();
        case "blockseconds":
        case "blockSeconds": return target.getBlockSeconds();
        case "connecttimeout":
        case "connectTimeout": return target.getConnectTimeout();
        case "datacenter": return target.getDatacenter();
        case "password": return target.getPassword();
        case "readtimeout":
        case "readTimeout": return target.getReadTimeout();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        case "url": return target.getUrl();
        case "username":
        case "userName": return target.getUserName();
        case "writetimeout":
        case "writeTimeout": return target.getWriteTimeout();
        default: return null;
        }
    }
}

