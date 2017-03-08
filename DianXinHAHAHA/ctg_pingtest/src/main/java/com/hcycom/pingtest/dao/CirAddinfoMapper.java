package com.hcycom.pingtest.dao;

import java.util.List;

import com.hcycom.pingtest.entity.CirAddinfo;

public interface CirAddinfoMapper {

    List<CirAddinfo> selectAll();
    List<CirAddinfo> selectAllNo();
    CirAddinfo selectByNo(String circuitNo);
}