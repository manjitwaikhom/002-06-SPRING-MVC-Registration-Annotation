package com.spring.mvc;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author manjit
 *
 */
public class StudentValidator implements Validator {

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return Student.class.equals(arg0);
	}

	public void validate(Object obj, Errors errors) {
		// TODO Auto-generated method stub

		Student stu = (Student) obj;
		// student name validation
		if (stu.getSname() == null || stu.getSname().length() == 0) {
			errors.rejectValue("sname", "errors.sname.required",
					new Object[] {}, "Name is Required");
		}

		// email validation
		if (stu.getEmail() == null || stu.getEmail().length() == 0) {
			errors.rejectValue("email", "errors.email.required",
					new Object[] {}, "Email is Required");
		} else if (!((stu.getEmail().contains("@")) && (stu.getEmail()
				.endsWith(".com") || stu.getEmail().endsWith(".co.in") || stu
				.getEmail().endsWith(".in")))) {
			errors.rejectValue("email", "errors.email.invakid",
					new Object[] {}, "Invalid Email.");

		}

		// phone validation
		if (stu.getPhone() == null || stu.getPhone().length() == 0) {
			errors.rejectValue("phone", "errors.phone.required",
					new Object[] {}, "Phone no is Required");
		} else if (stu.getPhone().length() != 10) {
			errors.rejectValue("phone", "errors.phone.invalid",
					new Object[] {}, "Phone contains 10 digits");
		} else if (stu.getPhone().length() == 10) {
			String regex = "[0-9]+";
			boolean isnum = stu.getPhone().matches(regex);
			if (!isnum) {
				errors.rejectValue("phone", "errors.phone.invalid",
						new Object[] {}, "Phone contains only digits");
			}
			// try {
			// Integer.parseInt(stu.getPhone());
			// } catch (Exception e) {
			// errors.rejectValue("phone", "errors.phone.invalid",
			// new Object[] {}, "Phone contains only digits");
			// }
		}
		// time validation
		if (stu.getTimings().length < 1) {
			errors.rejectValue("timings", "errors.timings", new Object[] {},
					"Select Suitable Timings");
		}
		// Gender validation
		if (stu.getGender() == null || stu.getGender().length() == 0) {
			errors.rejectValue("gender", "errors.gender", new Object[] {},
					"Gender is required");
		}

		// Qualification validation
		if (stu.getQualification() == null
				|| stu.getQualification().length() == 0
				|| stu.getQualification().equals("---Select Options---")) {
			errors.rejectValue("qualification", "errors.qualification",
					new Object[] {}, "Select Qualification");
		}

	}

}
