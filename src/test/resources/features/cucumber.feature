Feature: : Тесты для 8 урока

  Background:  Мы находимся на странице
    Given Открываем сайт 'https://the-internet.herokuapp.com'

    Scenario: Перейти на страницу с Флажками,нажать чекбокс, проверить, что нажат
      Given  Переходим на страницу с флажками
      When  Нажимаем на фалжок
      Then  Проверяем что флажок нажат

  Scenario Outline: Добавление и удаление элементов
    Given Переходим на страницу с добавлением и удалением элементов
    When Нажимаем кнопку Add Element '3' раза
    Then На странице отображается новый элемент, проверяем
    When Нажимаем кнопку "Delete"
    Then Элемент что элемент  удален со страницы
    Examples:

