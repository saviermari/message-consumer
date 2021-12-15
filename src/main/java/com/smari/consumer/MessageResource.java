package com.smari.consumer;

import com.smari.consumer.config.ConsumerListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/messages")
public class MessageResource {
    @GET
    @Path("{message}")
    public String publishMessage(@PathParam("message") String message){
        return "Mesage Testing";
    }
}

