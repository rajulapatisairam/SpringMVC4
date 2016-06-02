package com.testing.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

public class AjaxResponseBody {
	@JsonView
	String msg;
	@JsonView
	String code;
	@JsonView
	List<Integer> results;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<Integer> getResults() {
		return results;
	}
	public void setResults(List<Integer> results) {
		this.results = results;
	}
	
}
