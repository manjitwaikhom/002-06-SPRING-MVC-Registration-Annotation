package com.spring.mvc;

import java.util.Map;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes
public class RegisterController {

	@Autowired(required = true)
	private StudentValidator studentValidator;

	@RequestMapping(value = "/registerStudent", method = RequestMethod.POST)
	public String registerStudent(@ModelAttribute("student") Student stu,
			BindingResult result) throws ServletException {
		System.out.println("Register Student");
		studentValidator.validate(stu, result);
		if (result.hasErrors()) {
			System.out.println("Validation error count: "
					+ result.getErrorCount());
			return "register";
		}
		System.out.println(stu.getSid());
		System.out.println(stu.getSname());
		System.out.println(stu.getEmail());
		System.out.println(stu.getPhone());
		System.out.println(stu.getGender());
		System.out.println(stu.getQualification());
		String tim[] = stu.getTimings();
		for (String t : tim) {
			System.out.println(t);
		}
		System.out.println(stu.getRemarks());
		return "home";
	}

	@RequestMapping(value = "/register")
	protected String showRegisterForm(Map<String, Student> model)
			throws ServletException {
		System.out.println("Show Register Form");
		Student stu = new Student();
		stu.setSid("STUDENT-003");
		model.put("student", stu);
		return "register";
	}

}
