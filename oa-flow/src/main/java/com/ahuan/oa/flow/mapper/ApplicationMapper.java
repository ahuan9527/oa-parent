package com.ahuan.oa.flow.mapper;

import com.ahuan.oa.flow.model.Application;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationMapper {


	public void create(Application app);
	
	public void delete(Long id);
	
	public Application findById(Long id);
	
}
