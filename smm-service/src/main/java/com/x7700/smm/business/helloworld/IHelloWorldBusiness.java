package com.x7700.smm.business.helloworld;

import com.x7700.smm.common.domain.ResultInfo;
import com.x7700.smm.domain.helloworld.HelloWorld;

public interface IHelloWorldBusiness {

	ResultInfo sayHello(HelloWorld helloWorld);
}
