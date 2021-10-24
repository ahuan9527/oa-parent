package com.ahuan.oa.auth.service.impl;

import com.ahuan.oa.auth.mapper.AuthorizationMapper;
import com.ahuan.oa.auth.model.Authorization;
import com.ahuan.oa.auth.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("authorizationService")
public class AuthorizationServiceImpl implements AuthorizationService {

    @Autowired
    private AuthorizationMapper authorizationMapper;

    public void insert(Authorization authorization) {
        authorizationMapper.insertAuth(authorization);
    }

    public void delete(Authorization authorization) {
        authorizationMapper.deleteAuth(authorization);
    }

    public Authorization findById(Long id) {
        return authorizationMapper.findById(id);
    }
}
