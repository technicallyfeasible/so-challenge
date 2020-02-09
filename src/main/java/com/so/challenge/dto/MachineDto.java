package com.so.challenge.dto;

import java.util.List;

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
/** Describes a Machine instance when transferred via the API */
public class MachineDto {
	private String key;
	private String name;

	private List<MachineParameterDto> parameters;
}