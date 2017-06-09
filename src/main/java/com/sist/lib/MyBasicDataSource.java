package com.sist.lib;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.stereotype.Component;


/*
 *      <bean id="ds" class="org.apache.commons.dbcp.BasicDataSource"
		p:driverClassName="oracle.jdbc.driver.OracleDriver"
		p:url="jdbc:oracle:thin:@localhost:1521:ORCL"
		p:username="scott"
		p:password="tiger"
		p:maxActive="10"
		p:maxIdle="5"
		p:maxWait="-1"	
	/>	
 * */
@Component("ds")
public class MyBasicDataSource extends BasicDataSource{
	public MyBasicDataSource(){
		setDriverClassName("oracle.jdbc.driver.OracleDriver");
		setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
		setUsername("scott");
		setPassword("tiger");
		
	}
}
