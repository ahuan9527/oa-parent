package com.ahuan.oa.auth;

import com.ahuan.oa.auth.model.Authorization;
import com.ahuan.oa.auth.service.AuthorizationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@ContextConfiguration(locations = "classpath:application-auth.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AuthorizationServiceTest {
    @Autowired
    private AuthorizationService authorizationService;

    @Test
    public void insert(){
        Authorization authorization = new Authorization();
        authorization.setEmployeeId(1L);
        authorization.setRoleId(1L);
        authorizationService.insert(authorization);
        assertEquals(true, authorization.getId() > 0L);
    }

    @Test
    public void delete(){

    }

    @Test
    public void findById(){
        Authorization auth = new Authorization();
        auth.setEmployeeId(1L);
        auth.setRoleId(1L);
        authorizationService.insert(auth);
        Authorization _auth = authorizationService.findById(auth.getId());
        assertEquals(true, _auth != null);
    }
    @Test
    public void testUnauthorize() {
        Authorization auth = new Authorization();
        auth.setEmployeeId(1L);
        auth.setRoleId(1L);

        authorizationService.insert(auth);
        authorizationService.delete(auth);
        Authorization _auth = authorizationService.findById(auth.getId());

        assertEquals(true, _auth == null);
    }
}
