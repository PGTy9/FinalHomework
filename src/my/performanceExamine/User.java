/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.performanceExamine;

/**
 *
 * @author follow
 */
public class User {
    
    //工号
    private String no;
    //密码
    private String pwd;
    //姓名
    private String name;
    //性别
    private Integer sex;
    //工作量
    private Double work;

    public User() {
    }

    public User(String no, String pwd, String name, Integer sex, Double work) {
        this.no = no;
        this.pwd = pwd;
        this.name = name;
        this.sex = sex;
        this.work = work;
    }
    
    

    public String getNo() {
        return no;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public Integer getSex() {
        return sex;
    }

    public Double getWork() {
        return work;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void setWork(Double work) {
        this.work = work;
    }
    
    
}
