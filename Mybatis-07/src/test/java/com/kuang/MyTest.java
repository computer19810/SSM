package com.kuang;

import com.kuang.dao.BolgMapper;
import com.kuang.pojo.Bolg;
import com.kuang.utils.IDUtils;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.*;

public class MyTest {
    @Test
    public void insertBlogCommon()
    {
        SqlSession sqlSession = MybatisUtils.getSqlsession();
        BolgMapper mapper = sqlSession.getMapper(BolgMapper.class);
        Bolg blog =new Bolg();
        blog.setId(IDUtils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.insertBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Java");
        mapper.insertBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring");
        mapper.insertBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("微服务");
        mapper.insertBlog(blog);

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void IFTest()
    {
        SqlSession sqlSession = MybatisUtils.getSqlsession();
        BolgMapper mapper = sqlSession.getMapper(BolgMapper.class);
        HashMap map  = new HashMap();
        //map.put("author", "狂神说");
        map.put("title","Java");
        List<Bolg> bolgs;
        bolgs = mapper.selectBlogIF(map);
        for (Bolg bolg : bolgs) {
            System.out.println(bolg);
        }
        sqlSession.close();
    }
    @Test
    public void whereTest()
    {
        SqlSession sqlSession = MybatisUtils.getSqlsession();
        BolgMapper mapper = sqlSession.getMapper(BolgMapper.class);
        HashMap map2=new HashMap();
        map2.put("author","狂神说");

        List<Bolg> bolgs = mapper.selectBlogIF2(map2);
        for (Bolg bolg : bolgs) {
            System.out.println(bolg);
        }
        sqlSession.close();
    }
    @Test
    public void selectChooseWhenTest()
    {
        SqlSession sqlSession = MybatisUtils.getSqlsession();
        BolgMapper mapper = sqlSession.getMapper(BolgMapper.class);
        HashMap mpa3 =new HashMap();
        //mpa3.put("title","Java");
        mpa3.put("author", "狂神说");
        mpa3.put("views", 9999);

        List<Bolg> bolgs = mapper.selectBlogIF3(mpa3);
        for (Bolg bolg : bolgs) {
            System.out.println(bolg);
        }
        sqlSession.close();
    }
    @Test
    public void updateWithSet(){
        SqlSession sqlSession = MybatisUtils.getSqlsession();
        BolgMapper mapper = sqlSession.getMapper(BolgMapper.class);
        HashMap map = new HashMap();
        map.put("title", "Java Sample");
        map.put("author", "computer19810");
        map.put("id", "ea345e98310b40059f6bc192f3f4879e");

        int i = mapper.updateBlogWithSet(map);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void selectForeach()
    {
        SqlSession sqlSession = MybatisUtils.getSqlsession();
        BolgMapper mapper = sqlSession.getMapper(BolgMapper.class);
        HashMap map = new HashMap();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        map.put("ids", ids);
        ids.add(1);
        ids.add(2);
        ids.add(3);

        List<Bolg> bolgs = mapper.selectBlogForeach(map);
        for (Bolg bolg : bolgs) {
            System.out.println(bolg);
        }
        sqlSession.close();

    }
}
