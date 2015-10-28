package com.xam.yjs.dao.resourceUtil;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import com.xam.yjs.dao.redis.BaseJedisResourse;


@Aspect
public class JedisRecovery {
	
	@Pointcut("execution(* com.xam.yjs.dao.redis.*.*(..))")
	private void pointCutMethod() {
	}
	@AfterThrowing("pointCutMethod()")
	public void doThrowing(JoinPoint point) {
		
		Object a =point.getTarget();
		if(a instanceof BaseJedisResourse){
			BaseJedisResourse b = (BaseJedisResourse)a;
			b.closeJedisByAOP();
			
		}
		
	}
	@After("pointCutMethod()")
	public void doAfter(JoinPoint point) {
		
		Object a =point.getTarget();
		if(a instanceof BaseJedisResourse){
			BaseJedisResourse b = (BaseJedisResourse)a;
			b.closeJedisByAOP();
			
		}
		
	}

	

}
