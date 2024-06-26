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
package org.apache.camel.spring.file;

import java.nio.file.Path;

import org.apache.camel.Endpoint;
import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.file.FileEndpoint;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.spring.SpringRunWithTestSupport;
import org.apache.camel.spring.file.SpringFileRouteTest.TestDirectoryContextInitializer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ContextConfiguration(initializers = TestDirectoryContextInitializer.class)
public class SpringFileRouteTest extends SpringRunWithTestSupport {
    protected String expectedBody = "Hello World!";
    @Autowired
    protected ProducerTemplate template;
    @Autowired
    protected Endpoint inputFile;
    @EndpointInject("mock:result")
    protected MockEndpoint result;
    @TempDir
    private static Path tempDir;

    @Test
    public void testMocksAreValid() throws Exception {
        // lets check that our injected endpoint is valid
        FileEndpoint fileEndpoint = assertIsInstanceOf(FileEndpoint.class, inputFile);
        assertEquals(testDirectory().toFile(), fileEndpoint.getFile(), "File");

        result.expectedBodiesReceived(expectedBody);
        result.setResultWaitTime(5000);

        template.sendBodyAndHeader(inputFile, expectedBody, Exchange.FILE_NAME, "hello.txt");

        result.assertIsSatisfied();
    }

    @Override
    public Path testDirectory() {
        return tempDir;
    }

    static class TestDirectoryContextInitializer
            implements
            ApplicationContextInitializer<ConfigurableApplicationContext> {
        @Override
        public void initialize(ConfigurableApplicationContext context) {
            context.getEnvironment().getSystemProperties().put("testDirectory", tempDir.toString());
        }
    }

}
