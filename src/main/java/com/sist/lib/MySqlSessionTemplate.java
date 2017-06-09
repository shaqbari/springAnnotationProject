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
	
	//@Resource(name="ssf") �����ڿ��� �����µ� ssf���� ���� �ִ�.	
	@Autowired
	//@Qualifier("ssf") �����ڿ��� �����µ� ssf���� ���� �ִ�.	
	public MySqlSessionTemplate(@Qualifier("ssf") SqlSessionFactory sqlSessionFactory) {
		super(sqlSessionFactory);
	}

}
