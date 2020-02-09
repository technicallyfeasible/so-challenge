package com.so.challenge.controller;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.so.challenge.dto.MachineDto;
import com.so.challenge.dto.MachineStatusDto;
import com.so.challenge.model.Machine;
import com.so.challenge.service.MachineService;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController()
@RequestMapping("machines")
@Api(value = "Machines", description = "REST API to manages Machine instances", tags = { "Machines" })
public class MachinesController {

	@Autowired
	private MachineService machineService;

	@GetMapping("")
	public Collection<MachineDto> getMachines() {
		// TODO: this could be reused
		ModelMapper modelMapper = new ModelMapper();
		TypeMap<Machine, MachineDto> machineMapper = modelMapper.createTypeMap(Machine.class, MachineDto.class);

		Collector<MachineDto, ?, Collection<MachineDto>> toList = Collectors.toCollection(ArrayList<MachineDto>::new);
		return machineService.getMachines().stream().map(machineMapper::map).collect(toList);
	}

	@GetMapping("/{key}")
	public MachineDto getMachineByKey(@PathVariable String key) {
		MachineDto machine = new MachineDto();
		machine.setKey(key);
		return machine;
	}

	@PostMapping("/status")
	public MachineStatusDto postMachineStatus(@RequestBody MachineStatusDto status) {
		machineService.updateMachineParameters(status.getMachineKey(), status.getParameters());
		return status;
	}
}