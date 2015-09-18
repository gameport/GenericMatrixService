package com.ram.spring.matrix.service;

import com.ram.spring.matrix.api.GenericMatrixService;
import com.ram.spring.matrix.config.GenericMatrixServiceConfig;
import com.ram.spring.matrix.model.Matrix;
import com.ram.spring.matrix.test.GenericMatrixServiceBaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by gamport.
 */
public class GenericMatrixServiceImplTest extends GenericMatrixServiceBaseTest {

	@Autowired
	GenericMatrixService genericMatrixService;


	@Test
	public void testAddMatrix(){

		Matrix matrix = genericMatrixService.getMatrixByMatrixName("Second");

		System.out.println("First run:");
		System.out.println("ID :" + matrix.getMatrixId());
		System.out.println("name :" + matrix.getMatrixName());
	}
}
