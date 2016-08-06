package com.walker.designpatterns.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by walker on 2016/8/6.
 */
public class Menu extends MenuComponent {
    List<MenuComponent> menuComponenets = new ArrayList();

    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent component) {
        menuComponenets.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menuComponenets.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponenets.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }



    @Override
    public void print() {
        System.out.println("menu: " + name + "|" + description);
        Iterator<MenuComponent> iterator = menuComponenets.iterator();
        while (iterator.hasNext()) {
            MenuComponent component = iterator.next();
            component.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponenets.iterator());
    }
}
