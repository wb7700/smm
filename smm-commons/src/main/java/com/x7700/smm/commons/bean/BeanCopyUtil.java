/**
 * 
 */
package com.x7700.smm.commons.bean;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.x7700.smm.commons.constant.CommonExceptionCode;
import com.x7700.smm.commons.exception.BeanCopyException;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * @author wangbing
 *
 */
public class BeanCopyUtil {

    public static final MapperFactory MAPPER_FACTORY = new DefaultMapperFactory.Builder().build();

    private static final Logger LOGGER = LoggerFactory.getLogger(BeanCopyUtil.class);

    public static <S, D> D copy(S sourceObject, Class<D> destinationClass) throws BeanCopyException {
        try {
            MAPPER_FACTORY.classMap(sourceObject.getClass(), destinationClass).byDefault().register();
            return MAPPER_FACTORY.getMapperFacade().map(sourceObject, destinationClass);
        } catch (Exception e) {
            LOGGER.error("Copy Bean error...", e);
            throw new BeanCopyException(CommonExceptionCode.REFLECTION_EXCEPTION.getErrorCode(),
                    CommonExceptionCode.REFLECTION_EXCEPTION.getErrorMsg(), e);
        }
    }

    public static <S, D> List<D> copyList(List<S> sourceObjectIterator, Class<S> sourceClass, Class<D> destinationClass)
            throws BeanCopyException {
        try {
            MAPPER_FACTORY.classMap(sourceClass, destinationClass).byDefault().register();
            return MAPPER_FACTORY.getMapperFacade().mapAsList(sourceObjectIterator, destinationClass);
        } catch (Exception e) {
            LOGGER.error("Copy Bean error...", e);
            throw new BeanCopyException(CommonExceptionCode.REFLECTION_EXCEPTION.getErrorCode(),
                    CommonExceptionCode.REFLECTION_EXCEPTION.getErrorMsg(), e);
        }
    }
}
