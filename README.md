## Задача

1) *Написать приложение на SpringBoot, которое принимает GET параметры для сообщения: title и text и отображает их на html странице*.

### Например

По адресу http://127.0.0.1:1992 отправляем параметры:
- Текст (asdf)
- Оглавление (test)

Получаем:

|id  | text  | title |       
|----|-------|-------|
| 1  |asdf   |test   |

2) *Добавить функционал который добавляет сообщение в базу данных и выводит список сообщений из базы*.

### Например

По адресу http://127.0.0.1:1992 отправляеи параметры:
- Текст (qwer)
- Оглавление (test3)

Получаем:

|id  | text  | title |       
|----|-------|-------|
| 1  |asdf   |test   |
| 2  |yxcv   |test2  |
| 3  |qwer   |test3  |