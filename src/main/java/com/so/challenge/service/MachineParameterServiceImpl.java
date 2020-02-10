package com.so.challenge.service;

import java.util.Date;
import java.util.List;

import com.so.challenge.dto.StatsValueDto;
import com.so.challenge.model.MachineParameterValue;
import com.so.challenge.repository.ParameterValueRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MachineParameterServiceImpl implements MachineParameterService {

    @Autowired
    private ParameterValueRepository parameterValueRepository;

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public List<MachineParameterValue> getMostRecent(String machineKey) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<StatsValueDto> getParameterStatistics(String machineKey, Date from) {
        List<MachineParameterValue> values = this.parameterValueRepository.getMachineParameters(machineKey);
        this.log.debug(String.format("Parameter values for %s: %d", machineKey, values.size()));

        return null;
    }

}