void main() {
    Scanner scanner = new Scanner(System.in);
    boolean isgaming = true;
    int balance = 0;
    System.out.println();
    System.out.println("""
            ======================================
                      ИГРА МИЛЛОНЕР
            ======================================
            """);
    System.out.println("🔹 ВОПРОС 1 🔹 ");
    System.out.println();
    System.out.println("""
            Какая самая высокая гора в мире?
            
            1. Килиманджаро
            2. Эльбрус
            3. Мауна-Кеа
            4. Эверест
            
            5. Выбрать подсказку:
            
            """);
    System.out.print("Ответ: ");
    int answer1 = scanner.nextInt();
    int hint = 0;
    int hint1 = 0;
    int hint2 = 0;
    int hint3 = 0;
    if (answer1 == 4) {
        balance += 1000;
        System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
        System.out.println();
        System.out.println("💰 " + "Ваш баланс: " + balance + "$");
    } else if (answer1 == 5) {
        System.out.println("1. 50/50");
        System.out.println("2. Помощь зала");
        System.out.println("3. Звонок другу");
        System.out.println();
        System.out.print("Выбор подсказки: ");
        hint = scanner.nextInt();

        if (hint == 1) {
            System.out.println("1. Эльбрус");
            System.out.println("2. Эверест");
            System.out.print("Ответ: ");
            hint1 = scanner.nextInt();
            if (hint1 == 2) {
                balance += 1000;
                System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                System.out.println();
                System.out.println("💰 " + "Ваш баланс: " + balance + "$");
            } else {
                System.out.println("НЕПРАВИЛЬНО");
                isgaming = false;
            }
        } else if (hint == 2) {
            System.out.println();
            System.out.println("Зал подсказывает: 4. Эверест ");
            System.out.println();
            System.out.print("Ответ: ");
            hint2 = scanner.nextInt();
            if (hint2 == 4) {
                balance += 1000;
                System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                System.out.println();
                System.out.println("💰 " + "Ваш баланс: " + balance + "$");
            } else {
                System.out.println("НЕПРАВИЛЬНО");
                isgaming = false;
            }
        } else if (hint == 3) {
            System.out.println("Друг подсказывает: 4. Эверест ");
            System.out.println();
            System.out.print("Ответ: ");
            hint3 = scanner.nextInt();
            if (hint3 == 4) {
                balance += 1000;
                System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                System.out.println();
                System.out.println("💰 " + "Ваш баланс: " + balance + "$");
            } else {
                System.out.println("НЕПРАВИЛЬНО");
                isgaming = false;
            }
        }
    } else {
        System.out.println("НЕПРАВИЛЬНО");
        isgaming = false;
    }

    if (isgaming) {
        System.out.println("🔹 ВОПРОС 2 🔹 ");
        System.out.println();
        System.out.println("""
                Кто написал знаменитую пьесу "Ромео и Джульетта"?
                
                1. Лев Толстой
                2. Уильям Шекспир
                3. Антон Чехов
                4. Данте Алигьери
                
                5. Выбрать подсказку:
                """);
        System.out.print("Ответ:");
        int answer2 = scanner.nextInt();
        if (answer2 == 2) {
            balance += 1000;
            System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
            System.out.println();
            System.out.println("💰 " + "Ваш баланс: " + balance + "$");
        } else if (answer2 == 5) {
            System.out.println("1. 50/50");
            System.out.println("2. Помощь зала");
            System.out.println("3. Звонок другу");
            System.out.println();
            System.out.print("Выбор подсказки: ");
            hint = scanner.nextInt();

            if (hint == 1) {
                System.out.println("1. Лев толстой");
                System.out.println("2. Уильям Шекспир");
                System.out.print("Ответ: ");
                hint1 = scanner.nextInt();
                if (hint1 == 2) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            } else if (hint == 2) {
                System.out.println();
                System.out.println("Зал подсказывает: 2. Уильям Шекспир ");
                System.out.println();
                System.out.print("Ответ: ");
                hint2 = scanner.nextInt();
                if (hint2 == 2) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            } else if (hint == 3) {
                System.out.println("Друг подсказывает: 2. Уильям Шекспир");
                System.out.println();
                System.out.print("Ответ: ");
                hint3 = scanner.nextInt();
                if (hint3 == 2) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            }

        } else {
            System.out.println("НЕПРАВИЛЬНО");
            isgaming = false;
        }
    }


    if (isgaming) {
        System.out.println("🔹 ВОПРОС 3 🔹 ");
        System.out.println();
        System.out.println("""
                Какая страна является самой большой  в мире?
                
                1. Россия
                2. Канада
                3. Китай
                4. США
                
                5. Выбрать подсказку:
                """);
        System.out.print("Ответ: ");
        int answer3 = scanner.nextInt();
        if (answer3 == 1) {
            balance += 1000;
            System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
            System.out.println();
            System.out.println("💰 " + "Ваш баланс: " + balance + "$");
        } else if (answer3 == 5) {
            System.out.println("1. 50/50");
            System.out.println("2. Помощь зала");
            System.out.println("3. Звонок другу");
            System.out.println();
            System.out.print("Выбор подсказки: ");
            hint = scanner.nextInt();

            if (hint == 1) {
                System.out.println("1. Россия");
                System.out.println("2. Канада");
                System.out.print("Ответ: ");
                hint1 = scanner.nextInt();
                if (hint1 == 1) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            } else if (hint == 2) {
                System.out.println();
                System.out.println("Зал подсказывает: 1. Россия ");
                System.out.println();
                System.out.print("Ответ: ");
                hint2 = scanner.nextInt();
                if (hint2 == 1) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            } else if (hint == 3) {
                System.out.println("Друг подсказывает: 1. Россия");
                System.out.println();
                System.out.print("Ответ: ");
                hint3 = scanner.nextInt();
                if (hint3 == 1) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            }

        } else {
            System.out.println("НЕПРАВИЛЬНО");
            isgaming = false;
        }
    }
    if (isgaming) {
        System.out.println("🔹 ВОПРОС 4 🔹 ");
        System.out.println();
        System.out.println("""
                Какой город является столицей Японии?
                
                1. Осака
                2. Токио
                3. Киото
                4. Нагасаки
                
                5. Выбрать подсказку:
                """);
        System.out.print("Ответ: ");
        int answer4 = scanner.nextInt();
        if (answer4 == 2) {
            balance += 1000;
            System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
            System.out.println();
            System.out.println("💰 " + "Ваш баланс: " + balance + "$");
        } else if (answer4 == 5) {
            System.out.println("1. 50/50");
            System.out.println("2. Помощь зала");
            System.out.println("3. Звонок другу");
            System.out.println();
            System.out.print("Выбор подсказки: ");
            hint = scanner.nextInt();

            if (hint == 1) {
                System.out.println("1. Токио");
                System.out.println("2. Нагасаки");
                System.out.print("Ответ: ");
                hint1 = scanner.nextInt();
                if (hint1 == 1) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            } else if (hint == 2) {
                System.out.println();
                System.out.println("Зал подсказывает: 2. Токио ");
                System.out.println();
                System.out.print("Ответ: ");
                hint2 = scanner.nextInt();
                if (hint2 == 2) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            } else if (hint == 3) {
                System.out.println("Друг подсказывает: 2. Токио");
                System.out.println();
                System.out.print("Ответ: ");
                hint3 = scanner.nextInt();
                if (hint3 == 2) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            }

        } else {
            System.out.println("НЕПРАВИЛЬНО");
            isgaming = false;
        }
    }
    if (isgaming) {
        System.out.println("🔹 ВОПРОС 5 🔹 ");
        System.out.println();
        System.out.println("""
                Какой элемент периодической таблицы обозначается буквой "O"?
                
                1. Кислород
                2. Озон
                3. Олово
                4. Осмий
                
                5. Выбрать подсказку:
                """);
        System.out.print("Ответ: ");
        int answer5 = scanner.nextInt();
        if (answer5 == 1) {
            balance += 1000;
            System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
            System.out.println();
            System.out.println("💰 " + "Ваш баланс: " + balance + "$");
        } else if (answer5 == 5) {
            System.out.println("1. 50/50");
            System.out.println("2. Помощь зала");
            System.out.println("3. Звонок другу");
            System.out.println();
            System.out.print("Выбор подсказки: ");
            hint = scanner.nextInt();

            if (hint == 1) {
                System.out.println("1. Кислород");
                System.out.println("2. Озон");
                System.out.print("Ответ: ");
                hint1 = scanner.nextInt();
                if (hint1 == 1) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            } else if (hint == 2) {
                System.out.println();
                System.out.println("Зал подсказывает: 1. Кислород");
                System.out.println();
                System.out.print("Ответ: ");
                hint2 = scanner.nextInt();
                if (hint2 == 1) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            } else if (hint == 3) {
                System.out.println("Друг подсказывает: 1. Кислород");
                System.out.println();
                System.out.print("Ответ: ");
                hint3 = scanner.nextInt();
                if (hint3 == 1) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            }
        } else {
            System.out.println("НЕПРАВИЛЬНО");
            isgaming = false;
        }
    }
    if (isgaming) {
        System.out.println("🔹 ВОПРОС 6 🔹 ");
        System.out.println();
        System.out.println("""
                какой химический элемент в периодической таблице обозначается символом “Au”?
                
                1. Алюминий
                2. Золото
                3. Серебро
                4. Медь
                
                5. Выбрать подсказку:
                """);
        System.out.print("Ответ: ");
        int answer6 = scanner.nextInt();
        if (answer6 == 2) {
            balance += 1000;
            System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
            System.out.println();
            System.out.println("💰 " + "Ваш баланс: " + balance + "$");
        } else if (answer6 == 5) {
            System.out.println("1. 50/50");
            System.out.println("2. Помощь зала");
            System.out.println("3. Звонок другу");
            System.out.println();
            System.out.print("Выбор подсказки: ");
            hint = scanner.nextInt();

            if (hint == 1) {
                System.out.println("1. Алюминий");
                System.out.println("2. Золото");
                System.out.print("Ответ: ");
                hint1 = scanner.nextInt();
                if (hint1 == 2) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            } else if (hint == 2) {
                System.out.println();
                System.out.println("Зал подсказывает: 2. Золото");
                System.out.println();
                System.out.print("Ответ: ");
                hint2 = scanner.nextInt();
                if (hint2 == 2) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            } else if (hint == 3) {
                System.out.println("Друг подсказывает: 2. Золото");
                System.out.println();
                System.out.print("Ответ: ");
                hint3 = scanner.nextInt();
                if (hint3 == 2) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            }
        } else {
            System.out.println("НЕПРАВИЛЬНО");
            isgaming = false;
        }
    }
    if (isgaming) {
        System.out.println("🔹 ВОПРОС 7 🔹 ");
        System.out.println();
        System.out.println("""
                 Кто автор романа "Война и мир"?
                
                1. Фёдор Достоевский
                2. Лев Толстой
                3. Михаил Лермонтов
                4. Антон Чехов
                
                5. Выбрать подсказку:
                """);
        System.out.print("Ответ: ");
        int answer7 = scanner.nextInt();
        if (answer7 == 2) {
            balance += 1000;
            System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
            System.out.println();
            System.out.println("💰 " + "Ваш баланс: " + balance + "$");
        } else if (answer7 == 5) {
            System.out.println("1. 50/50");
            System.out.println("2. Помощь зала");
            System.out.println("3. Звонок другу");
            System.out.println();
            System.out.print("Выбор подсказки: ");
            hint = scanner.nextInt();

            if (hint == 1) {
                System.out.println("1. Фёдор Достоевский");
                System.out.println("2. Лев Толстой");
                System.out.print("Ответ: ");
                hint1 = scanner.nextInt();
                if (hint1 == 2) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            } else if (hint == 2) {
                System.out.println();
                System.out.println("Зал подсказывает: 2. Лев Толстой");
                System.out.println();
                System.out.print("Ответ: ");
                hint2 = scanner.nextInt();
                if (hint2 == 2) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            } else if (hint == 3) {
                System.out.println("Друг подсказывает: 2. Лев Толстой");
                System.out.println();
                System.out.print("Ответ: ");
                hint3 = scanner.nextInt();
                if (hint3 == 2) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            }
        } else {
            System.out.println("НЕПРАВИЛЬНО");
            isgaming = false;
        }
    }
    if (isgaming) {
        System.out.println("🔹 ВОПРОС 8 🔹 ");
        System.out.println();
        System.out.println("""
                Какое самое высокое здание в мире?
                
                1. Бурдж-Халифа
                2. Останкинская башня
                3. Эйфелева башня
                4. Шанхайская башня
                
                5. Выбрать подсказку:
                """);
        System.out.print("Ответ: ");
        int answer8 = scanner.nextInt();
        if (answer8 == 1) {
            balance += 1000;
            System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
            System.out.println();
            System.out.println("💰 " + "Ваш баланс: " + balance + "$");
        } else if (answer8 == 5) {
            System.out.println("1. 50/50");
            System.out.println("2. Помощь зала");
            System.out.println("3. Звонок другу");
            System.out.println();
            System.out.print("Выбор подсказки: ");
            hint = scanner.nextInt();

            if (hint == 1) {
                System.out.println("1. Бурдж-Халифа");
                System.out.println("2. Останкинская башня");
                System.out.print("Ответ: ");
                hint1 = scanner.nextInt();
                if (hint1 == 1) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            } else if (hint == 2) {
                System.out.println();
                System.out.println("Зал подсказывает: 1. Бурдж-Халифа");
                System.out.println();
                System.out.print("Ответ: ");
                hint2 = scanner.nextInt();
                if (hint2 == 1) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            } else if (hint == 3) {
                System.out.println("Друг подсказывает: 1. Бурдж-Халифа");
                System.out.println();
                System.out.print("Ответ: ");
                hint3 = scanner.nextInt();
                if (hint3 == 1) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            }

        } else {
            System.out.println("НЕПРАВИЛЬНО");
            isgaming = false;
        }
    }
    if (isgaming) {
        System.out.println("🔹 ВОПРОС 9 🔹 ");
        System.out.println();
        System.out.println("""
                Какая река является самой длинной в мире?
                
                1. Нил
                2. Амазонка
                3. Янцзы
                4. Миссисипи
                
                5. Выбрать подсказку:
                """);
        System.out.print("Ответ: ");
        int answer9 = scanner.nextInt();
        if (answer9 == 2) {
            balance += 1000;
            System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
            System.out.println();
            System.out.println("💰 " + "Ваш баланс: " + balance + "$");
        } else if (answer9 == 5) {
            System.out.println("1. 50/50");
            System.out.println("2. Помощь зала");
            System.out.println("3. Звонок другу");
            System.out.println();
            System.out.print("Выбор подсказки: ");
            hint = scanner.nextInt();

            if (hint == 1) {
                System.out.println("1. Нил");
                System.out.println("2. Амазонка");
                System.out.print("Ответ: ");
                hint1 = scanner.nextInt();
                if (hint1 == 2) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            } else if (hint == 2) {
                System.out.println();
                System.out.println("Зал подсказывает: 2. Амазонка");
                System.out.println();
                System.out.print("Ответ: ");
                hint2 = scanner.nextInt();
                if (hint2 == 2) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            } else if (hint == 3) {
                System.out.println("Друг подсказывает: 2. Амазонка");
                System.out.println();
                System.out.print("Ответ: ");
                hint3 = scanner.nextInt();
                if (hint3 == 2) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            }
        } else {
            System.out.println("НЕПРАВИЛЬНО");
            isgaming = false;
        }
    }
    if (isgaming) {
        System.out.println("🔹 ВОПРОС 10 🔹 ");
        System.out.println();
        System.out.println("""
                Кто написал оперу "Кармен"?
                
                1. Джузеппе Верди
                2. Жорж Бизе
                3. Вольфганг Амадей Моцарт
                4. Рихард Вагнер
                
                5. Выбрать подсказку:
                """);
        System.out.print("Ответ: ");
        int answer10 = scanner.nextInt();
        if (answer10 == 2) {
            balance += 1000;
            System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
            System.out.println();
            System.out.println("💰 " + "Ваш баланс: " + balance + "$");
            System.out.println();
            System.out.println("""
                    ========================
                    ПОЗДРАВЛЯЮ! ВЫ ПОБЕДИЛИ!
                    ========================
                    """);
        } else if (answer10 == 5) {
            System.out.println("1. 50/50");
            System.out.println("2. Помощь зала");
            System.out.println("3. Звонок другу");
            System.out.println();
            System.out.print("Выбор подсказки: ");
            hint = scanner.nextInt();

            if (hint == 1) {
                System.out.println("1. Джузеппе Верди");
                System.out.println("2. Жорж Бизе");
                System.out.print("Ответ: ");
                hint1 = scanner.nextInt();
                if (hint1 == 2) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                    System.out.println("""
                            ========================
                            ПОЗДРАВЛЯЮ! ВЫ ПОБЕДИЛИ!
                            ========================
                            """);
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            } else if (hint == 2) {
                System.out.println();
                System.out.println("Зал подсказывает: 2. Жорж Бизе");
                System.out.println();
                System.out.print("Ответ: ");
                hint2 = scanner.nextInt();
                if (hint2 == 2) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                    System.out.println("""
                            ========================
                            ПОЗДРАВЛЯЮ! ВЫ ПОБЕДИЛИ!
                            ========================
                            """);
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            } else if (hint == 3) {
                System.out.println("Друг подсказывает: 2. Жорж Бизе");
                System.out.println();
                System.out.print("Ответ: ");
                hint3 = scanner.nextInt();
                if (hint3 == 2) {
                    balance += 1000;
                    System.out.println("ПОЗДРАВЛЯЮ! Вы ответили правильно +1000$ ");
                    System.out.println();
                    System.out.println("💰 " + "Ваш баланс: " + balance + "$");
                    System.out.println("""
                            ========================
                            ПОЗДРАВЛЯЮ! ВЫ ПОБЕДИЛИ!
                            ========================
                            """);
                } else {
                    System.out.println("НЕПРАВИЛЬНО");
                    isgaming = false;
                }
            }
        } else {
            System.out.println("НЕПРАВИЛЬНО");
            isgaming = false;
        }
    }
    if (!isgaming) {
        System.out.println("ВЫ ПРОИГРАЛИ");
    }
}








