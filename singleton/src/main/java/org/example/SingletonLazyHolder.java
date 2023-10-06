package org.example;

/**
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 */

public class SingletonLazyHolder {
    private static class Holder{
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return Holder.instance;
    }
}
