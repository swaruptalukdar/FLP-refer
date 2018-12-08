package com.capgemini.trg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



import com.capgemini.trg.exception.QueryException;
import com.capgemini.trg.model.Query;
import com.capgemini.trg.service.IQueryService;

@Controller
public class QueryController {

	@Autowired
	private IQueryService queryService;
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public  String showUserForm() {
		/*Query c=new Query();
		return new ModelAndView("home","query",c);*/
		return "home";
	}
	
	@RequestMapping(value="/answerthequery", method=RequestMethod.GET)
	public ModelAndView processForm(  @ModelAttribute("query") Integer query) throws QueryException{

			Query dh=queryService.getQueryAnswers(query);
			System.out.println("hello");
			return new ModelAndView("success","success",dh.getQueryId());
	}
				
		
				
				/*
				fetchQueryE(queryE,query);
				Integer n=queryService.updateQueryDetails(queryE.getQueryId());
				if(n>0){
				return new ModelAndView("success","success","Solution for Query Id :"+query.getQueryId()+"submitted successfully");
				}else{
					return new ModelAndView("success","success","Unable to get the query");
				}
			}
		} catch (Exception e) {		
			e.printStackTrace();
			return new ModelAndView("status","status",e.getMessage()); 
		}		*/
		
	



	
/*	private void fetchQueryE(com.capgemini.trg.model.Query queryE, Query query) {
		//queryE.setQueryId(query.getQueryId());
		if(query.getQueryId()==1){
			queryE.setTechnology("Core Java");
			queryE.setQuery("What is JVM?");
			queryE.setQueryRaisedBy("Nikhil");
		}
		else if(query.getQueryId()==2){
			queryE.setTechnology("Core Java");
			queryE.setQuery("What is Inheritence?");
			queryE.setQueryRaisedBy("Raveena");
		}
		else if(query.getQueryId()==3){
			queryE.setTechnology("Core Java");
			queryE.setQuery("What is Interface?");
			queryE.setQueryRaisedBy("Suraj");
		}
		else if(query.getQueryId()==4){
			queryE.setTechnology("Servlet");
			queryE.setQuery("What is Servlet Context?");
			queryE.setQueryRaisedBy("Suraj");
		}*/
	
}
