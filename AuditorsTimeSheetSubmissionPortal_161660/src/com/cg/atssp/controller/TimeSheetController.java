package com.cg.atssp.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.atssp.dto.Client;
import com.cg.atssp.exception.TimeSheetException;
import com.cg.atssp.service.ITimeSheetService;

@Controller
public class TimeSheetController {

 @Autowired
 ITimeSheetService service;
 @RequestMapping(value="/home",method=RequestMethod.GET)
 public String home(){
	
		return "home";
		}
	
		@RequestMapping(value="timesheet")
		public ModelAndView timesheet(@ModelAttribute("add") Client timesheet, Map<String,Object> map){
			List<String> myList=new ArrayList<>();
			myList.add("--Select--");
			myList.add("DATA_ENTRY");
			myList.add("ACCOUNTS_TALLY");
			myList.add("LEDGER_POSTINGS");
			myList.add("BALANCE_SHEET");
			myList.add("RETURNS_FILING");
			map.put("data", myList);
			
		    DateTimeFormatter format = DateTimeFormatter.ofPattern("DD/MM/YYYY");
		       LocalDate Date = LocalDate.now();
				return new ModelAndView("timesheet", "date", Date);
		}
	
	
	
	@RequestMapping(value="success",method=RequestMethod.POST)
	public ModelAndView timesheetupload(@ModelAttribute("add") Client timesheet){ 
		
		ModelAndView mv=null;
		Integer id;
		try {
			timesheet.setTsDate();
			id = service.TimeSheetUpload(timesheet);
			mv= new ModelAndView("success", "success", id);
		} catch (TimeSheetException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		return mv;
		
		
	}
}

