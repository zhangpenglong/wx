package com.huixiangfu.modules.shoppingop.roll.service;

import com.huixiangfu.base.roll.dao.RollMapper;
import com.huixiangfu.base.roll.vo.Roll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by dongao on 2018/1/20.
 */
@Service
public class RollServiceImpl implements RollService {

    @Autowired
    private RollMapper rollMapper;

    @Override
    public List<Roll> getAllRoll() {
        return rollMapper.getAllRoll();
    }
}
