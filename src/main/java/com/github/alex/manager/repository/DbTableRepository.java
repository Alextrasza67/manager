package com.github.alex.manager.repository;

import com.github.alex.manager.entity.DbTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alex on 2018/9/26.
 */
@Repository
public interface DbTableRepository extends JpaRepository<DbTable, String>, JpaSpecificationExecutor {

    /**
     * 查询
     * @param schemaId
     * @return
     */
    List<DbTable> findBySchemaIdOrderByTableName(String schemaId);
}
