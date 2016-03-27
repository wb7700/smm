package com.x7700.smm.business.helloworld.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.x7700.smm.business.helloworld.IHelloWorldBusiness;
import com.x7700.smm.common.domain.ResultInfo;
import com.x7700.smm.domain.helloworld.HelloWorld;
import com.x7700.smm.module.helloworld.IHelloWorldModule;

@Service
public class HelloWorldBusinessImpl implements IHelloWorldBusiness {

	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldBusinessImpl.class);

	@Resource
	private IHelloWorldModule helloWorldModuleImpl;

	@Override
	public ResultInfo sayHello(HelloWorld helloWorld) {

		ResultInfo resultInfo = null;

		try {
			resultInfo = helloWorldModuleImpl.sayHello(helloWorld);
		} catch (Exception e) {
			LOGGER.error("say Hello error...", e);
		}

		return resultInfo;
	}
}
