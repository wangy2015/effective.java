package com.java.effective.chapter2.item3;

import java.io.*;

/**
 * Created by 王勇 on 2015/11/19.
 * 私有构造器实现单例，并序列化
 */
public class Elvis implements Serializable {
    private static final Elvis INSTANCE = new Elvis();
    int cnt = 1;
    private Elvis() { }
    public static  Elvis getInstance() {
        return INSTANCE;
    }

    public void printCnt() {
        System.out.println(cnt);
    }

    // 单例序列化需要实现此方法
    private Object readResolve() throws ObjectStreamException {
        // instead of the object we're on,
        // return the class variable INSTANCE
        return INSTANCE;
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.printCnt();
        elvis.cnt++;
        elvis = Elvis.getInstance();
        elvis.printCnt();
        // 序列化测试
        try {
            // 序列化
            ObjectOutputStream ut = new ObjectOutputStream(new FileOutputStream("D:/objectfile.obj"));
            ut.writeObject(elvis);
            // 反序列化
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/objectfile.obj"));
            Elvis elvisDisk = (Elvis)in.readObject();
            // cnt不变
            elvisDisk.printCnt();
            // 加readResolve之前不相等，加readResolve之后相等
            System.out.println(elvis == elvisDisk);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
