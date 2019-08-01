package com.arrange.pagging.service;

import java.util.ArrayList;
import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.arrange.pagging.entity.DataEntity;
import com.arrange.pagging.repository.DataRepository;

@Service
public class DataService {

	@Autowired
	DataRepository repository;
	
	public List<DataEntity> getAllData(Integer pageNo,Integer pageSize,String sortBy)
	{
		Pageable paging=PageRequest.of(pageNo, pageSize,Sort.by(sortBy));
		Page<DataEntity> pagedResult=repository.findAll(paging);
		if(pagedResult.hasContent())
{
	return pagedResult.getContent();
}else
{
	return new ArrayList<DataEntity>();
}
	}
	public DataEntity insert(DataEntity add)
	{
		return repository.save(add);
	 
	}
}
