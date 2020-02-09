package com.so.challenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
/**
 * Describes a Machine database instance
 */
public class Machine {
	@Id
	private String key;

	@Column(name = "name", nullable = false)
	private String name;
}
