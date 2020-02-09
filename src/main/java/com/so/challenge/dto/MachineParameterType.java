package com.so.challenge.dto;

/** Describes a Machine instance when transferred via the API */
public enum MachineParameterType {
	REAL("real"),
	BOOLEAN("boolean"),
	STRING("string"),
	INT("int");

	private String type;
 
    MachineParameterType(String type) {
        this.type = type;
    }
 
    public String getType() {
        return type;
    }
}
