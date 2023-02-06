public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача 1-3");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task3 (){
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
public static void task4 () {
    System.out.println("Задача 6-7");
    var boxer1Weight = 78.2;
    var boxer2Weight = 82.7;
    var commonWeight = boxer1Weight + boxer2Weight;
    System.out.println(commonWeight);
    var differenceInWeight = boxer1Weight - boxer2Weight;
    System.out.println(differenceInWeight);
    differenceInWeight = boxer2Weight - boxer1Weight;
    System.out.println(differenceInWeight);
    differenceInWeight = boxer2Weight % boxer1Weight;
    System.out.println(differenceInWeight);
}
public static void task5 (){
    System.out.println("Задание 8");
    var totalNum = 640;
    var oneNum = 8;
    var totalStuff = totalNum / oneNum;
    System.out.println("Всего работников в компании " + totalStuff + " человек");

    var totalStuff2 = totalStuff + 94;
    var totalNum2 = totalStuff2 * oneNum;
    System.out.println("Если в компании работает " + totalStuff2 + " человек, то всего " + totalNum2 + " часов работы может быть поделено между сотрудниками");
}
}