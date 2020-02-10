package com.so.challenge.service;

import java.util.List;
import java.util.Map;

import com.so.challenge.model.Machine;

public interface MachineService {
    /**
     * Get a list of all machines
     */
    List<Machine> getMachines();

    /**
     * Update the parameters for a machine
     */
    void updateMachineParameters(String machineKey, Map<String, Object> parameters);
}