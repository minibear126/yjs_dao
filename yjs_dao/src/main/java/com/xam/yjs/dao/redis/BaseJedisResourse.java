package com.xam.yjs.dao.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
@Component
public class BaseJedisResourse {
	@Autowired
	@Qualifier("jedisPool")
	private JedisPool jedisPool;
	private ThreadLocal<Jedis> threadLocal = new ThreadLocal<Jedis>();
	public Jedis getJedis() {
		if(threadLocal.get()!=null){
			return threadLocal.get();
		}
		Jedis je= jedisPool.getResource();
		threadLocal.set(je);
		return je;
		

	}

	public void closeJedisTemp(Jedis jedis) {
		if(jedis!=null){
			jedisPool.returnResource(jedis);
		}

	}
	
	public void closeJedisByAOP(){
		Jedis je=threadLocal.get();
		if(je!=null){
			//System.out.println(11);
			jedisPool.returnResource(je);
		}
	}
}
