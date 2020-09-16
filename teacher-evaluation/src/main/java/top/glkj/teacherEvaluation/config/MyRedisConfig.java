/*
 * @author ：高铭
 * @date ：Created in 2020/9/14 9:38
 * @description： 自定义redis配置
 * @modified By：
 * @version: $
 */
package top.glkj.teacherEvaluation.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import top.glkj.teacherEvaluation.bean.User;

import java.lang.reflect.Method;
import java.net.UnknownHostException;
import java.util.Arrays;

@Configuration
public class MyRedisConfig {
    @Bean
    public RedisTemplate<Object, User> userRedisTemplate(RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
        RedisTemplate<Object, User> template = new RedisTemplate();
        template.setConnectionFactory(redisConnectionFactory);
        /*
         * 序列化规则
         */
        Jackson2JsonRedisSerializer<User> serializer =  new Jackson2JsonRedisSerializer<>(User.class);
        template.setDefaultSerializer(serializer);
        return template;
    }

    /**
     * key不为空
     * @return
     */
    @Bean
    public KeyGenerator keyGenerator() {
        return new KeyGenerator() {
            @Override
            public Object generate(Object target, Method method, Object... objects) {
                StringBuilder sb = new StringBuilder();
                sb.append(target.getClass().getName()).append(".").append(method.getName()).append(Arrays.toString(objects));
                return sb.toString();
            }
        };
    }

}
