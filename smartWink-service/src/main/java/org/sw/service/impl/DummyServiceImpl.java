package org.sw.service.impl;

import org.springframework.stereotype.Component;
import org.sw.api.DummyService;

import io.swagger.annotations.Api;

@Component("dummyService")
@Api
public class DummyServiceImpl implements DummyService {

	@Override
	public String get() {
		return "HELLO GET";
	}

	@Override
	public String put() {
		return "HELLO PUT";
	}

	@Override
	public String post() {
		return "HELLO POST";
	}

	@Override
	public String delete() {
		return "HELLO DELETE";
	}

}
