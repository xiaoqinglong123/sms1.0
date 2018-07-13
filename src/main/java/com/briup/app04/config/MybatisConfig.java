package com.briup.app04.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.briup.app04.dao")
public class MybatisConfig {
	
}
