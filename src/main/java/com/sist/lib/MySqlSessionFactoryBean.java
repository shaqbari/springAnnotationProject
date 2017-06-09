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

	//ds를 자동으로 주입했다.
	@Resource(name="ds")
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}
	
	public MySqlSessionFactoryBean() {
		try {
			//위의 annotation과 동일한 클래스명을 사용했으므로 다른하나는 패키지 경로까지 줘야 한다.
			org.springframework.core.io.Resource res=new ClassPathResource("Config.xml");
			setConfigLocation(res);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
