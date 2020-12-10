package com.kuang.dao;

import com.kuang.pojo.Bolg;

import java.util.List;
import java.util.Map;

public interface BolgMapper {
    int updateBlog();

    List<Bolg> selectBlogIF(Map map);

    List<Bolg> selectBlogIF2(Map map2);

    List<Bolg> selectBlogIF3(Map map3);

    int updateBlogWithSet(Map map);

    int insertBlog(Bolg blog);

    List<Bolg> selectBlogForeach(Map map3);
}
