package cn.uninasa.cascade_test.repository;

import cn.uninasa.cascade_test.entity.TbEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface TbEntity2Repository extends PagingAndSortingRepository<TbEntity,Integer> {
    @Override
    Iterable<TbEntity> findAll(Sort sort);

    @Override
    Page<TbEntity> findAll(Pageable pageable);

    @Override
    Optional<TbEntity> findById(Integer integer);
}
