package by.teachmeskills.c23onl.alexeishchurko.task23.abstractfabric;

public class ChildrenMenuImpl implements Menu {

    @Override
    public void getFood() {
        System.out.println("Chocolate, cookie, marmalade, cheesecake, fruits");
    }

    @Override
    public void getDrinks() {
        System.out.println("Juice, lemonade");
    }
}