package by.it.kharitonenko.jd02_01.Interfaces;
// Напишите программу, моделирующую поток покупателей Buyer в магазине.
// Каждую секунду в магазин приходят от 0 до 2 новых покупателей в течение двух минут.
// Каждый покупатель реализует интерфейс IBuyer
// Каждый покупатель реализовал интерфейс IUseBacket
// У каждого покупателя с корзиной (Backet) собирается набор от 1..4 товаров (Good) из
//фиксированного списка с ценой (рекомендуется hashmap, где товар – key, цена – value).
// Время на каждую операцию от 0,5 до 2 секунд, итог операции – в консоль.

// Покупатели отличались, примерно каждый четвертый – пенсионер (для этого добавьте поле
//boolean pensioner). Предусмотрите, что у такого покупателя все операции в среднем в 1,5
//раза медленнее.
// Общее число покупателей в магазине плавно изменялось - около 10 в начале каждой минуты и
//от 30 до 40 в середине каждой минуты (т.е. первые 30 секунд в минуте добавляйте каждую
//секунду от 0 до ??? покупателей так, чтобы всего их было N>=t+10, а вторые 30 секунд
//впускайте новых только если N<=40+(30-t). t – это текущая секунда. Всего вход открыт две
//минуты.
public interface IBuyer {
    void enterToMarket(); //вошел в магазин (мгновенно)

    void chooseGoods(); //выбрал товар (от 0,5 до 2 секунд)

    void goOut(); //отправился на выход(мгновенно)
}
