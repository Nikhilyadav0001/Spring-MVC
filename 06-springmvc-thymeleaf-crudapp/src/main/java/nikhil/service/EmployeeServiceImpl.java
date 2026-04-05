package nikhil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nikhil.model.Employee;
import nikhil.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepository repo;
	
	@Override
	public void saveRecord(Employee employee) {
		repo.save(employee);
	}

	@Override
	public List<Employee> displayAllRecord() {
		return repo.findAll();
	}

}
