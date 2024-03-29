package com.xizhicheng.mybatis.controller;

import com.xizhicheng.mybatis.dto.request.BatchInsertStudentReq;
import com.xizhicheng.mybatis.dto.request.BatchInsertUserReq;
import com.xizhicheng.mybatis.dto.request.StudentCreatReq;
import com.xizhicheng.mybatis.dto.request.UserCreatReq;
import com.xizhicheng.mybatis.entity.Student;
import com.xizhicheng.mybatis.entity.User;
import com.xizhicheng.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 查找一个学生信息
     * @param sid
     * @return
     */
    @RequestMapping(value = "/getStudentInfo/{sid}", method = RequestMethod.GET)
    public Student getStudentInfo(@PathVariable Integer sid) {
        Student student = studentService.getStudentInfo(sid);
        return student;
    }

    /**
     *插入一条学生信息
     * @param sid
     * @return
     */
    @RequestMapping(value = "/insertStudentInfo/{sid}", method = RequestMethod.GET)
    public Student  insertStudentInfo(@PathVariable Integer sid) {
        Student student = studentService.getStudentInfo(sid);
        return student;
    }

    /**
     * 增加一个学生信息
     * @param req
     */
    @RequestMapping(value = "/addStudentInfo", method = RequestMethod.POST)
    public void addStudentInfo(@RequestBody StudentCreatReq req) {
        studentService.addStudentInfo(req);
    }

    /**
     * 根据学号删除学生信息
     * @param sid
     */
    @RequestMapping(value = "/deleteStudentInfo/{sid}", method = RequestMethod.DELETE)
    public void deleteStudentInfo(@PathVariable Integer sid) {
        studentService.deleteStudentInfo(sid);
    }

    /**
     * 修改更新学生信息
     * @param req
     */
    @RequestMapping(value = "/updateStudentInfo", method = RequestMethod.PUT)
    public void updateStudentInfo(@RequestBody StudentCreatReq req) {
        studentService.updateStudentInfo(req);
    }

    /**
     * 批量插入学生信息
     * @param req
     * @return
     */
    @RequestMapping(value = "/batchInsertStudentInfo", method = RequestMethod.POST)
    public Integer batchInsertStudentInfo(@RequestBody BatchInsertStudentReq req){
    int countStudent = studentService.batchInsertStudentInfo(req);
    return countStudent;
    }

//    @RequestMapping(value = "getBatchStudentInfo", method = RequestMethod.GET)
//    public List<Student> getBatchStudentInfo(){}
}
