package cn.uninasa.cascade_test.dao;

import cn.uninasa.cascade_test.entity.TbEntity;
import cn.uninasa.cascade_test.repository.TbEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TbEntityDaoImpl implements TbEntityDao{
    @Autowired
    private TbEntityRepository repository;

    @Override
    public List<TbEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public TbEntity save(TbEntity tb) {
        return repository.save(tb);
    }


}
