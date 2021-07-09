package com.kt.test.its.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("itsDAO")
public class itsDAO extends OspisSqlSessionDaoSupport {
	
	String namespace = "com.kt.its.dao.ItsDAO";
	
	public int insertXmlToIts(Map<String,Object>map){
		
		return getSqlSession().update(namespace+"insertXmlToIts",map);
	}
}
