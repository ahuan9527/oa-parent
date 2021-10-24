package com.ahuan.oa.auth.mapper;

import com.ahuan.oa.auth.model.Authorization;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorizationMapper {
     void insertAuth(Authorization authorization);
     void deleteAuth(Authorization authorization);
     Authorization findById(Long id);
}
