package cn.gzsxt.jedis;

import java.util.List;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class TestJedis {

	public static Jedis jedis = new Jedis("192.168.124.129");
	public static void main(String[] args) {
		
		System.out.println(jedis.ping());
	}
	
	
	@Test
	public void test(){
//		jedis.set("ss", "sss");
//		System.out.println(jedis.get("ss"));
		
//		jedis.mset("s1","1","s2","2","s3","3");
//		List<String> mget = jedis.mget("s1","s2","s3");
//		System.out.println(mget);
		
/*	//	jedis.set("a", "1");
		System.out.println("incr操作前："+jedis.get("a"));
//		Long incr = jedis.incr("a");
		Long incr = jedis.decr("a");
		System.out.println(incr);*/
		
//		jedis.lpush("list1", "1","2","3","4","5","6");
		Long llen = jedis.llen("list1");
		System.out.println(llen);
		List<String> lrange = jedis.lrange("list1", 0, 18);
		System.out.println(lrange);
		
	}
}
