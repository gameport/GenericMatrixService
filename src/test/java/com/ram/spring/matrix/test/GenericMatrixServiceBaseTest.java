package com.ram.spring.matrix.test;

import com.ram.spring.matrix.config.GenericMatrixServiceConfig;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by gamport.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {GenericMatrixServiceConfig.class})
public abstract class GenericMatrixServiceBaseTest {
}
