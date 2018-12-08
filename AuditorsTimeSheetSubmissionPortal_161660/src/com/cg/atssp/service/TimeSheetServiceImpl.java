package com.cg.atssp.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.atssp.dao.ITimeSheetDAO;
import com.cg.atssp.dto.Client;
import com.cg.atssp.exception.TimeSheetException;
@Service("service")
@Transactional
public class TimeSheetServiceImpl implements ITimeSheetService {

	@Autowired
	ITimeSheetDAO dao;
	
	@Override
	public Integer TimeSheetUpload(Client ts) throws TimeSheetException {
		
		Integer id=dao.timeshetupload(ts);
		
		
		if(id != null)
		{
			return id;
		}
		else
		{
			throw new TimeSheetException("no id");
		}
		
		
		
	}

}
