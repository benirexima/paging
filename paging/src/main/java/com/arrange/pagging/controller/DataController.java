package com.arrange.pagging.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.arrange.pagging.entity.DataEntity;
import com.arrange.pagging.service.DataService;

@RestController
@RequestMapping("/data")
public class DataController {
@Autowired
DataService service;
@GetMapping
public List<DataEntity> getAllData(@RequestParam(defaultValue="0")Integer pageNo,@RequestParam(defaultValue="10")Integer pageSize,@RequestParam(defaultValue="id")String sortBy)
{
	return  service.getAllData(pageNo,pageSize,sortBy);
}
@PostMapping("/add")
public DataEntity insert(@RequestBody DataEntity add)
{
	return service.insert(add);
}
}

