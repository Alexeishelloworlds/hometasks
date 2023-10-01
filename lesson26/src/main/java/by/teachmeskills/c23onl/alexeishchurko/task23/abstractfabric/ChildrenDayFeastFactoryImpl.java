package by.teachmeskills.c23onl.alexeishchurko.task23.abstractfabric;

public class ChildrenDayFeastFactoryImpl implements FeastFactory {

    // реализация методов интерфейса абстрактной фабрики FeastFactory
    @Override
    public Menu getMenu() {
        return new ChildrenMenuImpl();
    }

    @Override
    public Show getShow() {
        return new ChildrenShowImpl();
    }

}
