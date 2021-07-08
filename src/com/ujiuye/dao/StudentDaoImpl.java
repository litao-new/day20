package com.ujiuye.dao;

import com.ujiuye.bean.Student;
import com.ujiuye.util.ThreadDruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;
//实现StudentDao接口
public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> studentDao(String sname) {
        //获取QueryRunner对象
        QueryRunner qr = new QueryRunner(ThreadDruidUtils.getDataSource());
        //sql语句
        String sql = "select * from student where sname like '%"+sname+"%'";
        List<Student> list = null;
        try {
            //查询用query
            list = qr.query(sql, new BeanListHandler<>(Student.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
