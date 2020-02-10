package com.so.challenge.dto;

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
/**
 * Holds statistics for a value like min, max and average
 */
public class StatsValueDto {
	private Double min;
	private Double max;
	private Double average;
	private Double median;
}