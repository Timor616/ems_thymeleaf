package com.baizhi.dao;

import com.baizhi.entity.Emp;
import java.util.List;

/**
 * @author: timor
 * @date: 2020/7/16 17:35
 */
public interface EmpDAO {

    List<Emp> findAll();

    void save(Emp emp);
}
