package com.huixiangfu.base.roll.dao;

import com.huixiangfu.base.roll.vo.Roll;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dongao on 2018/1/20.
 */
@Repository
public interface RollMapper {

    List<Roll> getAllRoll();
}
