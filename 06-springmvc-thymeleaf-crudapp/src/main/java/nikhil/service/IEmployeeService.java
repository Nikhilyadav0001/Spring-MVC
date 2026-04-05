package nikhil.service;

import java.util.List;

import nikhil.model.Employee;

public interface IEmployeeService {

	
	//save the record
	void saveRecord(Employee employee);
	
	//display the records
	List<Employee> displayAllRecord();
	
}
