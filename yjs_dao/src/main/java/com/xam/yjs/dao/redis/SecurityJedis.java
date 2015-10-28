package com.xam.yjs.dao.redis;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;

import com.xam.yjs.dao.model.UserAccountDo;

/** 
 * @author 车林彬 
 * @date 创建时间：2015年5月22日 上午9:16:11
 * @email minibear126@163.com
 * @description 描述
 */
@Component
public class SecurityJedis extends BaseJedisResourse{
	public String objectKey="shuangjin:securityjedis";
	public UserAccountDo getUserAccountById(String userName) {
		String key=objectKey+"hash"+userName;
		Jedis jedis=super.getJedis();
		UserAccountDo us=new UserAccountDo();
		if(jedis.exists(key)){
			us.setId(Integer.parseInt(jedis.hget(key, "id")));
			us.setPassword(jedis.hget(key, "password"));
			us.setStatus(Integer.parseInt(jedis.hget(key, "status")));
			us.setEnabled(Integer.parseInt(jedis.hget(key, "enabled")));
			us.setUsername(jedis.hget(key, "username"));
			return us;
		}
		return null;
		
	}
	
	public void delUserAccountById(String userName) {
		String key=objectKey+"hash"+userName;
		Jedis jedis=super.getJedis();
		jedis.del(key);
		
	}
	
	
	public void updateUserAccount(UserAccountDo user) {
		String key=objectKey+"hash"+user.getUsername();
		Jedis jedis=super.getJedis();
		jedis.del(key);
		jedis.hset(key, "id", String.valueOf(user.getId()));
		jedis.hset(key, "username", user.getUsername());
		jedis.hset(key, "password", user.getPassword());
		jedis.hset(key, "status", String.valueOf(user.getStatus()));
		jedis.hset(key, "enabled", String.valueOf(user.getEnabled()));
		jedis.expire(key, 60*60*24*2);
		
		
	}
	
	public void insertRedisSecurity(String id, String username,
			String password, String authoritiesString) {
		String key=objectKey+"session:Security:hash"+id;
		Jedis jedis=super.getJedis();
		jedis.hset(key, "username", username);
		jedis.hset(key, "password", password);
		jedis.hset(key, "authoritiesString",authoritiesString);
		jedis.expire(key, 60*60*2);
	}
	public Map<String, String> getRedisSecurity(String id) {
		String key=objectKey+"session:Security:hash"+id;
		Jedis jedis=super.getJedis();
		Map<String, String> map=new HashMap<String, String>();
		if(jedis.hexists(key, "username")){
			map.put("username", jedis.hget(key, "username"));
			map.put("password", jedis.hget(key, "password"));
			map.put("authoritiesString", jedis.hget(key, "authoritiesString"));
		}
		return map;
	}
}
