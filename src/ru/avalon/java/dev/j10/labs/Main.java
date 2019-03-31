package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;
import java.util.Date;
import ru.avalon.java.dev.j10.labs.sorting.BubbleSort;

public class Main {

    public static void main(String[] args) {
        
	    String[] strings = {
                "aaaaa",
                "bbbbbb",
                "vvvvvv",
                "eeeeeeee",
                "oqwieoi",
                "ttttttt",
                "oooooooo",
                "iiiiiiiii",
                "qqqqqqqq",
                "tttt",
                "eeeee",
                "ewqewqe",
                "rrrrrrrrr",
                "yyyyyyyy",
                "nnnnn",
                "uuuuuu",
                "hhhhhhhh",
                "llllllll",
                "kkkkkkkkk",
                "aa"
            };

	    Person[] persons = new Person[20];
            persons[0] = new User("Билл Гейтс", new Date(117, 1, 23));
            persons[1] = new User("Уоррен Баффет", new Date(99, 4, 31));
            persons[2] = new User("Джефф Безос", new Date(17, 11, 30));
            persons[3] = new User("Амансио Ортега", new Date(43, 10, 14));
            persons[4] = new User("Марк Цукерберг", new Date(72, 7, 10));
            persons[5] = new User("Карлос Слим", new Date(87, 11, 9));
            persons[6] = new User("Ларри Эллисон", new Date(86, 11, 8));
            persons[7] = new User("Чарльз Кох", new Date(82, 6, 18));
            persons[8] = new User("Майкл Блумберг", new Date(2091, 03, 23));
            persons[9] = new User("Бернар Арно", new Date(68, 6, 22));
            persons[10] = new User("Ларри Пейдж", new Date(93, 8, 28));
            persons[11] = new User("Сергей Брин", new Date(100, 2, 29));
            persons[12] = new User("Лилиан Бетанкур", new Date(89, 5, 13));
            persons[13] = new User("Джим Уолтон", new Date(77, 4, 17));
            persons[14] = new User("Элис Уолтон", new Date(65, 3, 16));
            persons[15] = new User("Ван Цзяньлинь", new Date(1962, 8, 22));
            persons[16] = new User("Ли Кашин", new Date(96, 4, 14));
            persons[17] = new User("Шелдон Адельсон", new Date(98, 9, 13));
            persons[18] = new User("Петр Петров", new Date(93, 10, 27));
            persons[19] = new User("Петр Петров", new Date(91, 1, 22));
   
        
        Comparator comparator = new PersonComparator();
        Sort sort = new BubbleSort();
   
        sort.sort(persons);
        sort.sort(strings);

        sort.sort(strings, comparator);
        comparator = comparator.reversed();
        sort.sort(strings, comparator);
    }
}
