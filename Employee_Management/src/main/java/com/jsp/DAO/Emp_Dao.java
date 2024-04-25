package com.jsp.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.DTO.Employee;

@Repository
public class Emp_Dao 
{
	@Autowired
	EntityManager manager;
	
	@Autowired
	EntityTransaction transaction;
	
	public void saveEmployee(Employee employee)
	{
		transaction.begin();
		
		manager.persist(employee);
		
		transaction.commit();
		
	}
	
	public Employee getEmployeebyId(int id)
	{
		Employee e = manager.find(Employee.class, id);
		return e;
	}
	
	public void delete(int id)
	{
		//Employee e = manager.find(Employee.class, id); ==> if u r not creating a fetch method
		Employee emp = getEmployeebyId(id);
		transaction.begin();
		manager.remove(emp);
		transaction.commit();
	}
	
	public void update(Employee employee)
	{
		
		transaction.begin();
		manager.merge(employee);
		transaction.commit();
	}
	
	public List<Employee> getAllEmp()
	{
		Query q = manager.createQuery("SELECT e from Employee e");
		List<Employee> employeelist = q.getResultList();
		return employeelist;
	}
}
