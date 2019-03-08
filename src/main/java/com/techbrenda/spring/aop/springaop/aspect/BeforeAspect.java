package com.techbrenda.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//execution(* PACKAGE.*.*(..))
	
	@Before("execution(* com.techbrenda.spring.aop.springaop.business.*.*(..))")
	public void before() {
		logger.info("Intercepted Method Calls {}");
	}
}
