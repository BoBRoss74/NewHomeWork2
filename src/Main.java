public class Main {
    public static void main(String[] args) {
                /// Задание 1
        double dog = 6;
        var cat = 3.6;
        var paper = 763789;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
                /// Задание 2
        dog = dog + 4;
        cat = cat +4;
        paper = paper +4;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
                /// Задание 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
                /// Задание 4
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
                /// Задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
                /// Задание 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxersweight = boxer1+boxer2;
        System.out.println("Общий вес боксеров " +boxersweight +" кг!");
        var weightdiff = boxer2 - boxer1;
        System.out.println("Разница в весе " +weightdiff + " кг!");
                /// Задание 8
        var totalwhr = 640;
        var hwrworks = 8;
        var workers = (totalwhr / hwrworks);
        System.out.println("Всего работников в компании - " + workers + " человек");
                /// Задание 9
        var Worker = 94;
        var hwrday = 8;
        var totalwrrs = (Worker * hwrday);
        System.out.println("Если в компании работает 94 человека, то всего " +totalwrrs + " часов работы может быть поделено между сотрудниками");
                /// Задание 10
        byte a = 1;
        System.out.println("Значение переменной byte c типом а "+ a + " равно" );
        short b = 2;
        System.out.println("Значение переменной short c типом b "+ b + " равно" );
        int c = 3;
        System.out.println("Значение переменной int c типом c "+ c + " равно" );
        long d = 4L;
        System.out.println("Значение переменной long c типом d "+ d + " равно" );
        float e = 5;
        System.out.println("Значение переменной float c типом e "+ e + " равно" );
        double f = 6;
        System.out.println("Значение переменной double c типом f "+ f + " равно" );
                ///Задание 11
        double a1 = 27.12;
        System.out.println( a1);
        long a2 = 978678965549L;
        System.out.println(a2);
        double a3 = 2.786;
        System.out.println(a3);
        boolean a4 = false;
        System.out.println(a4);
        short a5 = 569;
        System.out.println(a5);
        short a6 = -159;
        System.out.println(a6);
        int a7 = 27897;
        System.out.println(a7);
        byte a8 = 67;
        System.out.println(a8);
                /// Задание 12
        int Ludmila = 23;
        int Anna = 27;
        int Ekaterina = 30;
        int Totalpaper = 480;
        int TotalStudents = Ludmila + Anna + Ekaterina;
        int PaperOnStudents = Totalpaper / TotalStudents;
        System.out.println("На каждого ученика рассчитано " +PaperOnStudents + " листов бумаги");
                ///Задание 13
        int Bottleinmin = 8;
        int Bottlein20min = Bottleinmin * 20;
        System.out.println("За 20 минут машины произвела бутылок " + Bottlein20min + " штук");
        int Bottleinday = Bottleinmin * 1440;
        System.out.println("За сутки машины произвела бутылок " + Bottleinday + " штук");
        int Bottlein3day = Bottleinmin * 4320;
        System.out.println("За три дня машины произвела бутылок "+ Bottlein3day + "штук");
        int BottleinMounth = Bottleinmin * 41760;
        System.out.println("За месяц машина произвела бутылок " + BottleinMounth + "штук");
                /// Задание 14
        int PaintTotal = 120;
        int WhitePaintPerClass = 2;
        int KorPaintPerClass = 4;
        int PaintOnClass = WhitePaintPerClass + KorPaintPerClass;
        int TotalClass = PaintTotal / PaintOnClass;
        int TotalWhitePaint = TotalClass * WhitePaintPerClass;
        int TotalKorPaint = TotalClass * KorPaintPerClass;
        System.out.println("В школе, где " + TotalClass + " классов,нужно " + TotalWhitePaint+ " банок белой краски, и " +TotalKorPaint + " корричневой краски");
                ///Задание 15
        short banana = 5;
        short milk = 200;
        short icecream = 2;
        short eggs = 4;
        //колл-во грамм в каждом продукте
        short bananagramm = 80;
        double milkgramm = 200/105;
        short icecramgramm = 100;
        short eggsgramm = 70;
        //массе рецепта в граммах
        int weightbanana = banana * bananagramm;
        double weightmilk = milk * milkgramm;
        int weighticecream = icecream * icecramgramm;
        int weighteggs = eggs * eggsgramm;
        System.out.println("Вес бананов " + weightbanana + " грамм");
        System.out.println("Вес молока " + weightmilk + " грамм");
        System.out.println("Вес мороженного " + weighticecream + " грамм");
        System.out.println("Вес яиц " + weighteggs + " грамм");
        //переводим в килограммы
        float grammtokilobanan = weightbanana / 1000f;
        double grammtokilomilk = weightmilk / 1000;
        float grammtokiloice = weighticecream /1000f;
        float grammtokiloeggs = weighteggs / 1000f;
        System.out.println("Вес бананов " + grammtokilobanan + " кг");
        System.out.println("Вес молока " + grammtokilomilk + " кг");
        System.out.println("Вес мороженного " + grammtokiloice + " кг");
        System.out.println("Вес яиц " + grammtokiloeggs + " кг");
                ///Задание 16
        int weightloss = 7;
        int weightloss1 = 250;
        int weightloss2 = 500;
        //Решение
        float weightlost250 = weightloss1 / 1000f;
        float weightlost500 = weightloss2 / 1000f;
        double weightinday250 = weightloss / weightlost250;
        double weightinday500 = weightloss / weightlost500;

        System.out.println("Спортсмен сбросит вес при диете в 250 грамм за " + weightinday250 + " дней");
        System.out.println("Спортсмен сбросит вес при диете в 500 грамм за " + weightinday500 + " дней");

        //дней в среднем для похудения
        int day1 = 28;
        int day2 = 14;
        int average = day1 + day2;
        int averagetotal = average / 2;
        System.out.println("Среднее количество дней за которое спортсмен сбросит вес " + averagetotal);
                ///Задание 17
        int zpmasha = 67_760;
        int zpdenis = 83_690;
        int zpkris = 76_230;
        // прибавка в 10%
        double pluszpmasha = zpmasha * 0.1;
        double pluszpdenis = zpdenis * 0.1;
        double pluszpkris = zpkris * 0.1;

        double newzpmasha = zpmasha + pluszpmasha;
        double newzpdenis = zpdenis + pluszpdenis;
        double newzpkris = zpkris + pluszpkris;

        System.out.println("Маша теперь поулчает " +newzpmasha + " рублей");
        System.out.println("Денис теперь получает " +newzpdenis + " рублей");
        System.out.println("Кристина теперь получает " +newzpkris + " рублей");

        //Годовой доход вырос

        System.out.println("Годовой доход Маши вырос на " + pluszpmasha + " рублей");
        System.out.println("Годовой доход Дениса вырос на " + pluszpdenis + " рублей");
        System.out.println("Годовой доход Кристины вырос на " + pluszpkris + " рублей");

    }
}