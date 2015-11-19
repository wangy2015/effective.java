package com.java.effective.chapter2.item3;

import java.io.*;

/**
 * Created by ���� on 2015/11/19.
 * ˽�й�����ʵ�ֵ����������л�
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

    // �������л���Ҫʵ�ִ˷���
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
        // ���л�����
        try {
            // ���л�
            ObjectOutputStream ut = new ObjectOutputStream(new FileOutputStream("D:/objectfile.obj"));
            ut.writeObject(elvis);
            // �����л�
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/objectfile.obj"));
            Elvis elvisDisk = (Elvis)in.readObject();
            // cnt����
            elvisDisk.printCnt();
            // ��readResolve֮ǰ����ȣ���readResolve֮�����
            System.out.println(elvis == elvisDisk);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
