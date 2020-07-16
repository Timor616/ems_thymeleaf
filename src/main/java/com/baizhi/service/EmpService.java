package com.baizhi.service;

import com.baizhi.entity.Emp;
import java.util.List;

/**
 * @author: timor
 * @date: 2020/7/16 17:39
 */
public interface EmpService {

    List<Emp> findAll();

    void save(Emp emp);

    void delete(String id);

    Emp find(String id);

    void update(Emp emp);
}
