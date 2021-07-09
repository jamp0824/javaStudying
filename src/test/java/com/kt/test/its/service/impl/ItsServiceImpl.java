package com.kt.test.its.service.impl;

import java.sql.SQLException;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kt.test.its.dao.itsDAO;
import com.kt.test.its.service.ItsService;

@Service("itsService")
public class ItsServiceImpl implements ItsService{
	
	@Resource(name = "itsDAO")
	private ItsDAO itsDAO;

	@Override
	public int insertXmlToIts(Map<String, Object> map) throws SQLException {
		return  itsDAO.insertXmlToIts(map);
	}
	
	
}
