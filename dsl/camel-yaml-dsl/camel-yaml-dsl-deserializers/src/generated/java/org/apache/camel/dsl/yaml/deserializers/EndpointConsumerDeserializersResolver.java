// Generated by camel-yaml-dsl-maven-plugin - do NOT edit this file!
package org.apache.camel.dsl.yaml.deserializers;

import java.lang.Override;
import java.lang.String;
import org.apache.camel.dsl.yaml.common.YamlDeserializerResolver;
import org.snakeyaml.engine.v2.api.ConstructNode;
import org.snakeyaml.engine.v2.nodes.Node;

public final class EndpointConsumerDeserializersResolver implements YamlDeserializerResolver {
    @Override
    public int getOrder() {
        return YamlDeserializerResolver.ORDER_LOWEST;
    }

    public static String resolveEndpointUri(String id, Node node) {
        switch(id) {
            case "activemq":
            case "ahc-ws":
            case "ahc-wss":
            case "amqp":
            case "as2":
            case "asterisk":
            case "atmos":
            case "atmosphere-websocket":
            case "atom":
            case "atomix-map":
            case "atomix-messaging":
            case "atomix-queue":
            case "atomix-set":
            case "atomix-value":
            case "avro":
            case "aws2-ddbstream":
            case "aws2-kinesis":
            case "aws2-s3":
            case "aws2-sqs":
            case "azure-cosmosdb":
            case "azure-eventhubs":
            case "azure-servicebus":
            case "azure-storage-blob":
            case "azure-storage-datalake":
            case "azure-storage-queue":
            case "beanstalk":
            case "box":
            case "browse":
            case "cmis":
            case "coap":
            case "coap+tcp":
            case "coaps":
            case "coaps+tcp":
            case "cometd":
            case "cometds":
            case "consul":
            case "corda":
            case "couchbase":
            case "couchdb":
            case "cql":
            case "cron":
            case "cxf":
            case "cxfrs":
            case "dataset":
            case "debezium-mongodb":
            case "debezium-mysql":
            case "debezium-postgres":
            case "debezium-sqlserver":
            case "direct":
            case "direct-vm":
            case "disruptor":
            case "disruptor-vm":
            case "docker":
            case "dropbox":
            case "ehcache":
            case "elsql":
            case "etcd-stats":
            case "etcd-watch":
            case "facebook":
            case "fhir":
            case "file":
            case "file-watch":
            case "flatpack":
            case "ftp":
            case "ftps":
            case "git":
            case "github":
            case "google-calendar":
            case "google-calendar-stream":
            case "google-drive":
            case "google-mail":
            case "google-mail-stream":
            case "google-pubsub":
            case "google-sheets":
            case "google-sheets-stream":
            case "google-storage":
            case "gora":
            case "grpc":
            case "guava-eventbus":
            case "hazelcast-instance":
            case "hazelcast-list":
            case "hazelcast-map":
            case "hazelcast-multimap":
            case "hazelcast-queue":
            case "hazelcast-replicatedmap":
            case "hazelcast-seda":
            case "hazelcast-set":
            case "hazelcast-topic":
            case "hbase":
            case "hdfs":
            case "hwcloud-obs":
            case "iec60870-client":
            case "iec60870-server":
            case "ignite-cache":
            case "ignite-events":
            case "ignite-messaging":
            case "imap":
            case "imaps":
            case "infinispan":
            case "infinispan-embedded":
            case "irc":
            case "ironmq":
            case "jbpm":
            case "jcache":
            case "jclouds":
            case "jcr":
            case "jetty":
            case "jgroups":
            case "jgroups-raft":
            case "jira":
            case "jms":
            case "jmx":
            case "jooq":
            case "jpa":
            case "jt400":
            case "kafka":
            case "kamelet":
            case "kubernetes-custom-resources":
            case "kubernetes-deployments":
            case "kubernetes-hpa":
            case "kubernetes-job":
            case "kubernetes-namespaces":
            case "kubernetes-nodes":
            case "kubernetes-pods":
            case "kubernetes-replication-controllers":
            case "kubernetes-services":
            case "lumberjack":
            case "master":
            case "milo-client":
            case "milo-server":
            case "mina":
            case "minio":
            case "mllp":
            case "mongodb":
            case "mongodb-gridfs":
            case "mybatis":
            case "nats":
            case "netty":
            case "netty-http":
            case "nitrite":
            case "nsq":
            case "oaipmh":
            case "olingo2":
            case "olingo4":
            case "optaplanner":
            case "paho":
            case "paho-mqtt5":
            case "pg-replication-slot":
            case "pgevent":
            case "platform-http":
            case "pop3":
            case "pop3s":
            case "pubnub":
            case "pulsar":
            case "quartz":
            case "quickfix":
            case "rabbitmq":
            case "reactive-streams":
            case "ref":
            case "rest":
            case "rest-api":
            case "resteasy":
            case "robotframework":
            case "rss":
            case "salesforce":
            case "scheduler":
            case "seda":
            case "service":
            case "servlet":
            case "sftp":
            case "sip":
            case "sips":
            case "sjms":
            case "sjms2":
            case "slack":
            case "smpp":
            case "smpps":
            case "smtp":
            case "smtps":
            case "snmp":
            case "soroush":
            case "splunk":
            case "spring-event":
            case "spring-integration":
            case "spring-rabbitmq":
            case "spring-redis":
            case "spring-ws":
            case "sql":
            case "ssh":
            case "stomp":
            case "stream":
            case "stub":
            case "telegram":
            case "thrift":
            case "timer":
            case "twilio":
            case "twitter-directmessage":
            case "twitter-search":
            case "twitter-timeline":
            case "undertow":
            case "vertx":
            case "vertx-kafka":
            case "vertx-websocket":
            case "vm":
            case "weather":
            case "web3j":
            case "webhook":
            case "websocket":
            case "websocket-jsr356":
            case "wordpress":
            case "xmpp":
            case "xquery":
            case "yammer":
            case "zendesk":
            case "zookeeper":
            case "zookeeper-master":
            return org.apache.camel.dsl.yaml.common.YamlSupport.creteEndpointUri(id, node);
        }
        return null;
    }

    @Override
    public ConstructNode resolve(String id) {
        return node -> org.apache.camel.dsl.yaml.common.YamlSupport.creteEndpoint(id, node, org.apache.camel.model.FromDefinition::new);
    }
}
