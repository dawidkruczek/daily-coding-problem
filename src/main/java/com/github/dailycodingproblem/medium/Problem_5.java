package com.github.dailycodingproblem.medium;

public class Problem_5 {

    //FUNCTIONAL INTERFACES AND GENERICS!
    public static void main(String[] args) {
        App<Integer> app =  App.cons(3,4);
        System.out.println(app.car( App.cons(3,4)));
        System.out.println(app.cdr( App.cons(3,4)));
    }
}

class App<T> {

    private final T a;
    private final T b;

    public App(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public static <T> App<T> cons(T a, T b) {
        return new App<>(a, b);
    }

    public T car(App<T> p) {
        return p.a;
    }

    public  T cdr(App<T> p) {
        return p.b;
    }
}
