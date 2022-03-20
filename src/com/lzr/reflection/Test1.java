package com.lzr.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 通过反射获取类的Class对象
        Class c1 = Class.forName("com.lzr.User");
        System.out.println(c1);
        Class c2 = Class.forName("com.lzr.User");
        Class c3 = Class.forName("com.lzr.User");
        Class c4 = Class.forName("com.lzr.User");
        // 一个类在内存中只有一个Class对象
        // 一个类被加载后，类的整个结构都会被封装在Class对象中
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());

        // 加载类，返回Class类型的对象cls
        Class cls = Class.forName("类全名");
        // 通过 cls 得到你加载的类的对象实例
        Object o = cls.newInstance();
        System.out.println("o的运行类型：" + o.getClass()); // 运行时的类型
        // 通过 cls 得到你加载的类的方法对象
        // 即：在反射中，可以把方法视为对象（万物皆对象）
        Method method = cls.getMethod("方法名");
        // 通过上面的method调用方法：即通过方法对象来实现调用方法
        method.invoke(o); // 传统方法：对象.方法(),反射机制：方法.invoke(对象)

    }
}
