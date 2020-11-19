/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.performanceExamine;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author follow
 */
public class DataManager {
    
    public static final List<User> USER_LIST = new ArrayList<>();
    
    static{
        for(int i = 1; i < 10; i++){
            USER_LIST.add(new User("00" + i, "00" + i, "00" + i, 1, 10.0 + i));
        }
    }
    
    /**
     * 登录
     * @param no
     * @param pwd
     * @return 
     */
    public static User login(String no, String pwd){
        return USER_LIST.stream().filter(e -> e.getNo().equals(no) && e.getPwd().equals(pwd)).findFirst().orElse(null);
    }
}
