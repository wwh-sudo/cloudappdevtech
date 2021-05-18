package com.example.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.SimpleCounter;


@Controller
public class BaseController {
	private static SimpleCounter sc = new SimpleCounter();

	private static final String VIEW_INDEX = "index";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);

	private static synchronized long getNextCounterValue() {
		sc.increase();
		return sc.getValue();
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		long counterValue = BaseController.getNextCounterValue();

		model.addAttribute("message", "Welcome");
		model.addAttribute("counter", counterValue);
		logger.debug("[welcome] counter : {}", counterValue);

		// Spring uses InternalResourceViewResolver and return back index.jsp
		return VIEW_INDEX;
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {
		long counterValue = BaseController.getNextCounterValue();

		model.addAttribute("message", "Welcome " + name);
		model.addAttribute("counter", counterValue);
		logger.debug("[welcomeName] counter : {}", counterValue);

		// Spring uses InternalResourceViewResolver and return back index.jsp
		return VIEW_INDEX;
	}
}
