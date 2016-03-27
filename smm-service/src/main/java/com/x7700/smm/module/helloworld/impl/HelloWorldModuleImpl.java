package com.x7700.smm.module.helloworld.impl;

import org.springframework.stereotype.Component;

import com.x7700.smm.common.domain.ResultInfo;
import com.x7700.smm.domain.helloworld.HelloWorld;
import com.x7700.smm.module.helloworld.IHelloWorldModule;

@Component
public class HelloWorldModuleImpl implements IHelloWorldModule {

	@Override
	public ResultInfo sayHello(HelloWorld helloWorld) {

		String word = helloWorld.getName() + "你好！";

		ResultInfo resultInfo = new ResultInfo();

		resultInfo.setResultStr(word);

		return resultInfo;
	}

}
