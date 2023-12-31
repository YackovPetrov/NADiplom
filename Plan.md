# План автоматизации тестирования веб-сервиса для покупки тура

## Тестовые сценарии

### Позитивные сценарии:

#### №1 Покупка тура с активной банковской карты:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ Откроется страница для введения кода подтверждения из смс-сообщения или push-уведомления.


#### №2 Покупка тура в кредит с активной банковской карты:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ Откроется страница для введения кода подтверждения из смс-сообщения или push-уведомления.


### Негативные сценарии:

#### №1 Покупка тура с неактивной банковской карты:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4442`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ Появится валидационное сообщение "Ошибка! Банк отказал в проведении операции".


#### №2 Покупка тура в кредит с неактивной банковской карты":
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить в кредит`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4442`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ Появится валидационное сообщение "Ошибка! Банк отказал в проведении операции".


#### №3 Покупка тура с банковской карты без номера:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` не вводить данные.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `Номер карты`появится валидационное сообщение "Поле обязательно для заполнения".


#### №4 Покупка тура в кредит с банковской карты без номера:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` не вводить данные.
4. В поле `Месяц` ввести данные `12`.
5. В поле `Год` ввести данные `26`.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `Номер карты` появится валидационное сообщение "Поле обязательно для заполнения".


#### №5 Покупка тура с банковской карты с несуществующим номером:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `0000 0000 0000 0000`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `Номер карты` появится валидационное сообщение "Неверный формат".


#### №6 Покупка тура в кредит с банковской карты с несуществующим номером:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить в кредит`.
3. В поле `Номер карты` ввести данные `0000 0000 0000 0000`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `Номер карты` появится валидационное сообщение "Неверный формат".


#### №7 Покупка тура с банковской карты с пустым месяцем:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` не вводить данные.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `Месяц`появится валидационное сообщение "Поле обязательно для заполнения".


#### №8 Покупка тура в кредит с банковской карты с пустым месяцем:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` не вводить данные.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `Месяц`появится валидационное сообщение "Поле обязательно для заполнения".


#### №9 Покупка тура с банковской карты с несуществующим месяцем:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `13`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `Месяц`появится валидационное сообщение "Неверно указан срок действия карты".


#### №10 Покупка тура в кредит с банковской карты с несуществующим месяцем:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить в кредит`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `13`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `Месяц`появится валидационное сообщение "Неверно указан срок действия карты".


#### №11 Покупка тура с банковской карты с месяцем 00:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `00`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `Месяц`появится валидационное сообщение "Неверно указан срок действия карты".


#### №12 Покупка тура в кредит с банковской карты с месяцем 00:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить в кредит`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `00`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `Месяц`появится валидационное сообщение "Неверно указан срок действия карты".


#### №13 Покупка тура с банковской карты с пустым годом:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` не вводить данные.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `Год`появится валидационное сообщение "Поле обязательно для заполнения".


#### №14 Покупка тура в кредит с банковской карты с пустым годом:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` не вводить данные.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `Год`появится валидационное сообщение "Поле обязательно для заполнения".


#### №15 Покупка тура с банковской карты с прошедшим годом:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `22`.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `Год`появится валидационное сообщение "Истёк срок действия карты".


#### №16 Покупка тура в кредит с банковской карты с прошедшим годом:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `22`.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `Год`появится валидационное сообщение "Истёк срок действия карты".


#### №17 Покупка тура с банковской карты с годом 00:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `00`.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `Год`появится валидационное сообщение "Неверно указан срок действия карты".


#### №18 Покупка тура в кредит с банковской карты с годом 00:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `00`.
6. В поле `Владелец` ввести данные `Petrov Yakov`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `Год`появится валидационное сообщение "Неверно указан срок действия карты".


#### №19 Покупка тура с банковской карты с незаполненным именем:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Петров Яков`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `Владелец` появится валидационное сообщение "Поле обязательно для заполнения".


#### №20 Покупка тура в кредит с банковской карты с незаполненным именем:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` не вводить данные.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `Владелец`появится валидационное сообщение "Поле обязательно для заполнения".


