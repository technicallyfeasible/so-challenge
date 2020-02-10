package com.so.challenge.service;

import java.util.Date;
import java.util.List;

import com.so.challenge.dto.StatsValueDto;
import com.so.challenge.model.MachineParameterValue;

public interface MachineParameterService {
    /**
     * Get the most recent parameter values
     */
    List<MachineParameterValue> getMostRecent(String machineKey);

    /**
     * Get the statistics for a machine
     * @param machineKey
     * @return
     */
    List<StatsValueDto> getParameterStatistics(String machineKey, Date from);
}