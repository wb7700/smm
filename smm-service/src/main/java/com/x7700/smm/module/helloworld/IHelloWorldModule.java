package com.x7700.smm.module.helloworld;

import com.x7700.smm.common.domain.ResultInfo;
import com.x7700.smm.domain.helloworld.HelloWorld;

public interface IHelloWorldModule {

	ResultInfo sayHello(HelloWorld helloWorld);
}
