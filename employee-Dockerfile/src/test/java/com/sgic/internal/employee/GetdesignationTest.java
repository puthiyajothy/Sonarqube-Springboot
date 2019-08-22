package com.sgic.internal.employee;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sgic.internal.employee.repositories.EmployeeRepository;
import com.sgic.internal.employee.services.impl.EmployeeServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
public class GetdesignationTest {

	private static final Long ID =1L; 
	private static final Long DID =2L;
	
	@Mock
	EmployeeRepository  employeeRepository;
	
	@InjectMocks
	EmployeeServiceImpl empserviceImp;
	
	@Test
	public void testFindtheGreatestfromAlldata( ) {
		empserviceImp.getByempId(ID);
		verify(employeeRepository).findEmployeeByEmpId(ID);	
	}
	
	@Test
	public void Testdesignation (){
		empserviceImp.getByDesignation(DID);
		verify(employeeRepository).findByDesignation(DID);	
	}
	
	
}
