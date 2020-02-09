package com.so.challenge.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.so.challenge.model.Machine;
import com.so.challenge.model.MachineParameterValue;
import com.so.challenge.repository.MachineRepository;
import com.so.challenge.repository.ParameterValueRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MachineServiceImpl implements MachineService {

    @Autowired
    private MachineRepository machineRepository;

    @Autowired
    private ParameterValueRepository parameterValueRepository;

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public List<Machine> getMachines() {
        this.log.debug("Loading all machines");
        Machine machine = new Machine();
        machine.setKey("key");
        machine.setName("name");
        machineRepository.save(machine);

        return machineRepository.findAll();
    }

    @Override
    public Machine getMachineByKey(String machineKey) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateMachineParameters(String machineKey, Map<String, Object> parameters) {
        this.log.debug(String.format("Insert new parameters for machine %s", machineKey));

        Date timestamp = new Date();

        List<MachineParameterValue> entities = new ArrayList<MachineParameterValue>();
        parameters.forEach((String key, Object value) -> {
            MachineParameterValue param = new MachineParameterValue();
            param.setTimestamp(timestamp);
            param.setMachineKey(machineKey);
            param.setParameterKey(key);
            if (value instanceof Double) {
                param.setRealValue((Double) value);
            }
            if (value instanceof Boolean) {
                param.setBooleanValue((Boolean) value);
            }
            if (value instanceof String) {
                param.setStringValue((String) value);
            }
            entities.add(param);
        });
        parameterValueRepository.saveAll(entities);
    }

}