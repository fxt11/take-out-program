package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    @Insert("insert into category (type, name, sort) " +
            "values " +
            "(#{type},#{name},#{sort})")
    void add(Category category);

    Page<Category> page(CategoryPageQueryDTO categoryPageQueryDTO);

    void change(Category category);


    List<Category> list(Integer type);

    @Delete("delete from category where id = #{id}")
    void delete(long id);
}
