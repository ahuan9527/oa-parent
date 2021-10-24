package com.ahuan.oa.flow.service;

import com.ahuan.oa.flow.model.Application;

public interface ApplicationService {
	
	public void create(Application app);
	
	public void delete(Long id);
	
	public Application findById(Long id);
	
}
