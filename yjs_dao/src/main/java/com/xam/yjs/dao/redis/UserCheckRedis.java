package com.xam.yjs.dao.redis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;

/** 
 * @author 车林彬 
 * @date 创建时间：2015年10月27日 下午2:41:13
 * @email minibear126@163.com
 * @description 描述
 */
@Component
public class UserCheckRedis extends BaseJedisResourse{
	private String usernameFrequency="yjs:usernameFrequency:string";
	private String userInfo="yjs:userInfo:hash";
	
	public long getFrequencyOfUserLogin(String username) {
		StringBuffer sb=new StringBuffer(usernameFrequency);
		sb.append(username);
		Jedis jedis=super.getJedis();
		long num=jedis.incr(sb.toString());
		jedis.expire(sb.toString(), 60);
		return num;
	}
	public String getUserAccountIdByToken(String token) {
		Jedis jedis=super.getJedis();
		if(jedis.exists(token)){
			jedis.expire(token, 60*60*12);
			return jedis.get(token);
		}else{
			return null;
		}
		
		
	}
	public void getNewToken(String newToken,String accountId) {
		Jedis jedis=super.getJedis();
		jedis.set(newToken, accountId);
		//账户登录信息存储12小时
		jedis.expire(newToken, 60*60*12);
		
	}
	public void setUserInfoInRedis(Map<String, Object> map, int userAccountId) {
		Jedis jedis=super.getJedis();
		StringBuffer sb=new StringBuffer(userInfo);
		sb.append(userAccountId);
		String key=sb.toString();
		Iterator<Entry<String, Object>> it=map.entrySet().iterator();
		while(it.hasNext()){
			Entry<String, Object> en=it.next();
			jedis.hset(key, en.getKey(), String.valueOf(en.getValue()));
		}
		//用户信息存储30天
		jedis.expire(key, 60*60*24*30);
	}
	public Map<String, String> findUserInfoInRedisByUserAccountId(
			int userAccountId) {
		Jedis jedis=super.getJedis();
		StringBuffer sb=new StringBuffer(userInfo);
		sb.append(userAccountId);
		String key=sb.toString();
		Map<String, String> map=jedis.hgetAll(key);
		
		
		return map;
	}

}
