package cn.uninasa.cascade_test.repository;

import cn.uninasa.cascade_test.entity.TbEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TbEntityRepository extends JpaRepository<TbEntity,Integer> {
}
