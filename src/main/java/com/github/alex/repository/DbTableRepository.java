package com.github.alex.repository;

import com.github.alex.entity.DbTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by alex on 2018/9/26.
 */
@Repository
public interface DbTableRepository extends JpaRepository<DbTable, String>, JpaSpecificationExecutor {
}