#### №21 Покупка тура с банковской карты с именем на кириллице:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Петров Яков`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ Поле `Владелец`не принимает символы на кириллице и под полем появится валидационное сообщение "Данные введены в неверном формате".


#### №22 Покупка тура в кредит с банковской карты с именем на кириллице:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Петров Яков`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ Поле `Владелец`не принимает символы на кириллице и под полем появится валидационное сообщение "Данные введены в неверном формате".

#### №23 Покупка тура с банковской карты с именем на арабском":
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `بتروف ياكوف`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ Поле `Владелец` не принимает символы на арабском и под полем появится валидационное сообщение "Данные введены в неверном формате".


#### №24 Покупка тура в кредит с банковской карты с именем на арабском:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `بتروف ياكوف`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ Поле `Владелец` не принимает символы на арабском и под полем появится валидационное сообщение "Данные введены в неверном формате".


#### №25 Покупка тура с банковской карты с именем китайскими иероглифами:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `彼得罗夫·雅科夫`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ Поле `Владелец` не принимает символы китайскими иероглифами и под полем появится валидационное сообщение "Данные введены в неверном формате".


#### №26 Покупка тура в кредит с банковской карты с именем китайскими иероглифами:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `彼得罗夫·雅科夫`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ Поле `Владелец` не принимает символы китайскими иероглифами и под полем появится валидационное сообщение "Данные введены в неверном формате".


#### №27 Покупка тура с банковской карты с именем из спецсимволов:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `*(;№)!`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ Поле `Владелец` не принимает специальные символы и под полем появится валидационное сообщение "Данные введены в неверном формате".


#### №28 Покупка тура в кредит с банковской карты с именем из спецсимволов:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `*(;№)!`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ Поле `Владелец` не принимает специальные символы и под полем появится валидационное сообщение "Данные введены в неверном формате".


#### №29 Покупка тура с банковской карты с именем из цифр:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `1234567890`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ Поле `Владелец` не принимает специальные символы и под полем появится валидационное сообщение "Данные введены в неверном формате".   


#### №30 Покупка тура в кредит с банковской карты с именем из цифр:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `1234567890`.
7. В поле `CVC/CVV` ввести данные `123`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ Поле `Владелец` не принимает специальные символы и под полем появится валидационное сообщение "Данные введены в неверном формате".


#### №31 Покупка тура с банковской карты с незаполненным CVC/CVV":
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Петров Яков`.
7. В поле `CVC/CVV` не вводить данные.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `CVC/CVV` появится валидационное сообщение "Поле обязательно для заполнения".


#### №32 Покупка тура в кредит с банковской карты с незаполненным CVC/CVV":
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Петров Яков`.
7. В поле `CVC/CVV` не вводить данные.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `CVC/CVV` появится валидационное сообщение "Поле обязательно для заполнения".


#### №33 Покупка тура с банковской карты с CVC/CVV на 000:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Петров Яков`.
7. В поле `CVC/CVV` ввести данные `000`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `CVC/CVV` появится валидационное сообщение "Поле обязательно для заполнения".


#### №34 Покупка тура в кредит с банковской карты с CVC/CVV на 000:
1. В браузере открыть http://localhost:8080/.
2. Нажать на кнопку `Купить`.
3. В поле `Номер карты` ввести данные `4444 4444 4444 4441`.
4. В поле `Месяц` ввести данные `09`.
5. В поле `Год` ввести данные `24`.
6. В поле `Владелец` ввести данные `Петров Яков`.
7. В поле `CVC/CVV` ввести данные `000`.
8. Нажать на кнопку `Продолжить`.
   _Ожидаемый результат:_ В поле `CVC/CVV` появится валидационное сообщение "Поле обязательно для заполнения".


## Перечень используемых инструментов:

- #### Браузер Chrome.
  Один из наиболее популярных веб-браузеров, который широко используется для тестирования веб-приложений. С помощью Selenium WebDriver и Selenide можно взаимодействовать с Chrome и выполнять автоматизированные тесты в этом браузере.
