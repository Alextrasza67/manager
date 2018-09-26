package com.github.alex.repository;

import com.github.alex.entity.InterfaceParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by alex on 2018/9/26.
 */
@Repository
public interface InterfaceParameterRepository extends JpaRepository<InterfaceParameter, String>, JpaSpecificationExecutor {
}
