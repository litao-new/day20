package com.ujiuye.service;

import com.ujiuye.bean.Student;
import com.ujiuye.dao.StudentDaoImpl;

import java.util.List;
//实现StudentService接口
public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> studentService(String sname) {
        //获取dao对象
        StudentDaoImpl stuDao = new StudentDaoImpl();
        //调用dao对象方法
        List<Student> list = stuDao.studentDao(sname);
        return list;
    }
}
