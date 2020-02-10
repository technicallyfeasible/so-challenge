package com.so.challenge.repository;

import java.util.Date;
import java.util.List;

import com.so.challenge.model.MachineParameterValue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ParameterValueRepository extends JpaRepository<MachineParameterValue, String> {
        @Query("select p from MachineParameterValue p where p.machineKey=?1")
        List<MachineParameterValue> getMachineParameters(String machineKey);
}
