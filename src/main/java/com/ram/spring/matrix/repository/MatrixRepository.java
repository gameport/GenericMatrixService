package com.ram.spring.matrix.repository;

import com.ram.spring.matrix.model.Matrix;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by gamport.
 */
@Repository
@Qualifier("matrixRepo")
@Transactional(readOnly = true)
public interface MatrixRepository extends JpaRepository<Matrix, Long> {

	@Query("select m from com.ram.spring.matrix.model.Matrix m where m.matrixName = :matrixName")
	public Matrix findByMatrixName(@Param(value = "matrixName") String matrixName);
}

