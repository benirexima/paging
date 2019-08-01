package com.arrange.pagging.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.arrange.pagging.entity.DataEntity;

@Repository
public interface DataRepository extends PagingAndSortingRepository<DataEntity,Long>,JpaRepository<DataEntity,Long>{

}
