package com.jsp.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.DAO.Emp_Dao;
import com.jsp.DTO.Employee;

@Controller
public class Emp_Controller 
{
	@Autowired
	Emp_Dao dao;
	
	@RequestMapping("/add")
	public ModelAndView saveEmployee()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("addEmployee.jsp");
		
		return mv;
	}
	
	@RequestMapping("/save")
	public ModelAndView createEmployee(@ModelAttribute Employee employee)
	{
		dao.saveEmployee(employee);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Index.jsp");
		return mv;
		//return "employee details added...";
	}
	
	@RequestMapping("/search")
	public ModelAndView FindEmployee()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("getEmp.jsp");
		return mv;
	}
	
	@RequestMapping("/view")
	public ModelAndView searchEmployee(@ModelAttribute Employee employee)
	{
		
		ModelAndView mv = new ModelAndView();
		Employee emp = dao.getEmployeebyId(employee.getId());
		mv.addObject("employee", emp);//
		mv.setViewName("display.jsp");
		return mv;
		
	}
	
	@RequestMapping("/delete")
	public ModelAndView removeEmp()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("deleteemp.jsp");
		return mv;
	}
	
	@RequestMapping("/remove")
	public ModelAndView deleteEmp(@ModelAttribute Employee employee)
	{
		dao.delete(employee.getId());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Index.jsp");
		return mv;
	}
	
	@RequestMapping("/update")
	public ModelAndView updateEmp()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("UpdateEMp.jsp");
		return mv;
	}
	
	@RequestMapping("/edit")
	public ModelAndView editEmp(@ModelAttribute Employee employee)
	{
		dao.update(employee);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Index.jsp");
		return mv;
	}
	
	@RequestMapping("/displayAll")
	public ModelAndView displayAll()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("employeelist", dao.getAllEmp());
		mv.setViewName("displayAll.jsp");
		return mv;
	}
}
