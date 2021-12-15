Install Kafka using Homebrew

1. Start Zoo keepe
	zookeeper-server-start /opt/homebrew/etc/kafka/zookeeper.properties

2. Start Kakka
	kafka-server-start /opt/homebrew/etc/kafka/server.properties

3. Create topic
	kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic test

4. Publish message
	kafka-console-producer --topic test --bootstrap-server localhost:9092

5. Consume message
	kafka-console-consumer --topic test --from-beginning --bootstrap-server localhost:9092


Spring Boot application for publishing and Consuming message.

Create two Spring Boot Project with Spring Starter web and spring starter kafka dependency
