package com.sist.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.sist.dao.EmpDAO;
import com.sist.dao.EmpVO;

import java.util.*;
@Component("mc")
public class MainClass {
	@Autowired
	private EmpDAO dao;
	
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
		MainClass mc = (MainClass) app.getBean("mc");
		
		List<EmpVO> list= mc.dao.empAllData();
		for (EmpVO vo : list) {
			System.out.println(vo.getEmpno()+" "
					+vo.getEname()+" "
					+vo.getJob()+" "
					+vo.getSal()+" "
					+vo.getHiredate().toString()+" "
					+vo.getSal());
			
		}
		
	}
}
