package com.so.challenge.dto;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

@Getter
@Setter(AccessLevel.PUBLIC)
@NoArgsConstructor
@ToString
@Accessors(chain = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
/** Describes a MachineStatus instance when transferred via the API */
public class MachineStatusDto {
	private String machineKey;
	private Map<String, Object> parameters;
}