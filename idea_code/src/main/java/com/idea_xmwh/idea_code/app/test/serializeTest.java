package com.idea_xmwh.idea_code.app.test;

import com.idea_xmwh.idea_code.app.po.User;
import lombok.extern.slf4j.Slf4j;

import java.io.*;

/**
 * @Description
 * @ClassName serializeTest
 * @Author Mengjw
 * @date 2020.09.10 16:03
 */
@Slf4j
class serializeTest {
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.setName("fufu");
        user.setAge("18");

        serialize(user);
        log.info("Java序列化前的结果:{} ", user);

        User duser = deserialize();
        log.info("Java反序列化的结果:{} ", duser);
    }
    /**
     * @author xzf
     * @description 序列化
     * @date 2020/2/22 19:34
     */
    private static void serialize(User user) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:\111.txt")));
        oos.writeObject(user);
        oos.close();
    }
    /**
     * @author xzf
     * @description 反序列化
     * @date 2020/2/22 19:34
     */
    private static User deserialize() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:\111.txt")));
        return (User) ois.readObject();
    }
}
