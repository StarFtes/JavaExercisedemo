package com.zmdyz.demo_3;
// 这个类定义了一个自定义泛型，并有相应的内置方法 -> add与get
public class gen_homework<E> {
    // 定义了一个数组容器 type ->Object
    private Object[] list = new Object[10];
    // 定义一个索引下标
    private int size;
    // 定义一个add方法
    public boolean add(E e){
        list[size] = e;
        size++;
        return true;
    }
    // 定义了一个get方法
    public E get(int index){
        return (E) list[index];
    }

}
