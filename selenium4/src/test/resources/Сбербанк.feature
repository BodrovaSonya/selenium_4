#language: ru

  Функционал: Сбербанк страхование

    Сценарий: Заявка на страхование

      Когда выбран пункт меню "Застраховать себя  и имущество"
      Тогда получен вид страхования "Страхование путешественников"
      
      Когда выбран вид страхования - "Страхование путешественников"
      Тогда произведено ожидание заголовка
      И заголовок проверен по шаблону "Страхование путешественников"

      Когда выбирается оформление заявки онлайн
      Тогда произошла смена рабочего окна

      Когда выбрана сумма - "Минимальная"
      Тогда выбрано оформление заявки

      Когда заполняются поля:
      |фамилия застрахованного|Ivanov|
      |имя застрахованного|Ivan|
      |дата рождения застрахованного|01.01.1999|
      |фамилия|Петров|
      |имя|Петр|
      |отчество|Петрович|
      |день рождения||
      |серия паспорта|1234|
      |номер паспорта|222222|
      |дата выдачи|14.03.2009|
      |место выдачи|Трололо|
      И выбран пол "мужской"
      Тогда значения полей равны:
        |фамилия застрахованного|Ivanov|
        |имя застрахованного|Ivan|
        |дата рождения застрахованного|01.01.1999|
        |фамилия|Петров|
        |имя|Петр|
        |отчество|Петрович|
        |день рождения||
        |серия паспорта|1234|
        |номер паспорта|222222|
        |дата выдачи|14.03.2009|
        |место выдачи|Трололо|

      Когда выбрано продолжение оформления заявки
      Тогда появилось сообщение об ошибке "Заполнены не все обязательные поля"