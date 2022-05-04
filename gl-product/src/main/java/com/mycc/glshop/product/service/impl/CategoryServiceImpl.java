package com.mycc.glshop.product.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mycc.common.utils.PageUtils;
import com.mycc.common.utils.Query;

import com.mycc.glshop.product.dao.CategoryDao;
import com.mycc.glshop.product.entity.CategoryEntity;
import com.mycc.glshop.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //查询出所有列表
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        //组装成父子的树形结构
        List<CategoryEntity> list = categoryEntities
                .stream()
                .filter(
                        categoryEntity
                                ->
                                categoryEntity.getParentCid().equals(0L))
                .map((menu) -> {
                    menu.setChildren(getChildrens(menu, categoryEntities));
                    return menu;
                }).sorted((menu1, menu2) -> {
                    int i = (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                    return i;
                }).collect(Collectors.toList());
        return list;
    }
    //获取子菜单
    private List<CategoryEntity> getChildrens(CategoryEntity menu, List<CategoryEntity> categoryEntities) {
        List<CategoryEntity> list = categoryEntities
                .stream()
                .filter(categoryEntity
                        -> {
                    return categoryEntity.getParentCid().equals(menu.getCatId());
                }).map(categoryEntity -> {
                    //继续递归获取children
                    categoryEntity.setChildren(getChildrens(categoryEntity, categoryEntities));
                    return categoryEntity;
                }).sorted((menu1, menu2) -> {
                    //排序
                    int i = (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                    return i;
                }).collect(Collectors.toList());

        return list;
    }

}