package com.walker.designpatterns.composite;

/**
 * Created by walker on 2016/8/6.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeMenu = new Menu("pancake", "breakfast");
        MenuComponent dinnerMenu = new Menu("dinner", "lunch");
        MenuComponent cafeMenu = new Menu("cafe", "afternoon");

        MenuComponent allMenu = new Menu("ALL MENU", "all menu combined");
        allMenu.add(pancakeMenu);
        allMenu.add(dinnerMenu);

        pancakeMenu.add(new MenuItem("red cake","delicious",true,3.00));
        pancakeMenu.add(new MenuItem("black cake","happy and smell",false,5.00));

        dinnerMenu.add(new MenuItem("hot dog", "taiwan delicious", false, 4.00));
        dinnerMenu.add(new MenuItem("soup", "from china, very good", true, 5.00));
        dinnerMenu.add(cafeMenu);

        cafeMenu.add(new MenuItem("cat cafe","hot and sweet",true,1.0));
        cafeMenu.add(new MenuItem("dog cafe", "brillant", true, 1.5));

        Waitress waitress = new Waitress(allMenu);
        waitress.printMenu();

        waitress.printVegetarianMenu();
    }
}
