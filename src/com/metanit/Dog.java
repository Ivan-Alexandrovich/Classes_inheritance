package com.metanit;

class Dog extends Animal {
    private int lengthSwim;
    private int maxLength;

    //конструктор который случайным образом присваивает значение переменной maxLength
    Dog() {
        maxLength = Math.random() > 0.5 ?  400 : 600; //Math.random() генерирует число от 0 до 1
        //и в случае его больше 0,5 присваем 400, иначе - 600 (вероятность по 50% принять значения)
    }

    void swim(int l) {
        boolean result = l <= 10;
        if (result) { lengthSwim = l; }
        System.out.println("Swim: " + result);
    }
    @Override //эта аннотация переопределяет объявление метода в базовом классе
    void run(int l) {
        boolean result = l <= maxLength;
        if (result) { length = l; }
        System.out.println("Run: " + result);
    }
    @Override
    void jump(double h) {
        boolean result = h <= 0.5;
        if (result) { height = h; }
        System.out.println("Jump: " + result);
    }
}