package com.cg.atssp.dao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.atssp.dto.Client;
import com.cg.atssp.exception.TimeSheetException;


@Repository
@Transactional
public class TimeSheetDAOImpl implements ITimeSheetDAO {

	

	@PersistenceContext
	EntityManager entitymanager;
	
	@Override
	public Integer timeshetupload(Client timesheet) throws TimeSheetException {
		entitymanager.persist(timesheet);
		
		if(timesheet.getTsId() != null)
		{
			return timesheet.getTsId();
		}
		else
		{
			throw new TimeSheetException("no id");
		}
		
	}

}
