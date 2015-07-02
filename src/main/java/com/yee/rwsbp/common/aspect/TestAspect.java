package com.yee.rwsbp.common.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author: RogerYee
 */
public class TestAspect
{
    static final Logger logger = LoggerFactory.getLogger(TestAspect.class);

    private void onAuthentication()
    {
        logger.debug("TestAspect-->onAuthentication()");
    }

    public Object doAround(ProceedingJoinPoint pjp)
    {
        Object ret = null;
        try
        {

            logger.debug("TestAspect --> doAround() before");

            onAuthentication();

            ret = pjp.proceed();

            logger.debug("TestAspect --> doAround() after");

            return ret;
        }
        catch (Exception e)
        {
//            e.printStackTrace();
            logger.error(e.toString());
        }
        finally
        {
            return ret;
        }
    }
}
