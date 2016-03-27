/**
 * 
 */
package com.x7700.smm.learn.orika;

import java.math.BigDecimal;
import java.util.Date;

import com.x7700.smm.learn.orika.domain.Address;
import com.x7700.smm.learn.orika.domain.ProductDomain;
import com.x7700.smm.learn.orika.domain.ProductDto;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.ClassMapBuilder;

/**
 * @author wangbing
 *
 */
public class MainGo {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        ProductDto productDto = new ProductDto();
        productDto.setStartDate(new Date());
        productDto.setBackCityCode(123);
        productDto.setPrice(new BigDecimal(78.55));
        Address address = new Address();
        address.setCode(10);
        address.setAddress("南京");
        productDto.setAddress(address);

        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        
//        ClassMapBuilder<ProductDto, ProductDomain> classMapBuilder = mapperFactory.classMap(ProductDto.class,
//                ProductDomain.class);
//        //classMapBuilder.field("address.code","orderId").byDefault().register();
//        
//        ClassMapBuilder<ProductDomain, ProductDto> classMapBuilder2 = mapperFactory.classMap(ProductDomain.class,
//                ProductDto.class);
        
        long start = System.currentTimeMillis();
        ProductDomain productDomain = mapperFactory.getMapperFacade().map(productDto, ProductDomain.class);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        printObj(productDto, productDomain);

        Thread.sleep(1000);
        productDto.setBackCityCode(456);
        productDto.getStartDate().setYear(2018);
        productDto.setPrice(new BigDecimal(80));
        productDto.getAddress().setCode(20);
        productDto.getAddress().setAddress("北京");

        System.out.println("-------------------------------------");
        printObj(productDto, productDomain);
        productDomain.setOrderId(500);
        start = System.currentTimeMillis();
        ProductDto productDto2 = mapperFactory.getMapperFacade().map(productDomain, ProductDto.class);
        end = System.currentTimeMillis();
        System.out.println(end - start);
        start = System.currentTimeMillis();
        productDto2 = mapperFactory.getMapperFacade().map(productDomain, ProductDto.class);
        end = System.currentTimeMillis();
        System.out.println(end - start);
        
        printObj(productDto2, productDomain);
    }

    private static void printObj(ProductDto productDto, ProductDomain productDomain) {
        System.out.println("dto:" + productDto.getBackCityCode());
        System.out.println("dto:" + productDto.getStartDate());
        System.out.println("dto:" + productDto.getPrice());
        System.out.println("dto:" + productDto.getAddress().getCode());
        System.out.println("dto:" + productDto.getAddress().getAddress());
        System.out.println("domain:" + productDomain.getBackCityCode());
        System.out.println("domain:" + productDomain.getStartDate());
        System.out.println("domain:" + productDomain.getPrice());
        System.out.println("domain:" + productDomain.getAddress().getCode());
        System.out.println("domain:" + productDomain.getAddress().getAddress());
    }

}
