package com.so.challenge.repository;

import com.so.challenge.model.MachineParameterValue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParameterValueRepository extends JpaRepository<MachineParameterValue, String> {
}
