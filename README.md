# Калькулятор

### Числа

Принимает строку по шаблону и выдаёт результат выполнения операции над числами:

`<число> <операция> <число>`

`<результат>`

Пример:

`1 + 1`
`2.0`

Может принимать традиционные числа, римские числа, слова числительные на английском
прмеры:

Римские числа:
`V + V`
`10.0`

Числительные на английском:
`ten + ten`
`20.0`

При вводе чисел разных типов, выдаёт ошибку
`seven + 3`
`error`

Но можно это убрать, просто закомментировав одну строчку кода в методе ClientData.requestData()

### Операции

При не известной операции выдаёт ошибку:
`1 # 2`
`error`

#### Сложение

Операторы: `plus`, `+`
пример:

`1 + 1`

или

`1 plus 1`

результат:

`2.0`

#### Вычитание

Операторы: `minus`, `-`
пример:

`1 - 1`

или

`1 minus 1`

результат:

`0.0`

#### Умножение

Операторы: `mul`, `*`
пример:

`1 * 1`

или

`1 mul 1`

результат:

`1.0`

#### Деление

Операторы: `div`, `/`
пример:

`1 / 1`

или

`1 div 1`

результат:

`1.0`

#### Возведение в степень

Операторы: `pow`, `**`
пример:

`1 ** 1`

или

`1 pow 1`

результат:

`1.0`

#### Корень n-ой степени из числа

Операторы: `root`
пример:

`1 root 1`

результат:

`1.0`

#### Расширения

Чтобы добавить числовой тип, необходимо в перечислении TypeNumber добавить константу передав строкове (человеческое) значение этого типа:
~~~~
ROM("Римская чифра")
~~~~

Чтобы добавить число, небходимо в перечслении Number добавить константу, передав её значение, строковое обозначение и числовой тип:

~~~~
ROM_FIVE(5, "V", TypeNumber.ROM)
~~~~

Чтобы добавить операцию, необходимо расширить абстрактный класс Operation, передав в конструктор супер класса строковые обозначения данной операции и реализовав метод
~~~~
public float toCalc(int a, int b);`
~~~~
Пример:
~~~~
package testtask.operations;

public class Pow extends Operation {
    public Pow() {
        super("**", "pow");
    }

    @Override
    public float toCalc(int a, int b) {
        return (float) Math.pow(a, b);
    }
}
~~~~
После этого нужно добавить экземпляр реализованного класса в массив operations класса Program

~~~~
static Operation[] operations = {
            ...
            new Pow()
};
~~~~
