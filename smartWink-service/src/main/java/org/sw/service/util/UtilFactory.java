package org.sw.service.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@Configuration
public class UtilFactory {
	@Bean(name="jaxbJsonProvider")
	public static JacksonJaxbJsonProvider getJacksonJaxbJsonProvider() {
		JacksonJaxbJsonProvider jacksonJaxbJsonProvider = new JacksonJaxbJsonProvider();
		jacksonJaxbJsonProvider.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		return jacksonJaxbJsonProvider;
	}

	@Bean(name="jsonProvider")
	public static JacksonJsonProvider getJacksonJsonProvider() {
		JacksonJsonProvider jacksonJsonProvider = new JacksonJsonProvider();
		jacksonJsonProvider.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		return jacksonJsonProvider;
	}

	@Bean(name="objectMapper")
	public static ObjectMapper getObjectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		return mapper;
	}
	
	
}
