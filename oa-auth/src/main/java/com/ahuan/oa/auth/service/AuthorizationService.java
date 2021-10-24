package com.ahuan.oa.auth.service;

import com.ahuan.oa.auth.model.Authorization;

public interface AuthorizationService {

    void insert(Authorization authorization);

    void delete(Authorization authorization);

    Authorization findById(Long id);

}
