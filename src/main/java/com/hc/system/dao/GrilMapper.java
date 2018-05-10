package com.hc.system.dao;

import com.hc.system.entity.Gril;
import com.hc.system.util.IMapper;

import java.util.List;

public interface GrilMapper extends IMapper<Gril> {
    List<Gril> queryGrilList();
}