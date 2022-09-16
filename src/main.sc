theme: /

    state: newNode_26
        if: $session.lastSeen<600
            go!: /newNode_31
        else:
            go!: /newNode_24

    state: newNode_24
        a: Здравствуйте! Чем я могу вам помочь?
        go!: /newNode_25
    @IntentGroup
        {
          "global" : true,
          "boundsTo" : "/newNode_24",
          "actions" : [ {
            "buttons" : [ {
              "name" : "Меры поддержки",
              "transition" : "/newNode_20"
            }, {
              "name" : "Факторинг",
              "transition" : "/newNode_23"
            }, {
              "name" : "Московский акселератор",
              "transition" : "",
              "url" : "https://i.moscow/moskovskiy-akselerator"
            }, {
              "name" : "Поиск партнеров",
              "transition" : "",
              "url" : "https://login.mos.ru/sps/login/methods/password?bo=%2Fsps%2Foauth%2Fae%3Fprompt%3Dlogin%26scope%3Dopenid%2Bprofile%2Bcontacts%26state%3Dc18b915f098eae793375c479b962431f%26response_type%3Dcode%26approval_prompt%3Dauto%26redirect_uri%3Dhttps%3A%2F%2Fi.moscow%252Fauth%252Fcheck%26client_id%3Di.moscow"
            } ],
            "type" : "buttons"
          } ]
        }
    state: newNode_25
        state: 1
            e!: Мне нужна помощь

            go!: /newNode_16

        state: 2
            q!: $HELLO

            go!: /newNode_16
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_25",
                name: "newNode_25 buttons",
                handler: function($context) {
                  $reactions.buttons([
                    {text: "Меры поддержки"
                    , transition: "/newNode_20"
                    },
                    {text: "Факторинг"
                    , transition: "/newNode_23"
                    },
                    {text: "Московский акселератор"
                    , url: "https://i.moscow/moskovskiy-akselerator"
                    },
                    {text: "Поиск партнеров"
                    , url: "https://login.mos.ru/sps/login/methods/password?bo=%2Fsps%2Foauth%2Fae%3Fprompt%3Dlogin%26scope%3Dopenid%2Bprofile%2Bcontacts%26state%3Dc18b915f098eae793375c479b962431f%26response_type%3Dcode%26approval_prompt%3Dauto%26redirect_uri%3Dhttps%3A%2F%2Fi.moscow%252Fauth%252Fcheck%26client_id%3Di.moscow"
                    },
                  ]);
                }
            });

    state: newNode_16
        go!: /newNode_19

    state: newNode_19
        InputText:
            prompt = Какой у вас вопрос?
            varName = text
            then = /newNode_33

    state: newNode_20
        a:  Льготное кредитование договоров факторинга
            Компенсация части затрат на транспортировку продукции
            Компенсация затрат на патентование за рубежом
            Больше: https://i.moscow/measure-supports/lending
        # Transition /newNode_12
        go!: /newNode_31

    state: newNode_23
        a: https://i.moscow/faktoring-dlya-biznesa
        # Transition /newNode_13
        go!: /newNode_31

    state: newNode_18
        if: $session.text=FAQ
            go!:

    state: newNode_33
        a: Уточните, пожалуйста, ваш вопрос
        # Transition /newNode_15
        go!: /newNode_31

    state: newNode_14
        if: $session.text=$session.FAQ
            go!:

    state: newNode_31
        a: У вас есть еще вопросы?
        go!: /newNode_32
    @IntentGroup
        {
          "global" : true,
          "boundsTo" : "/newNode_31",
          "actions" : [ {
            "buttons" : [ {
              "name" : "Меры поддержки",
              "transition" : "/newNode_20"
            }, {
              "name" : "Факторинг",
              "transition" : "/newNode_23"
            }, {
              "name" : "Московский акселератор",
              "transition" : "",
              "url" : "https://i.moscow/moskovskiy-akselerator"
            }, {
              "name" : "Поиск партнеров",
              "transition" : "",
              "url" : "https://login.mos.ru/sps/login/methods/password?bo=%2Fsps%2Foauth%2Fae%3Fprompt%3Dlogin%26scope%3Dopenid%2Bprofile%2Bcontacts%26state%3Dc18b915f098eae793375c479b962431f%26response_type%3Dcode%26approval_prompt%3Dauto%26redirect_uri%3Dhttps%3A%2F%2Fi.moscow%252Fauth%252Fcheck%26client_id%3Di.moscow"
            } ],
            "type" : "buttons"
          } ]
        }
    state: newNode_32
        state: 1
            q!: $NEGATION

            go!: /newNode_30

        state: 2
            q!: $THANKS

            go!: /newNode_30

        state: 3
            q!: $PARTING

            go!: /newNode_30

        state: 4
            q!: $AGREEMENT

            go!: /newNode_16
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_32",
                name: "newNode_32 buttons",
                handler: function($context) {
                  $reactions.buttons([
                    {text: "Меры поддержки"
                    , transition: "/newNode_20"
                    },
                    {text: "Факторинг"
                    , transition: "/newNode_23"
                    },
                    {text: "Московский акселератор"
                    , url: "https://i.moscow/moskovskiy-akselerator"
                    },
                    {text: "Поиск партнеров"
                    , url: "https://login.mos.ru/sps/login/methods/password?bo=%2Fsps%2Foauth%2Fae%3Fprompt%3Dlogin%26scope%3Dopenid%2Bprofile%2Bcontacts%26state%3Dc18b915f098eae793375c479b962431f%26response_type%3Dcode%26approval_prompt%3Dauto%26redirect_uri%3Dhttps%3A%2F%2Fi.moscow%252Fauth%252Fcheck%26client_id%3Di.moscow"
                    },
                  ]);
                }
            });

    state: newNode_21
        TransferToOperator:
            sendHistory = false
            openChatButton = Чат с оператором
            errorState = /newNode_22
            messageToOperator = Здравствуйте! Мне нужна консультация
            messageToUser = Перевожу диалог на оператора
            chatClosedOperatorState = 

    state: newNode_30
        a: Хорошего дня!
        go!: /newNode_17

    state: newNode_17
        EndSession:

    state: newNode_22
        SendContact:
            clientName = Ваше имя
            email = Ваш Email
            phone = Ваш номер телефона
            then =