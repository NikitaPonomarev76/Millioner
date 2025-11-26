
//todo сделать баланс отдельной переменной и что при правильном ответе прибавлялись ему деньги
//todo отредактируй красиво текст
//todo перефразируй некоторый вопросы, а то они сформулированы не очень
//todo перепиши код чтоб он выглядел красиво, добавь отдельную переменную которая будет
//  true если игра идет и false если ответил не правильно оттуда дальше и плеши, над условиями попробуй сам подумать
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("""
            
            
            """);
    System.out.println("   ИГРА МИЛЛИОНЕР");
    System.out.println("1 вопрос: ");
    System.out.println();
    int balance = 0;
    System.out.println("Какая самая высокая гора в мире?");

    System.out.println("1. Килиманджаро");
    System.out.println("2. Эльбрус");
    System.out.println("3. Мауна-Кеа");
    System.out.println("4. Эверест");
    System.out.print("Ответ: ");
    int answer = scanner.nextInt();
    boolean isgaming = true;
    if (answer == 4) {
        int balance1 = balance + 1000;
        System.out.println("Поздравляю вы ответили правильно");
        System.out.println("Ваш баланс ");





    }
    int answer1 = scanner.nextInt();
    if (answer == 1) {
        System.out.println("Вы ответили неправильно игра закончена");
    } else if (answer == 2) {
        System.out.println("Вы ответили неправильно игра закончена");
    } else if (answer == 3) {
        System.out.println("Вы ответили неправильно игра закончена");
    } else if (answer == 4) {
        int balance1 = balance + 1000;
        System.out.println("Вы ответили правильно");
        System.out.println("Ваш баланс: " + balance1 + "$");
        System.out.println();
        System.out.println("2 вопрос: ");
        System.out.println();
        System.out.println("Кто написал знаменитую пьесу Ромео и Джульетта?");

        System.out.println("1. Лев Толстой ");
        System.out.println("2. Уильям Шекспир ");
        System.out.println("3. Антон Чехов");
        System.out.println("4. Данте Алигьери");
        System.out.print("Ответ: ");
        int answer2 = scanner.nextInt();
        if (answer2 == 1) {
            System.out.println("Вы ответили неправильно игра закончена");
        } else if (answer2 == 3) {
            System.out.println("Вы ответили неправильно игра закончена");
        } else if (answer2 == 4) {
            System.out.println("Вы ответили неправильно игра закончена");
        } else if (answer2 == 2) {
            int balance2 = balance1 + 1000;
            System.out.println("Вы ответили правильно");
            System.out.println("Ваш баланс: " + balance2 + "$");
            System.out.println("""
                    3 вопрос:
                    
                    Какая страна является самой большой по площади в мире?
                    
                    1. Россия
                    2. Канада
                    3. Китай
                    4. США
                    """);
            System.out.print("Ответ: ");
            int answer3 = scanner.nextInt();
            if (answer3 == 2) {
                System.out.println("Вы ответили неправильно игра закончена");
            } else if (answer3 == 3) {
                System.out.println("Вы ответили неправильно игра закончена");
            } else if (answer3 == 4) {
                System.out.println("Вы ответили неправильно игра закончена");
            } else if (answer3 == 1) {
                int balance3 = balance2 + 1000;
                System.out.println("Вы ответили правильно");
                System.out.println("Ваш баланс: " + balance3 + "$");
                System.out.println("""
                        4 вопрос:
                       
                        Какой город является столицей Японии?
                        
                        1. Осака
                        2. Токио
                        3. Киото
                        4. Нагасаки
                        """);
                System.out.print("Ответ: ");
                int answer4 = scanner.nextInt();
                if (answer4 == 1) {
                    System.out.println("Вы ответили неправильно игра закончена");
                } else if (answer4 == 3) {
                    System.out.println("Вы ответили неправильно игра закончена");
                } else if (answer4 == 4) {
                    System.out.println("Вы ответили неправильно игра закончена");
                } else if (answer4 == 2) {
                    int balance4 = balance3 + 1000;
                    System.out.println("Вы ответили правильно");
                    System.out.println("Ваш баланс: " + balance4 + "$");
                    System.out.println("""
                            5 вопрос:
                            
                            Какой элемент периодической таблицы обозначается буквой "O"?
                            
                            1. Кислород
                            2. Озон
                            3. Олово
                            4. Осмий
                            """);
                    System.out.print("Ответ: ");
                    int answer5 = scanner.nextInt();
                    if (answer5 == 2) {
                        System.out.println("Вы ответили неправильно игра закончена");
                    } else if (answer5 == 3) {
                        System.out.println("Вы ответили неправильно игра закончена");
                    } else if (answer5 == 4) {
                        System.out.println("Вы ответили неправильно игра закончена");
                    } else if (answer5 == 1) {
                        int balance5 = balance4 + 1000;
                        System.out.println("Вы ответили правильно");
                        System.out.println("Ваш баланс: " + balance5 + "$");
                        System.out.println("""
                                6 вопрос:
                                
                                какой химический элемент в периодической таблице обозначается символом “Au”?
                                
                                1. Алюминий
                                2. Золото
                                3. Серебро
                                4. Медь
                                """);
                        System.out.print("Ответ: ");
                        int answer6 = scanner.nextInt();
                        if (answer6 == 1) {
                            System.out.println("Вы ответили неправильно игра закончена");
                        } else if (answer6 == 3) {
                            System.out.println("Вы ответили неправильно игра закончена");
                        } else if (answer6 == 4) {
                            System.out.println("Вы ответили неправильно игра закончена");
                        } else if (answer6 == 2) {
                            int balance6 = balance5 + 1000;
                            System.out.println("Вы ответили правильно");
                            System.out.println("Ваш баланс: " + balance6 + "$");
                            System.out.println("""
                                    7 вопрос:
                                    
                                    Кто автор романа "Война и мир"?
                                    
                                    1. Фёдор Достоевский
                                    2. Лев Толстой
                                    3. Михаил Лермонтов
                                    4. Антон Чехов
                                    """);
                            System.out.print("Ответ: ");
                            int answer7 = scanner.nextInt();
                            if (answer7 == 1) {
                                System.out.println("Вы ответили неправильно игра закончена");
                            } else if (answer7 == 3) {
                                System.out.println("Вы ответили неправильно игра закончена");
                            } else if (answer7 == 4) {
                                System.out.println("Вы ответили неправильно игра закончена");
                            } else if (answer7 == 2) {
                                int balance7 = balance6 + 1000;
                                System.out.println("Вы ответили правильно");
                                System.out.println("Ваш баланс: " + balance7 + "$");
                                System.out.println("""
                                        8 вопрос:
                                        
                                        Какое самое высокое здание в мире?
                                        
                                        1. Бурдж-Халифа
                                        2. Останкинская башня
                                        3. Эйфелева башня
                                        4. Шанхайская башня
                                        """);
                                System.out.print("Ответ: ");
                                int answer8 = scanner.nextInt();
                                if (answer8 == 2) {
                                    System.out.println("Вы ответили неправильно игра закончена");
                                } else if (answer8 == 3) {
                                    System.out.println("Вы ответили неправильно игра закончена");
                                } else if (answer8 == 4) {
                                    System.out.println("Вы ответили неправильно игра закончена");
                                } else if (answer8 == 1) {
                                    int balance8 = balance7 + 1000;
                                    System.out.println("Вы ответили правильно");
                                    System.out.println("Ваш баланс: " + balance8 + "$");
                                    System.out.println("""
                                            9 вопрос:
                                            
                                            Какая река является самой длинной в мире?

                                            1. Нил
                                            2. Амазонка
                                            3. Янцзы
                                            4. Миссисипи
                                            """);
                                    System.out.print("Ответ: ");
                                    int answer9 = scanner.nextInt();
                                    if (answer9 == 1) {
                                        System.out.println("Вы ответили неправильно игра закончена");
                                    } else if (answer9 == 3) {
                                        System.out.println("Вы ответили неправильно игра закончена");
                                    } else if (answer9 == 4) {
                                        System.out.println("Вы ответили неправильно игра закончена");
                                    } else if (answer9 == 2) {
                                        int balance9 = balance8 + 1000;
                                        System.out.println("Вы ответили правильно");
                                        System.out.println("Ваш баланс: " + balance9 + "$");
                                        System.out.println("""
                                                10 вопрос:
                                                
                                                Кто написал оперу "Кармен"?

                                                1. Джузеппе Верди
                                                2. Жорж Бизе
                                                3. Вольфганг Амадей Моцарт
                                                4. Рихард Вагнер
                                                """);
                                        System.out.print("Ответ: ");
                                        int answer10 = scanner.nextInt();
                                        if (answer10 == 1) {
                                            System.out.println("Вы ответили неправильно игра закончена");
                                        } else if (answer10 == 3) {
                                            System.out.println("Вы ответили неправильно игра закончена");
                                        } else if (answer10 == 4) {
                                            System.out.println("Вы ответили неправильно игра закончена");
                                        } else if (answer10 == 2) {
                                            int balance10 = balance9 + 1000;
                                            System.out.println("Вы ответили правильно");
                                            System.out.println("Ваш баланс: " + balance10 + "$");
                                            System.out.println();
                                            System.out.println("ПОЗДРАВЛЯЮ ВЫ ОТВЕТИЛИ НА ВСЕ ВОПРОСЫ ПРАВИЛЬНО ");


                                        }


                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

