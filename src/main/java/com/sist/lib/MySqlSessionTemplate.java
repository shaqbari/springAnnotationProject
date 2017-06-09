package com.sist.lib;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/*
 * <bean id="sst" class="org.mybatis.spring.SqlSessionTemplate">
		<constructor-arg ref="ssf"/>
	</bean>
 * */
@Component("sst")
public class MySqlSessionTemplate extends SqlSessionTemplate{
	
	//@Resource(name="ssf") 생성자에서 못쓰는데 ssf에서 쓰고 있다.	
	@Autowired
	//@Qualifier("ssf") 생성자에서 못쓰는데 ssf에서 쓰고 있다.	
	public MySqlSessionTemplate(@Qualifier("ssf") SqlSessionFactory sqlSessionFactory) {
		super(sqlSessionFactory);
	}

}
