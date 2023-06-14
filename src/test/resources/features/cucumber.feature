Feature: : Тесты для 8 урока

  Background:  Мы находимся на странице
    Given Открываем сайт 'https://the-internet.herokuapp.com'

  Scenario: Перейти на страницу с Флажками,нажать чекбокс, проверить, что нажат
    Given  Переходим на страницу 'Checkboxes'
    When  Нажимаем на фалжок
    Then  Проверяем что флажок нажат

  Scenario Outline: Добавление и удаление элементов
    Given Переходим на страницу 'Add/Remove Elements'
    When Нажимаем кнопку Add Element '<clicks>' раз
    Then На странице отображается новый элемент, проверяем что их количество равно '<clicks>'
    When Нажимаем кнопку Delete '<delete>' раз
    Then Проверяем что элемент удален и осталось элементов '<remainder>'
    Examples:
      | clicks | delete | remainder |
      | 3      | 2      | 1         |

  Scenario: Тестирование страницы динамической загрузки
    Given Переходим на страницу 'Dynamic Loading'
    When перехожу на страницу Example 2 и нажимаю кнопку 'Start'
    Then должен увидеть сообщение 'Hello World!'

  Scenario: Вход с правильными учетными данными
    Given Переходим на страницу 'Form Authentication'
    When ввожу 'tomsmith' в поле 'username'
    And ввожу 'SuperSecretPassword!' в поле 'password'
    When нажимаю кнопку 'Login'
    Then вижу сообщение об успешном входе

  Scenario: Проверка функциональности наведения
    Given Переходим на страницу 'Hovers'
    When Навожу курсор на аватар пользователя 1
    Then Должен увидеть имя пользователя 'user1'

  Scenario: Проверка функциональности нажатия клавиш
    Given Переходим на страницу 'Key Presses'
    When нажимаю клавишу 'SPACE'
    Then должен увидеть результат 'You entered: SPACE'