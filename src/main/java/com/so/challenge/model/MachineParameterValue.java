package com.so.challenge.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * Describes the machine parameters at a certain point in time
 */
@Data
@Entity
public class MachineParameterValue {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "timestamp", nullable = false)
	private Date timestamp;

	@Column(name = "machineKey", nullable = false)
	private String machineKey;

	@Column(name = "parameterKey", nullable = false)
	private String parameterKey;

	@Column(name = "realValue", nullable = true)
	private Double realValue;

	@Column(name = "booleanValue", nullable = true)
	private Boolean booleanValue;

	@Column(name = "stringValue", nullable = true)
	private String stringValue;
}
