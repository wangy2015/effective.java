package com.java.effective.chapter2.item3;

/**
 * Created by 王勇 on 2015/11/19.
 * 枚举实现单例
 */
public enum ElvisEnum {
    INSTANCE;
    int cnt = 1;
    public void printCnt() {
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        ElvisEnum elvisEnum = ElvisEnum.INSTANCE;
        elvisEnum.printCnt();
        elvisEnum.cnt++;
        elvisEnum = ElvisEnum.INSTANCE;
        elvisEnum.printCnt();
    }
}
