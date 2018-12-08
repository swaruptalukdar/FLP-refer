package com.capgemini.trg.model;

import javax.persistence.Column;
import javax.validation.constraints.Size;

public class Query {
	
	@Column(name="query_id")
	private Integer queryId;	
	@Size(min=3,max=30, message="Technology Name should be min 3 and max 30 characters")
	@Column(nullable=false)
	private String technology;
	@Column(nullable=false,name="query_raised_by")
	@Size(min=3,max=20, message="Name should be min 3 and max 20 characters")
	private String queryRaisedBy;
	//@Column(name="email_id")
	//@Pattern(regexp="[A-Za-z0-9]+@[A-Za-z0-9.-]+[.][A-Za-z]{2,4}", message="Invalid Email Address")
	//or @Email
	@Column(nullable=false)
	@Size(min=3,max=1000, message="Query should be min 3 amd max 1000 characters")
	private String query;
	@Size(min=3,max=1000, message="Solution should be min 3 amd max 1000 characters")
	private String solutions;
	@Size(min=3,max=20, message="Name should be min 3 amd max 20 characters")
	@Column(name="solutions_given_by")
	private String solutionsGivenBy;
	
	public Query(){}

	public Query(Integer queryId, String technology, String queryRaisedBy,
			String query, String solutions, String solutionsGivenBy) {
		super();
		this.queryId = queryId;
		this.technology = technology;
		this.queryRaisedBy = queryRaisedBy;
		this.query = query;
		this.solutions = solutions;
		this.solutionsGivenBy = solutionsGivenBy;
	}

	public Integer getQueryId() {
		return queryId;
	}

	public void setQueryId(Integer queryId) {
		this.queryId = queryId;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getQueryRaisedBy() {
		return queryRaisedBy;
	}

	public void setQueryRaisedBy(String queryRaisedBy) {
		this.queryRaisedBy = queryRaisedBy;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getSolutions() {
		return solutions;
	}

	public void setSolutions(String solutions) {
		this.solutions = solutions;
	}

	public String getSolutionsGivenBy() {
		return solutionsGivenBy;
	}

	public void setSolutionsGivenBy(String solutionsGivenBy) {
		this.solutionsGivenBy = solutionsGivenBy;
	}
	
	

}
