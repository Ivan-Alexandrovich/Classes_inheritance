package com.metanit;

class Cat extends Animal {
    @Override //аннотация переопределяет абстрактный метод из базового класса
    void run(int l) {
        boolean result = l <= 200;
        if (result) { length = l; }
        System.out.println("Run: " + result);
    }
    @Override
    void jump(double h) {
        boolean result = h <= 2;
        if (result) { height = h; }
        System.out.println("Jump: " + result);
    }

}