
package com.univ.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.api.OllamaChatOptions;
import org.springframework.ai.ollama.api.OllamaModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
    private ChatClient chatclient;

    @Bean
    public ChatClient chatClientConfig(ChatClient.Builder builder) {

        chatclient = builder
        		.defaultOptions(
                    OllamaChatOptions.builder()
                        .model(OllamaModel.LLAMA3_2)
                        .maxTokens(1000)
                        .temperature(0.3)
                        )
                .build();
        return chatclient;
    }
}
