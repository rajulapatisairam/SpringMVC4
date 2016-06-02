package com.testing.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.testing.model.AjaxResponseBody;
import com.testing.model.SearchCriteria;

@RestController
public class AjaxHandler {
	
	@RequestMapping(value = "/search/api/getSearchResult")
	public @ResponseBody AjaxResponseBody getSearchResultViaAjax2() {
		System.out.println(" in ajax Respons BOdyt");
		AjaxResponseBody result = new AjaxResponseBody();
		result.setCode(" Code " );
		result.setMsg("My Message ");
		List<Integer> numbers = new LinkedList<Integer>();
		for(int i = 1; i<=10; i++){
			numbers.add(i);
		}
		result.setResults(numbers);
		return result;
	}
	
	
	

}
