package com.onspring.onspring_customer.domain.user.service;

import com.onspring.onspring_customer.domain.user.dto.EndUserDto;
import com.onspring.onspring_customer.domain.user.entity.EndUser;

import java.util.List;

public interface EndUserService {
    Long saveEndUser(EndUserDto endUserDto);

    EndUserDto findEndUserById(Long id);

    List<EndUser> findAllEndUser();

    boolean updateEndUser(EndUserDto endUserDto);

    boolean deleteEndUserById(Long id);

    boolean deleteAllEndUser(List<Long> ids);
}
