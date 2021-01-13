package com.metanit;
/*класс объявляем абстрактным поскольку у его наследников - кота и собаки свои методы
т.е. животное не является сущностью, а является концепцией
делая класс абстрактным, мы запрещаем создавать объекты этого класса, и
только его наследники могут являться сущностями значит можем создавать представителей наследников класса животные
*/
abstract class Animal {
    protected int length; //поля protected видны в пределах всех классов-наследников нашего класса
    protected double height; //и в пределах всех классов находящихся в том же пакете что и животное

    abstract void run(int length); //абстрактный метод не имеет тела (реализации), поскольку у кота или собаки
    //реализации метода разные и конкретно мы их пропишем уже в самих классах
    abstract void jump(double height); //абстрактный метод (у каждого класса наследника - свой)

    //нет метода swim т.к. у кота нет такого метода, и мы его отдельно создадим для собаки
}
