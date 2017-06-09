package com.sist.lib;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
/*
 * <bean id="ssf" class="org.mybatis.spring.SqlSessionFactoryBean"
		p:dataSource-ref="ds"
		p:configLocation="classpath:Config.xml"
	/>
 * */
@Component("ssf")
public class MySqlSessionFactoryBean extends SqlSessionFactoryBean{

	//ds�� �ڵ����� �����ߴ�.
	@Resource(name="ds")
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}
	
	public MySqlSessionFactoryBean() {
		try {
			//���� annotation�� ������ Ŭ�������� ��������Ƿ� �ٸ��ϳ��� ��Ű�� ��α��� ��� �Ѵ�.
			org.springframework.core.io.Resource res=new ClassPathResource("Config.xml");
			setConfigLocation(res);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
