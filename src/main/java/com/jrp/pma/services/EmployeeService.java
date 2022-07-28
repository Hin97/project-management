package com.jrp.pma.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	// Field injection
//	@Qualifier("staffRepositoryImpl1")
//	@Autowired
	IStaffRepository empRepo;

	// Constructor injection
//	public EmployeeService(@Qualifier("staffRepositoryImpl1") IStaffRepository empRepo) {
//		super();
//		this.empRepo = empRepo;
//	}

	// Setter injection
	@Autowired
	public void setEmpRepo(@Qualifier("staffRepositoryImpl1") IStaffRepository empRepo) {
		this.empRepo = empRepo;
	}

}
