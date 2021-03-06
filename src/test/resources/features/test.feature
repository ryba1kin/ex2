#language: ru
@all
Функция: Проверка сложения двух чисел

  @calc
  Структура сценария: Калькулятор
    Дано два числа: <a> и <b>
    Когда мы вычисляем сумму двух чисел
    Тогда результат равен: <result>
    Примеры:
      | a      | b     | result |
      | 2,0    | 3     | 5      |
      | -2,5   | -2,6  | -5,1   |
      | 0      | 0     | 0      |
      | -1,725 | 1,725 | 0      |
