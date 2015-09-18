package com.ram.spring.matrix.service;

import com.ram.spring.matrix.api.GenericMatrixService;
import com.ram.spring.matrix.model.Matrix;
import com.ram.spring.matrix.repository.MatrixRepository;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by gamport.
 */
@Service(value = GenericMatrixServiceImpl.BEAN_NAME)
@Qualifier("main")
public class GenericMatrixServiceImpl implements GenericMatrixService {

	/*BEAN NAME*/
	public static final String BEAN_NAME = "genericMatrixService";

	@Autowired
	MatrixRepository matrixRepository;

	public Matrix getMatrixByMatrixName(final String matrixName) {
		Matrix matrix = matrixRepository.findByMatrixName(matrixName);

		if(matrix == null) {
			matrix = new Matrix();
		}

		return matrix;
	}

	public long addMatrix(final Matrix matrix) {
		Matrix newMatrix = matrixRepository.save(matrix);
		return newMatrix.getMatrixId();
	}

	public void deleteMatrix(final String matrixName) {
		Matrix matrix = matrixRepository.findByMatrixName(matrixName);
		matrixRepository.delete(matrix.getMatrixId());
	}

	public Matrix updateMatrix(final Matrix matrix) {
		Matrix newMatrix = matrixRepository.findOne(matrix.getMatrixId());
		newMatrix.setDataType(matrix.getDataType());
		newMatrix.setDataValue(matrix.getDataValue());
		newMatrix.setMatrixName(matrix.getMatrixName());
		newMatrix.setPositionX(matrix.getPositionX());
		newMatrix.setPositionY(matrix.getPositionY());
		matrixRepository.save(newMatrix);

		return newMatrix;
	}
}
