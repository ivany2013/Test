package com.xl.demo;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class Test{
	private final KafkaProducer<Integer, String> producer;

	private final Properties props = new Properties();

	private final String topic;

	// Broker地址列表
	private final String bootstrapServers = "bootstrap.servers";

	// 客户端ID
	private final String clientId = "client.id";

	// Key序列化类
	private final String keySerializer = "key.serializer";

	// Value序列化类
	private final String valueSerializer = "value.serializer";

	// 协议类型:当前支持配置为SASL_PLAINTEXT或者PLAINTEXT
	private final String securityProtocol = "security.protocol";

	// 服务名
	private final String saslKerberosServiceName = "sasl.kerberos.service.name";

	// 域名
	private final String kerberosDomainName = "kerberos.domain.name";

	// 默认发送20条消息
	// private final int messageNumToSend = 100;

	/**
	 * 新Producer 构造函数
	 *
	 * @param topicName
	 *            Topic名称
	 *            是否异步模式发送
	 */
	public Test(String topicName) {
		// Broker地址列表
		props.put(bootstrapServers, "192.168.11.90:9092");
		// 客户端ID
		props.put(clientId, "DemoProducer");
		// Key序列化类
		props.put(keySerializer, "org.apache.kafka.common.serialization.IntegerSerializer");
		// Value序列化类
		props.put(valueSerializer, "org.apache.kafka.common.serialization.StringSerializer");

		producer = new KafkaProducer<Integer, String>(props);
		topic = topicName;
		send();
	}

	public void send(){
		Integer num = 1;
		while (true) {
			System.out.println("producer is alive");
			String messageStr = "{\n" +
					"\t\"id\": \"69894ac944b743ed932fdf8c1693cb3b\",\n" +
					"\t\"time\": 1553061789000,\n" +
					"\t\"pointId\": \"abc123456\",\n" +
					"\t\"captureTime\":"+System.currentTimeMillis()+",\n" +
					"\t\"faceUrl\": \"http://192.168.11.164//ifsrc/engine1/eng1store1_0/ImgWareHouse/src_0_88212/20190321/20190321T181613_16_88212.jpg\",\n" +
					"\t\"picUrl\": \"http://192.168.11.164//ifsrc/engine1/eng1store1_0/ImgWareHouse/src_0_88212/20190321/20190321T181613_16_88212.jpg\"\n" +
					"}";
			ProducerRecord<Integer, String> record = new ProducerRecord<Integer, String>(
					topic, num, messageStr);

			try {
				// 同步发送
				RecordMetadata recordMetadata = producer.send(record).get();
				if (recordMetadata!=null){
					System.out.println(recordMetadata.offset());
				}
				Thread.sleep(10000L);
			} catch (Exception ie) {
				ie.printStackTrace();
			}
		}
	}

}
