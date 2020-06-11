package com.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Copyright 2020 by kimtg ALL right reserved.

 * <pre>
 * @author kimtg
 * @date 2020. 6. 11. 오전 10:41:49
 * @description
 * </pre>
 */
@Controller
public class SimpleController {

	@RequestMapping("/test")
	public ModelAndView test() throws Exception{
		ModelAndView mav = new ModelAndView("test");
		mav.addObject("name", "태건아 안녕?");
		List<String> testList = new ArrayList<String>();
		testList.add("a");
		testList.add("b");
		testList.add("c");
		mav.addObject("list", testList);
		return mav;
	}




}
