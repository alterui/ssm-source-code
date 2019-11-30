package com.lr.test;

import com.lr.po.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author liurui
 * @date 2019/11/30 17:25
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        Student student = new Student();
        student.setStudentAge(23);
        student.setStudentName("tom1");

        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = factory.openSession();
        sqlSession.insert("insertStudent", student);
        sqlSession.commit();
        sqlSession.close();
    }
}
