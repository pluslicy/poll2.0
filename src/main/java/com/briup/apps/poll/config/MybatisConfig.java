package com.briup.apps.poll.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value= {"com.briup.apps.poll.dao","com.briup.apps.poll.dao.extend"})
public class MybatisConfig {

}
