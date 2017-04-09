package com.test.mysys.message.controller;





import java.text.ParseException;

import java.util.Map;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



import com.test.mysys.common.utils.NewPager;

import com.test.mysys.common.utils.SearchFilter;
import com.test.mysys.common.utils.web.Servlets;

import com.test.mysys.message.service.MessageService;


@Controller
@RequestMapping(value="/message")
public class MessageController {
	@Autowired
	private MessageService service;

	
	@RequestMapping("/ajax_list")
	@ResponseBody
	public Map msg_list(HttpServletRequest request,
			@RequestParam(value="page",defaultValue="1")int page,
			@RequestParam(value="pagesize",defaultValue="10")int pageSize) throws ParseException{
		Map<String,Object> searchParams = Servlets.getParametersStartingWith(request, "search_");
		Map<String,SearchFilter> filters = SearchFilter.parse(searchParams);
		
		NewPager pager = new NewPager();
		pager.setOrder(NewPager.DESC);
	/*	pager.setOrderBy("");*/
		pager.setPageNumber(page);
		pager.setPageSize(pageSize);
		pager.setFilters(filters);
		
		return service.queryMsg(pager);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(HttpServletRequest request,
			@RequestParam(value="id",defaultValue="0") String id){
		service.delete(id);
		return "ok";	
	}
	
}