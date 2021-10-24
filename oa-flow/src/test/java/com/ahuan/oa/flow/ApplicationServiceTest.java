package com.ahuan.oa.flow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ahuan.oa.flow.model.Application;
import com.ahuan.oa.flow.service.ApplicationService;

@ContextConfiguration(locations = {"classpath:application-flow.xml"})  
@RunWith(SpringJUnit4ClassRunner.class)  
public class ApplicationServiceTest {
	
	@Autowired
	private ApplicationService applicationService;
	
	@Test
	public void testCreate() {
		Application app = new Application();
		app.setEmployeeId(1L); 
		app.setDays(5);  
		applicationService.create(app); 
		assertEquals(true, app.getId() > 0L); 
	}
	
	@Test
	public void testFindById() {
		Application app = new Application();
		app.setEmployeeId(1L); 
		app.setDays(5);  
		applicationService.create(app);
		Application _app = applicationService.findById(app.getId());
		assertEquals(true, _app != null); 
	}
	
	@Test
	public void testDelete() {
		Application app = new Application();
		app.setEmployeeId(1L); 
		app.setDays(5);  
		
		applicationService.create(app); 
		applicationService.delete(app.getId());  
		Application _app = applicationService.findById(app.getId());
		
		assertEquals(true, _app == null);  
	}
	
}
