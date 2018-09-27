package com.github.alex.service;

import com.github.alex.entity.DbColumn;
import com.github.alex.entity.DbTable;
import com.github.alex.repository.DbColumnRepository;
import com.github.alex.repository.DbTableRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;


/**
 * Created by alex on 2018/9/27.
 */
@Service
public class DatabaseService {

    @Autowired
    private DbTableRepository tableRepository;
    @Autowired
    private DbColumnRepository columnRepository;


    /**
     * 查询column
     *
     * @param tableId
     * @return
     */
    public List<DbColumn> findColumnListByTableId(String tableId) {
        if (StringUtils.isBlank(tableId))
            return null;

        return columnRepository.findByTableIdOrderByOrderNum(tableId);
    }

    /**
     * 查询table
     *
     * @param tableId
     * @return
     */
    public DbTable findTableByTableId(String tableId) {
        if (StringUtils.isBlank(tableId))
            return null;
        return tableRepository.getOne(tableId);
    }


    /**
     * 查询table
     *
     * @param schemaId
     * @return
     */
    public List<DbTable> findTableListBySchemaId(String schemaId) {
        if (StringUtils.isBlank(schemaId))
            return null;
        return tableRepository.findBySchemaIdOrderByTableName(schemaId);
    }


    /**
     * example查询table
     *
     * @param example
     * @return
     */
    public List<DbTable> findTableListByExample(DbTable example) {
        if (example == null)
            return null;

        ExampleMatcher matcher = ExampleMatcher.matching();
        if (StringUtils.isNotBlank(example.getTableName())) {
            matcher.withMatcher("tableName", contains());
        }
        Sort sort = new Sort(Sort.Direction.ASC, "tableName");
        return tableRepository.findAll(Example.of(example, matcher), sort);
    }

}
