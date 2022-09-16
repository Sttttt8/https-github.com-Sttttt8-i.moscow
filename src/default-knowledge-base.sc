theme: /
    state:
        e!: Московский акселератор
        e!: Условия участия в Московском акселераторе
        e!: Что такое Московский акселератор
        a: https://i.moscow/moskovskiy-akselerator
        script:
            $temp.backWay = Zenflow.getBack();
        go!: {{ $temp.backWay }}
    state:
        e!: Помещения в аренду
        e!: Поиск помещения для аренды
        e!: Сдача помещения в аренду
        e!: Как арендовать помещение?
        a: https://i.moscow/lending-pomeshcheniy-v-arendu
        script:
            $temp.backWay = Zenflow.getBack();
        go!: {{ $temp.backWay }}
    state:
        e!: Калькулятор мер поддержки
        e!: Рассчет суммы поддержки
        e!: Расчет размера субсидий
        e!: Рассчитать меры поддержки
        e!: Расчет мер поддержки
        a: https://i.moscow/measure-supports/calculator
        script:
            $temp.backWay = Zenflow.getBack();
        go!: {{ $temp.backWay }}
    state:
        e!: Какие есть меры поддержки?
        e!: Меры поддержки бизнеса
        e!: Поддержка бизнеса
        a: Льготное кредитование договоров факторинга
            Компенсация части затрат на транспортировку продукции
            Компенсация затрат на патентование за рубежом
            Больше: https://i.moscow/measure-supports/lending
        script:
            $temp.backWay = Zenflow.getBack();
        go!: {{ $temp.backWay }}
