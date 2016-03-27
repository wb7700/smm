package com.x7700.smm.controller.privative.helloworld;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.x7700.smm.business.helloworld.IHelloWorldBusiness;
import com.x7700.smm.common.domain.ResultInfo;
import com.x7700.smm.commons.domain.ResponseDto;
import com.x7700.smm.domain.helloworld.HelloWorld;

@Controller
@RequestMapping(value = "/privative/helloworld")
public class HelloWorldController {

	@Resource
	private IHelloWorldBusiness helloWorldBusinessImpl;

	@RequestMapping(value = "helloworld")
	@ResponseBody
	public ResponseDto helloworld(@RequestBody HelloWorld helloworld) throws Exception {

		ResponseDto response = new ResponseDto();

		ResultInfo resultInfo = helloWorldBusinessImpl.sayHello(helloworld);

		response.setData(resultInfo);

		return response;
	}
}
