package com.sky.controller.admin;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.service.CategoryService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 员工管理
 */
@RestController
@RequestMapping("/admin/category")
@Slf4j


public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping
    @ApiOperation("新增分类")
    public Result<String> addCategory(@RequestBody CategoryDTO categoryDTO) {
        log.info("新增分类：{}", categoryDTO);
        categoryService.addCategory(categoryDTO);
        return Result.success();
    }

    @PostMapping("/page")
    @ApiOperation("分页查询分类")
    public Result<PageResult> page(CategoryPageQueryDTO categoryPageQueryDTO) {
        log.info("分页查询分类");
        PageResult pageResult = categoryService.page(categoryPageQueryDTO);
        return Result.success(pageResult);
    }

    @PutMapping
    @ApiOperation("修改分类")
    public Result<String> change(@RequestBody CategoryDTO categoryDTO) {
        log.info("修改分类");
        categoryService.change(categoryDTO);
        return Result.success();
    }

    @PostMapping("/status/{status}")
    @ApiOperation("修改分类状态")
    public Result<String> openOrClose(@PathVariable Integer status, long id) {
        log.info("修改分类状态");
        categoryService.openOrClose(status, id);
        return Result.success();
    }

    @GetMapping("/list")
    @ApiOperation("根据类型查询")
    public Result<List> list(Integer type) {
        log.info("根据分类查询");
        List<Category> list = categoryService.list(type);
        return Result.success(list);
    }

    @DeleteMapping
    @ApiOperation("删除分类")
    public Result<String> delete(Integer id) {
        log.info("删除分类");
        categoryService.delete(id);
        return Result.success();
    }
}
