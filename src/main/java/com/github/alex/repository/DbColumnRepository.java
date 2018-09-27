package com.github.alex.repository;

import com.github.alex.entity.DbColumn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alex on 2018/9/26.
 */
@Repository
public interface DbColumnRepository extends JpaRepository<DbColumn, String>, JpaSpecificationExecutor {

    /**
     * 查询
     * @param tableId
     * @return
     */
    List<DbColumn> findByTableIdOrderByOrderNum(String tableId);
}
