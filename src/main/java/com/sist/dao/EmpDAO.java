package com.sist.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/*	메모리할당하는 annotation
 * @Component  ==> 일반 클래스
 * @Repository  ==> DAO
 * @Controller ==> Model
 * @Service ==>BusinessObject(DAO+DAO)  //DAO를 묶어서 쓴다.
 * 
 * */
import java.util.*;

@Repository("dao")
public class EmpDAO extends SqlSessionDaoSupport{
	
	@Resource(name="sst")
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}//Templete으로 db정보와 sql정보를 한번에 받을 수도 있고 여기서 따로 두개를 받을 수도 있다.
	//SqlSession활용가능
	
	public List<EmpVO> empAllData() {
		return getSqlSession().selectList("empAllData");
	}
	
}
