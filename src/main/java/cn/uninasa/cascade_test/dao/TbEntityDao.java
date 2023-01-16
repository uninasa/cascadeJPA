package cn.uninasa.cascade_test.dao;

import cn.uninasa.cascade_test.entity.TbEntity;

import java.util.List;

public interface TbEntityDao {
    public List<TbEntity> findAll();
    public void delete(Integer id);
    public TbEntity save(TbEntity tb);
}
