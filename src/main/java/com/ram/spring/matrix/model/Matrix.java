package com.ram.spring.matrix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by gamport.
 *
 * Matrix bean object
 */
@Entity
@Table(name = "matrixservice_matrix")
public class Matrix {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long matrixId;

	@Column(nullable = false, length = 75)
	private String matrixName;

	@Column(nullable = false)
	private int positionX;

	@Column(nullable = false)
	private int positionY;

	@Column(nullable = false, length = 75)
	private String dataType;

	@Column(nullable = false, length = 75)
	private String dataValue;

	public long getMatrixId() {
		return matrixId;
	}

	public String getMatrixName() {
		return matrixName;
	}

	public void setMatrixName(final String matrixName) {
		this.matrixName = matrixName;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(final int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(final int positionY) {
		this.positionY = positionY;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(final String dataType) {
		this.dataType = dataType;
	}

	public String getDataValue() {
		return dataValue;
	}

	public void setDataValue(final String dataValue) {
		this.dataValue = dataValue;
	}

	@Override
	public String toString() {
		return "Matrix{" +
				"matrixId=" + matrixId +
				", matrixName='" + matrixName + '\'' +
				", positionX=" + positionX +
				", positionY=" + positionY +
				", dataType='" + dataType + '\'' +
				", dataValue='" + dataValue + '\'' +
				'}';
	}
}
