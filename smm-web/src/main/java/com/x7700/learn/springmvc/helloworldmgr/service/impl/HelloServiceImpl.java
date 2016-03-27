/**
 * 
 */
package com.x7700.learn.springmvc.helloworldmgr.service.impl;

import org.springframework.stereotype.Service;

import com.x7700.learn.springmvc.helloworldmgr.service.IHelloService;

/**
 * @author wangbing
 *
 */
@Service
public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHello() {
        return "HelloServiceImpl";
    }

}
