public class Main {
    public static void main(String[] args) {

        // Задание 1
        int ageAsIs = 17;
        int ageNeed = 18;
        if (ageAsIs >= ageNeed) {

            System.out.println("Если возраст человека " + ageAsIs + " он достиг совершеннолетия");
        } else {
            System.out.println("Если возраст человека " + ageAsIs + " он не достиг совершеннолетия, нужно немного подождать.");
        }

        // Задание 2

        int temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        // Задание 3

        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно.");
        }

        // Задание 4

        int age = 24;

        if (age >= 2 && age <= 6) {
            System.out.println("Возраст человека " + age + " то ему нужно ходить в десткий сад");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Возраст человека " + age + " то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Возраст человека " + age + " то ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Возраст человека " + age + " то ему нужно ходить на работу");
        }


        // Задание 5

        int ageChild = 14;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + " то ему нельзя кататься на атракционе");
        }
        if (ageChild >= 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + " то ему можно кататься в сопровождении. Если взрослого нет, то кататься нельзя.");
        }
        if (ageChild >= 14) {
            System.out.println("Возраст ребенка " + ageChild + "  ему можно кататься без сопровождения.");
        }


        // Задание 6
        int all = 102;
        int sitting = 60;
        int standing = all - sitting;

        int soldSitting = 60; //Калькулятор
        int soldStanding = 41; //Калькулятор
        int allSold = soldSitting + soldStanding;

        if (all <= allSold) {
            System.out.println("Мест нет");
        } else {
            System.out.println("Места есть");
        }

        int sittingLeft = sitting - soldSitting;
        if (sittingLeft <= 0) {
            System.out.println("Сидячих мест нет");
        } else System.out.println("Сидячих мест " + sittingLeft);
        int standingLeft = standing - soldStanding;
        if (standingLeft <= 0) {
            System.out.println("Стоячих мест нет");
        } else System.out.println("Стоячих мест " + standingLeft);


        // Задание 7
        //надо несколько условий,
        // где первое сравнивается со вторым и третьим,
        // второе с первым и третьим,
        // третье с первым и вторым.
        // Одно из этих условий должно быть истинным, соотвественно выведется нужное сообщение

        int one = 1;
        int two = 2;
        int three = 3;

        boolean compare1 = one > two && one > three;
        boolean compare2 = two < one && two > three;
        boolean compare3 = three > two && three > one;

        if (compare1) {
            System.out.println("один больше двух");
        }
        if (compare2) {
            System.out.println("два больше трёх");
        } else System.out.println("три самое большое");

    }
}