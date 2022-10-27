package cn.changzer.database;

import cn.changzer.database.mybatis.handler.MyMetaObjectHandler;
import org.springframework.context.annotation.Bean;

/**
 * @author lingqu
 * @date 2022/10/27
 * @apiNote
 */
public class DatabaseAutoConfiguration {
    @Bean
    public MyMetaObjectHandler getMyMetaObjectHandler(){
        return new MyMetaObjectHandler();
    }
}
