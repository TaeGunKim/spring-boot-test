package com.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright 2020 by kimtg ALL right reserved.

 * <pre>
 * @author kimtg
 * @date 2020. 6. 11. 오전 10:22:25
 * @description
 * </pre>
 */
@RestController
public class SimpleWebController {

	@RequestMapping("/")
	public String greetings() {
		return "<h1>HELLO WORLD~</h1>";
	}

}
