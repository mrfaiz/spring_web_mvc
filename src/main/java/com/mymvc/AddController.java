package com.mymvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mymvc.service.AddService;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int t1,@RequestParam("t2") int t2,HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("add");
		mv.addObject("result",new AddService().add(t1,t2));
		return mv;
	}
}
