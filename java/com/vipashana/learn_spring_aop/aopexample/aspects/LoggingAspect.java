package com.vipashana.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

//Syntax for pointcut before business class: execution(* PACKAGE.*.*(..))
	@Before("execution(* com.vipashana.learn_spring_aop.aopexample.data.*.*(..))") //WHEN  
	// JoinPoint used to get details
	public void logMethodCallBefore(JoinPoint joinPoint) {
		logger.info("Before Aspect - Method is called - {}",joinPoint); //WHAT LOGIC
	}
	
	
	@After("execution(* com.vipashana.learn_spring_aop.aopexample.*.*.*(..))")
	// JoinPoint used to get details
	public void logMethodCallAfter(JoinPoint joinPoint) {
		logger.info("After Aspect - {} has executed",joinPoint);
	}
	
	@AfterThrowing(
	pointcut="execution(* com.vipashana.learn_spring_aop.aopexample.*.*.*(..))",
	throwing="exception" 
			)
	public void logMethodCallAfterException(JoinPoint joinPoint,Exception exception) {
		logger.info("AfterThrowing Aspect - {} has thrown exception {}",joinPoint,exception);
	}
	
	@AfterReturning(
	pointcut="execution(* com.vipashana.learn_spring_aop.aopexample.*.*.*(..))",
	returning="result" 
			)
	public void logMethodCallAfterSuccessfulExecution(JoinPoint joinPoint,
			Object resultValue) {
		logger.info("AfterReturning Aspect - {} has returned {}",joinPoint, resultValue);
	}
	
}




