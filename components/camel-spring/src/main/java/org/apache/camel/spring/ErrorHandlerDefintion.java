/**
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
package org.apache.camel.spring;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.camel.LoggingLevel;
import org.apache.camel.model.IdentifiedType;
import org.apache.camel.model.RedeliveryPolicyDefinition;
import org.apache.camel.model.config.PropertiesDefinition;

/**
 * The &lt;errorHandler&gt; tag element.
 *
 */
@XmlRootElement(name = "errorHandler")
@XmlAccessorType(XmlAccessType.FIELD)
public class ErrorHandlerDefintion extends IdentifiedType {
    @XmlAttribute(required = true)
    private ErrorHandlerType type;
    @XmlAttribute(required = false)
    private String deadLetterUri;
    @XmlAttribute(required = false)
    private LoggingLevel level;
    @XmlAttribute(required = false)
    private Boolean handled = true;
    @XmlAttribute(required = false)
    private Boolean useOriginalMessage;
    @XmlElement(name = "redeliveryPolicy", required = false)
    private RedeliveryPolicyDefinition redeliveryPolicy;
    @XmlElements({
        @XmlElement(name = "exceptionPolicyStrategy",  required = false),
        @XmlElement(name = "onRedelivery", required = false),
        @XmlElement(name = "failureProcessor", required = false),
        @XmlElement(name = "transactionTemplate", required = false),
        @XmlElement(name = "deadLetter", required = false)})
    private List beans; 

}
