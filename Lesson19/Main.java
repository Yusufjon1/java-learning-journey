package Lesson19;
import java.util.Scanner;

public class Main {



    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Userlar uchun matrix (10 ta qator, 3 ustun: [username][password][role])
        String[][] userList = new String[10][3];
        int userCount = 5;

        // Dastlabki 5 ta foydalanuvchini qo'shish
        userList[0] = new String[]{"admin", "1234", Role.TEACHER.name()};
        userList[1] = new String[]{"teacher2", "2222", Role.TEACHER.name()};
        userList[2] = new String[]{"student1", "1111", Role.STUDENT.name()};
        userList[3] = new String[]{"student2", "3333", Role.STUDENT.name()};
        userList[4] = new String[]{"student3", "4444", Role.STUDENT.name()};

        // 2. Savollar massivi
        Question[] questions = new Question[10];
        int questionCount = 1;

        // Boshlang'ich bitta test savoli
        questions[0] = new Question("2+2 = ?", new Answer[]{
                new Answer("3", false),
                new Answer("5", false),
                new Answer("4", true),
                new Answer("9", false)
        });

        System.out.println("=== QUIZ SISTEMASIGA XUSH KELIBSIZ ===");

        while (true) {
            System.out.println("\nTanlang:");
            System.out.println("1. Kirish (Login)");
            System.out.println("2. Ro'yxatdan o'tish (Register)");
            System.out.println("0. Chiqish");
            System.out.print(">>> ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // buffer tozalash

            if (choice == 0) {
                System.out.println("Dastur to'xtatildi.");
                break;
            } else if (choice == 2) {
                // Ro'yxatdan o'tish
                System.out.print("Username kiriting: ");
                String regUser = scanner.nextLine();
                System.out.print("Password kiriting: ");
                String regPass = scanner.nextLine();

                // Mavjudligini tekshirish
                boolean exists = false;
                for (int i = 0; i < userCount; i++) {
                    if (userList[i][0] != null && userList[i][0].equals(regUser)) {
                        exists = true;
                        break;
                    }
                }

                if (exists) {
                    System.out.println("User already exist");
                } else {
                    if (userCount < 10) {
                        userList[userCount][0] = regUser;
                        userList[userCount][1] = regPass;
                        userList[userCount][2] = Role.STUDENT.name(); // Default STUDENT
                        userCount++;
                        System.out.println("Muvaffaqiyatli ro'yxatdan o'tdingiz! (Role: STUDENT)");
                    } else {
                        System.out.println("Joy qolmagan!");
                    }
                }

            } else if (choice == 1) {
                // Tizimga kirish
                System.out.print("Username kiriting: ");
                String loginUser = scanner.nextLine();
                System.out.print("Password kiriting: ");
                String loginPass = scanner.nextLine();

                String loggedRole = null;

                for (int i = 0; i < userCount; i++) {
                    if (userList[i][0] != null && userList[i][0].equals(loginUser)
                            && userList[i][1].equals(loginPass)) {
                        loggedRole = userList[i][2];
                        break;
                    }
                }

                if (loggedRole == null) {
                    System.out.println("User not found");
                } else {
                    System.out.println("Tizimga muvaffaqiyatli kirdingiz! Roli: " + loggedRole);

                    // --- STUDENT MENYU ---
                    if (loggedRole.equals(Role.STUDENT.name())) {
                        while (true) {
                            System.out.println("\n--- TALABA MENYUSI ---");
                            System.out.println("1. Start (Testni boshlash)");
                            System.out.println("2. Exit (Chiqish)");
                            System.out.print(">>> ");
                            int studentChoice = scanner.nextInt();

                            if (studentChoice == 2) {
                                System.out.println("Tizimdan chiqildi.");
                                break;
                            } else if (studentChoice == 1) {
                                String[][] userResult = new String[10][3];
                                int resultIndex = 0;

                                for (int i = 0; i < questionCount; i++) {
                                    if (questions[i] == null) continue;
                                    Question q = questions[i];
                                    System.out.println("\n" + (i + 1) + ". " + q.getQuestion());
                                    Answer[] ans = q.getAnswers();
                                    for (int j = 0; j < ans.length; j++) {
                                        System.out.println((j + 1) + ". " + ans[j].getAnswer());
                                    }
                                    System.out.print("Javobingizni raqamini tanlang (1-4): ");
                                    int ansChoice = scanner.nextInt();

                                    int selectedIdx = ansChoice - 1;
                                    boolean isCorrect = false;
                                    if (selectedIdx >= 0 && selectedIdx < ans.length) {
                                        isCorrect = ans[selectedIdx].isCorrect();
                                    }

                                    userResult[resultIndex][0] = q.getQuestion();
                                    userResult[resultIndex][1] = String.valueOf(ansChoice);
                                    userResult[resultIndex][2] = String.valueOf(isCorrect);
                                    resultIndex++;
                                }

                                System.out.println("\n=== SIZNING NATIJALARINGIZ ===");
                                for (int i = 0; i < resultIndex; i++) {
                                    System.out.println(userResult[i][0] + " -> " + userResult[i][1] + " => " + userResult[i][2]);
                                }
                            }
                        }
                    }
                    // --- TEACHER MENYU ---
                    else if (loggedRole.equals(Role.TEACHER.name())) {
                        while (true) {
                            System.out.println("\n--- O'QITUVCHI MENYUSI ---");
                            System.out.println("1. Create Quiz");
                            System.out.println("2. Delete Quiz");
                            System.out.println("3. Update Quiz");
                            System.out.println("4. List Quiz");
                            System.out.println("5. Exit");
                            System.out.print(">>> ");
                            int teacherChoice = scanner.nextInt();
                            scanner.nextLine(); // buffer

                            if (teacherChoice == 5) {
                                System.out.println("O'qituvchi menyusidan chiqildi.");
                                break;
                            } else if (teacherChoice == 1) {
                                // Create Quiz
                                if (questionCount >= 10) {
                                    System.out.println("Joy yetarli emas!");
                                    continue;
                                }
                                System.out.print("Savol matnini kiriting: ");
                                String qText = scanner.nextLine();

                                Answer[] newAnswers = new Answer[4];
                                for (int a = 0; a < 4; a++) {
                                    System.out.print((a + 1) + "-javob matnini kiriting: ");
                                    String aText = scanner.nextLine();
                                    System.out.print("Bu javob to'g'rimi? (true/false): ");
                                    boolean isCorr = scanner.nextBoolean();
                                    scanner.nextLine(); // buffer
                                    newAnswers[a] = new Answer(aText, isCorr);
                                }

                                questions[questionCount] = new Question(qText, newAnswers);
                                questionCount++;
                                System.out.println("Yangi savol muvaffaqiyatli qo'shildi!");

                            } else if (teacherChoice == 2) {
                                // Delete Quiz
                                System.out.println("Mavjud savollar:");
                                for (int i = 0; i < questionCount; i++) {
                                    if (questions[i] != null) {
                                        System.out.println(i + ". " + questions[i].getQuestion());
                                    }
                                }
                                System.out.print("O'chirmoqchi bo'lgan savol raqamini kiriting: ");
                                int delIdx = scanner.nextInt();
                                if (delIdx >= 0 && delIdx < questionCount) {
                                    questions[delIdx] = null;
                                    System.out.println("Savol o'chirildi.");
                                } else {
                                    System.out.println("Xato indeks!");
                                }

                            } else if (teacherChoice == 3) {
                                // Update Quiz
                                System.out.println("Mavjud savollar:");
                                for (int i = 0; i < questionCount; i++) {
                                    if (questions[i] != null) {
                                        System.out.println(i + ". " + questions[i].getQuestion());
                                    }
                                }
                                System.out.print("Yangilamoqchi bo'lgan savol raqamini kiriting: ");
                                int upIdx = scanner.nextInt();
                                scanner.nextLine(); // buffer

                                if (upIdx >= 0 && upIdx < questionCount && questions[upIdx] != null) {
                                    System.out.print("Yangi savol matnini kiriting: ");
                                    String newQText = scanner.nextLine();

                                    Answer[] updatedAnswers = new Answer[4];
                                    for (int a = 0; a < 4; a++) {
                                        System.out.print((a + 1) + "-javob matnini kiriting: ");
                                        String aText = scanner.nextLine();
                                        System.out.print("Bu javob to'g'rimi? (true/false): ");
                                        boolean isCorr = scanner.nextBoolean();
                                        scanner.nextLine(); // buffer
                                        updatedAnswers[a] = new Answer(aText, isCorr);
                                    }

                                    questions[upIdx].setQuestion(newQText);
                                    questions[upIdx].setAnswers(updatedAnswers);
                                    System.out.println("Savol yangilandi!");
                                } else {
                                    System.out.println("Bunday savol topilmadi!");
                                }

                            } else if (teacherChoice == 4) {
                                // List Quiz (forEach uslubida for loop)
                                System.out.println("\n--- BARCHA SAVOLLAR ---");
                                int index = 0;
                                for (Question q : questions) {
                                    if (q != null) {
                                        System.out.println(index + ". " + q.getQuestion());
                                        Answer[] ansList = q.getAnswers();
                                        for (int k = 0; k < ansList.length; k++) {
                                            System.out.println("   " + (k + 1) + ") " + ansList[k].getAnswer() + " [" + ansList[k].isCorrect() + "]");
                                        }
                                    }
                                    index++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
