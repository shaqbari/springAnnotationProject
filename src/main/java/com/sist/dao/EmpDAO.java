package com.sist.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/*	�޸��Ҵ��ϴ� annotation
 * @Component  ==> �Ϲ� Ŭ����
 * @Repository  ==> DAO
 * @Controller ==> Model
 * @Service ==>BusinessObject(DAO+DAO)  //DAO�� ��� ����.
 * 
 * */
import java.util.*;

@Repository("dao")
public class EmpDAO extends SqlSessionDaoSupport{
	
	@Resource(name="sst")
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}//Templete���� db������ sql������ �ѹ��� ���� ���� �ְ� ���⼭ ���� �ΰ��� ���� ���� �ִ�.
	//SqlSessionȰ�밡��
	
	public List<EmpVO> empAllData() {
		return getSqlSession().selectList("empAllData");
	}
	
}
