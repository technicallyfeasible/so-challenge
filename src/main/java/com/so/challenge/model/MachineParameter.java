package com.so.challenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
/** 
 * Describes a Machine parameter database instance
 */
public class MachineParameter {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "key", nullable = false)
	private String key;

	@Column(name = "machine_key", nullable = false)
	private String machineKey;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "type", nullable = false)
	private String type;

	@Column(name = "unit", nullable = true)
	private String unit;
}
