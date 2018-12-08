package com.cg.atssp.dto;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="timesheet")
public class Client {
	
	@Id
	@Column(name="timesheet_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer tsId;
	
	@Column(name="emp_id")
	
//	@Pattern(regexp="[A-Z][0-9]\\s]",message="EmpId Should contain 3 uppercase alphabets and other 5 are digits")
	private String empId;
	
	@Column(name="timesheet_date")
	private Date tsDate;
	
	@Column(name="hour1")
	private String hour1;
	
	@Column(name="hour2")
	private String hour2;
	
	@Column(name="hour3")
	private String hour3;
	
	@Column(name="hour4")
	private String hour4;
	
	@Column(name="hour5")
	private String hour5;
	
	@Column(name="hour6")
	private String hour6;
	
	@Column(name="hour7")
	private String hour7;
	
	@Column(name="hour8")
	private String hour8;
	
	public Client() 
	{
		
	}

	public Client(Integer tsId, String empId, Date tsDate, String hour1,
			String hour2, String hour3, String hour4, String hour5,
			String hour6, String hour7, String hour8) {
		super();
		this.tsId = tsId;
		this.empId = empId;
		this.tsDate = tsDate;
		this.hour1 = hour1;
		this.hour2 = hour2;
		this.hour3 = hour3;
		this.hour4 = hour4;
		this.hour5 = hour5;
		this.hour6 = hour6;
		this.hour7 = hour7;
		this.hour8 = hour8;
	}
	
	public Integer getTsId() {
		return tsId;
	}

	public void setTsId(Integer tsId) {
		this.tsId = tsId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Date getTsDate() {
		return tsDate;
	}

	public void setTsDate() {
		tsDate =new Date();
		
	}

	public String getHour1() {
		return hour1;
	}

	public void setHour1(String hour1) {
		this.hour1 = hour1;
	}

	public String getHour2() {
		return hour2;
	}

	public void setHour2(String hour2) {
		this.hour2 = hour2;
	}

	public String getHour3() {
		return hour3;
	}

	public void setHour3(String hour3) {
		this.hour3 = hour3;
	}

	public String getHour4() {
		return hour4;
	}

	public void setHour4(String hour4) {
		this.hour4 = hour4;
	}

	public String getHour5() {
		return hour5;
	}

	public void setHour5(String hour5) {
		this.hour5 = hour5;
	}

	public String getHour6() {
		return hour6;
	}

	public void setHour6(String hour6) {
		this.hour6 = hour6;
	}

	public String getHour7() {
		return hour7;
	}

	public void setHour7(String hour7) {
		this.hour7 = hour7;
	}
	
	public void setHour8(String hour8) {
		this.hour8 = hour8;
	}
	public String getHour8() {
		return hour8;
	}
	
}
