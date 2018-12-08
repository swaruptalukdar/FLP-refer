package com.cg.atssp.dao;
import com.cg.atssp.dto.Client;
import com.cg.atssp.exception.TimeSheetException;

public interface ITimeSheetDAO {
	
	public Integer timeshetupload(Client timesheet) throws TimeSheetException;

}
