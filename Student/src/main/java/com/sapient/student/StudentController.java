package com.sapient.student;

import javax.servlet.http.HttpServlet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentModel studentModel = new StudentModel();

	@RequestMapping(value="/student",method=RequestMethod.GET)
	public String dispStudentInfo(ModelMap model,@RequestParam(required=false) String sid) {
		if (sid != null) {
			Student s = studentModel.getDetails(sid);
			if(s == null) {
				return "StudentNotFound";
			}
			model.put("id", sid);
			model.put("name", s.getName());
			model.put("dob", s.getDob());
			model.put("branch", s.getBranch());
		}
		return "StudentInfo";
	}

	public StudentController() {
		super();
	}
}
