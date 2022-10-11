package controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class UserController {
    @Autowired
    JdbcTemplate jct;

    @GetMapping("/userlist")
    public List<Map<String, Object>> userList(){
        String sql = "select * from student";
        List<Map<String, Object>> map = jct.queryForList(sql);
        return map;
    }

    @GetMapping("/insertdb")
    public String addUser(){
        String sql1 = "insert into student values(5, 'kobe', 45)";
        String sql2 = "insert into student values(6, 'tim', 44)";
        jct.update(sql1);
        jct.update(sql2);
        return "insert db ok!";
    }

    @GetMapping("/deletedb")
    public String deleteUser(){
        String sql = "delete from student where id in ('5','6')";
        jct.update(sql);
        return "delete users from db ok!";
    }

    @GetMapping("/updatedb")
    public String updateUser(){
        String sql = "update student set age = 5 where id in (5, 6)";
        jct.update(sql);
        return "update users in db set age 5 ok!";
    }
}