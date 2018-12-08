package com.cg.atssp.service;

import com.cg.atssp.dto.Client;
import com.cg.atssp.exception.TimeSheetException;

public interface ITimeSheetService  {
	
	public Integer TimeSheetUpload(Client timesheet) throws TimeSheetException;
}