- #### GitHub.
  Обеспечивает централизованное хранение и контроль версий кода, что позволяет легко совместно работать над проектом. Предоставляет возможность отслеживать изменения, создавать задачи и исправлять ошибки через pull requests, создавать issue при обнаружении багов. Имеет возможности для автоматической интеграции с CI системами и автоматического запуска тестов при изменении кода.
- #### Интегрированная среда разработки (IDE): IntelliJ IDEA.
  IntelliJ IDEA является мощной и удобной IDE для разработки на Java. Она предоставляет широкие возможности для написания, отладки и управления проектами.
- #### Язык программирования: Java.
  Java широко используется в автоматизации тестирования и имеет обширные возможности для работы с Selenide.
- #### Фреймворк автоматизации: Selenide.
  это инструмент, используемый для автоматизированного тестирования и созданный для решения проблем Ajax/Timeouts.
- #### Фреймворк тестирования JUnit.
  Популярные и гибкие фреймворки для автоматизированного тестирования, который обеспечивают возможность создания и выполнения тестовых сценариев, управления данными и проверки ожидаемых результатов.
- #### Сборщик проектов: Gradle.
  Мощный инструмент для автоматизации сборки, тестирования и развертывания проектов. Gradle позволяет эффективно управлять зависимостями и конфигурацией проекта.
- #### Контейнеризация: Docker.
  Платформа для контейнеризации приложений, которая позволяет упаковать приложение и его зависимости в легковесные и переносимые контейнеры. Docker облегчает развертывание и масштабирование тестовой инфраструктуры. В зависимости от необходимости и возможностей тестирования, может потребоваться доступ к базе данных для проверки ожидаемых результатов или извлечения тестовых данных.
- #### Контейнер MySQL на платформе Docker:
  Это легковесные и автономные исполняемые пакеты, которые включают все необходимое для работы приложения, включая код, среду выполнения, системные инструменты, библиотеки и настройки.
- #### PostgresSQL:
  является мощной и надежной СУБД, которая предлагает множество возможностей и гибкость для разработки и управления данными. Он широко используется в различных сферах, включая веб-приложения, аналитические базы данных, геоинформационные системы и др.
- #### Программная платформа Node.js:
  Богатая экосистема: С большим количеством пакетов и модулей, предоставляемых менеджером пакетов npm (Node Package Manager), разработчики могут быстро разрабатывать и внедрять новые функциональности для своих приложений.
- #### Плагины и дополнительные инструменты:
- Faker: Библиотека, которая позволяет генерировать случайные и реалистичные тестовые данные. Faker может быть использован для заполнения формы тестовыми данными, создания мок-объектов и других сценариев, требующих генерации данных.
- Lombok: Библиотека для упрощения разработки Java-кода путем автоматической генерации геттеров, сеттеров, конструкторов и других рутинных операций. Lombok позволяет сократить объем кода и улучшить читаемость.
- Allure: Фреймворк для создания красивых отчетов о тестировании, который интегрируется с различными инструментами автоматизации.

## Возможные риски при автоматизации

- Отсутствие тестовых меток в селекторах.Если селекторы основаны только на разметке и структуре элементов, то любые изменения в интерфейсе, такие как изменение CSS-классов, идентификаторов или иерархии элементов, могут привести к неправильному нахождению элементов тестами. Это может вызвать сбои автоматизации и требовать постоянного обновления селекторов после каждого изменения интерфейса.
- Зависимость от сторонних сервисов: Ваше веб-приложение может зависеть от внешних систем, таких как банковские сервисы (Payment Gate, Credit Gate) в вашем примере. Производя тестирование, необходимо учесть их доступность и правильность работы, иначе тесты могут дать неоднозначные результаты.
- Неправильная настройка и поддержка инструментов автоматизации: Для реализации автоматического тестирования используются различные инструменты, такие как Selenium или JUnit. Ошибка в их настройке может привести к неправильной работе тестов и ложным результатам.

## Перечень необходимых специалистов для автоматизации:

- QA-инженер автоматизации тестирования веб-приложений.

## Интервальная оценка с учётом рисков в часах

- При наличии возможных рисков, количество рабочих часов варьируется от 80 до 120 рабочих часов.

#### Ориентировочные даты сдачи работы:

- 18 сентября - 25 сентября