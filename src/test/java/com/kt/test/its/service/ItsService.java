package com.kt.test.its.service;

import java.sql.SQLException;
import java.util.Map;

public interface ItsService {

	public int insertXmlToIts(Map<String, Object> map)throws SQLException;

}
