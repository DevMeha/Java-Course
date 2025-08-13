package Chall;

public class chal_v7 {
    public static boolean hasTeen(int firstNumber, int secondNumber, int lastNumber) {
        if ((firstNumber >= 13 && firstNumber <= 19) || (secondNumber >= 13 && secondNumber <= 19) || (lastNumber >= 13 && lastNumber <= 19)) {

            return true;


        } else {


            return false;
        }


    }


    public static boolean isTeen(int number) {

        if (number >= 13 && number <= 19) {

            return true;
        } else {

            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(hasTeen(4, 2, 15));
        System.out.println(isTeen(18));
    }
}



/*
Zadanie: Sprawdzanie liczby „nastolatka” (Teen Number Checker)

Założenia:
- Liczbę uznajemy za „teen” (nastolatka), jeśli mieści się w zakresie od 13 do 19 (włącznie).

1. Napisz metodę o nazwie hasTeen z trzema parametrami typu int: firstNumber, secondNumber, lastNumber.
   - Metoda ma zwracać wartość typu boolean.
   - Powinna zwrócić true, jeśli chociaż jeden z trzech parametrów mieści się w zakresie 13–19 (włącznie).
   - W przeciwnym razie powinna zwrócić false.

Przykłady:
hasTeen(9, 99, 19);    → true (bo 19 jest w zakresie 13–19)
hasTeen(23, 15, 42);   → true (bo 15 jest w zakresie 13–19)
hasTeen(22, 23, 34);   → false (żadna liczba nie jest w zakresie 13–19)

2. Napisz drugą metodę o nazwie isTeen z jednym parametrem typu int: number.
   - Metoda ma zwracać wartość typu boolean.
   - Powinna zwrócić true, jeśli liczba mieści się w zakresie 13–19 (włącznie).
   - W przeciwnym razie powinna zwrócić false.

Przykłady:
isTeen(9);   → false (9 nie mieści się w zakresie 13–19)
isTeen(13);  → true  (13 mieści się w zakresie 13–19)

Uwagi:
- Wszystkie metody mają być public static.
- Nie dodawaj metody main w kodzie rozwiązania.
*/