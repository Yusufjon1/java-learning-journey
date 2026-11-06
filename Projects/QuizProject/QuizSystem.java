package Projects.QuizProject;

import java.util.Scanner;


public class QuizSystem {

    private final String[][] userList = new String[10][3];
    private final Question[] questions = new Question[10];
    private final String[][] userResult = new String[10][3];

    private final Scanner scanner = new Scanner(System.in);

    private int questionCount;

    public QuizSystem() {
        addUser("teacher", "teacher123", Role.TEACHER);
        addUser("ali", "123", Role.STUDENT);
        addUser("vali", "123", Role.STUDENT);
        addUser("aziz", "123", Role.STUDENT);
        addUser("malika", "123", Role.STUDENT);

        addDemoQuestions();

    }

    public void run() {
        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Registration");
            System.out.println("0. exit");

            System.out.print("select: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> login();
                case "2" -> register();
                case "0" -> {
                    System.out.println("Goodbye");
                    return;
                }
                default -> System.out.println("wrong choice");
            }
        }
    }

    private void register() {
        System.out.print("Username: ");
        String username = scanner.nextLine();

        if (usernameExists(username)) {
            System.out.println("user already exists");
            return;
        }

        System.out.print("password: ");
        String password = scanner.nextLine();

        if (addUser(username, password, Role.STUDENT)) {
            System.out.println("registration successful. your role is Student");
        } else {
            System.out.println("user list is full");
        }
    }

    public void login() {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        User user = findUser(username, password);

        if (user == null) {
            System.out.println("user not found");
            return;
        }

        System.out.println("Welcome " + user.getUsername());

        if (user.getRole() == Role.TEACHER) {
            teacherMenu();
        } else {
            studentMenu(user);
        }
    }

    private void studentMenu(User user) {
        while (true) {
            System.out.println("1. Start");
            System.out.println("2. Exit");

            System.out.print("choose: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> startQuiz(user);
                case "2" -> {
                    System.out.println("you exit from system");
                    return;
                }
                default -> System.out.println("wrong choice");
            }
        }
    }

    private void startQuiz(User user) {
        if (questionCount == 0) {
            System.out.println("quiz questions not found");
            return;
        }
        clearResults();
        int correctCount = 0;

        for (int i = 0; i < questionCount; i++) {
            Question question = questions[i];

            System.out.println();
            question.show();

            int selectedAnswer = readNumber(
                    "select answer (1-" + question.getAnswerCount() + "): ",
                    1,
                    question.getAnswerCount()
            );

            boolean correct = question.getAnswer(selectedAnswer - 1).correct();

            userResult[i][0] = question.getQuestionText();
            userResult[i][1] = String.valueOf(selectedAnswer);
            userResult[i][2] = String.valueOf(correct);

            if (correct) {
                correctCount++;
            }
        }

        System.out.println("\n" + user.getUsername() + " result: "
                + correctCount + "/" + questionCount);

        printResults();
    }

    private void teacherMenu() {
        while (true) {
            System.out.println("\n1. Create Quiz");
            System.out.println("2. Delete Quiz");
            System.out.println("3. Update Quiz");
            System.out.println("4. List Quiz");
            System.out.println("5. Exit");

            System.out.println("choose: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> createQuestion();
                case "2" -> deleteQuestion();
                case "3" -> updateQuestion();
                case "4" -> listQuestions();
                case "5" -> {
                    System.out.println("you left from the system ");
                    return;
                }
                default -> System.out.println("wrong choice");
            }
        }
    }

    private void createQuestion() {
        if (questionCount == questions.length) {
            System.out.println("question is full");
            return;
        }

        Question question = readQuestionFromConsole();
        questions[questionCount] = question;
        questionCount++;

        System.out.println("question created successfully");
    }

    private void deleteQuestion() {
        if (questionCount == 0) {
            System.out.println("question list is empty");
            return;
        }

        listQuestions();
        int number = readNumber("Question number to delete: ", 1, questionCount);
        int index = number - 1;

        for (int i = index; i < questionCount - 1; i++) {
            questions[i] = questions[i + 1];
        }

        questions[questionCount - 1] = null;
        questionCount--;

        System.out.println("Question deleted...");
    }

    private void updateQuestion() {
        if (questionCount == 0) {
            System.out.println("question list is empty");
            return;
        }

        listQuestions();
        int number = readNumber("Question number to update: ", 1, questionCount);

        System.out.print("Enter new question :");
        questions[number - 1] = readQuestionFromConsole();

        System.out.println("question updated successfully");
    }

    private void listQuestions() {
        if (questionCount == 0) {
            System.out.println("list is empty");
            return;
        }

        int number = 1;

        for (Question question : questions) {
            if (question != null) {
                System.out.println("\nQuestion " + number);
                question.show();
                number++;
            }
        }
    }

    private Question readQuestionFromConsole() {
        System.out.print("Question text: ");
        String questionText = scanner.nextLine();
        Question question = new Question(questionText);

        int answerCount = readNumber("Answer count (2-4): ", 2, 4);
        int correctAnswer = readNumber(
                "Correct answer number (1-" + answerCount + "): ",
                1,
                answerCount
        );

        for (int i = 1; i <= answerCount; i++) {
            String answerText = readLine("Answer " + i + ": ");
            boolean isCorrect = i == correctAnswer;

            question.add(new Answer(answerText, isCorrect));
        }
        return question;
    }

    private String readLine(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    private boolean addUser(String username, String password, Role role) {
        for (int i = 0; i < userList.length; i++) {
            if (userList[i][0] == null) {
                User user = new User(username, password, role);

                userList[i][0] = user.getUsername();
                userList[i][1] = user.getPassword();
                userList[i][2] = user.getRole().name();

                return true;
            }
        }
        return false;
    }

    private boolean usernameExists(String username) {
        for (String[] user : userList) {
            if (user[0] != null && user[0].equals(username)) {
                return true;
            }
        }
        return false;
    }

    private User findUser(String username, String password) {
        for (String[] user : userList) {
            boolean sameUserName = user[0] != null && user[0].equals(username);
            boolean samePassword = user[1] != null && user[1].equals(password);

            if (sameUserName && samePassword) {
                Role role = Role.valueOf(user[2]);
                return new User(user[0], user[1], role);
            }
        }
        return null;
    }

    private void clearResults() {
        for (int i = 0; i < userResult.length; i++) {
            for (int j = 0; j < userResult[i].length; j++) {
                userResult[i][j] = null;
            }

        }
    }

    private void printResults() {
        System.out.println("\n--- Quiz results ---");

        for (String[] result : userResult) {
            if (result[0] != null) {
                System.out.println(result[0] + " -> " + result[1] + " => " + result[2]);
            }
        }
    }

    private void addDemoQuestions() {
        Question firstQuestion = new Question("2 + 2 = ?");
        firstQuestion.add(new Answer("3", false));
        firstQuestion.add(new Answer("5", false));
        firstQuestion.add(new Answer("4", true));
        firstQuestion.add(new Answer("9", false));

        Question secondQuestion = new Question("what kind of language is Java ?");
        secondQuestion.add(new Answer("Programming language", true));
        secondQuestion.add(new Answer("Database", false));
        secondQuestion.add(new Answer("Browser", false));
        secondQuestion.add(new Answer("Operating system", false));

        questions[0] = firstQuestion;
        questions[1] = secondQuestion;
        questionCount = 2;
    }

    private int readNumber(String message, int min, int max) {
        while (true) {
            try {
                int number = Integer.parseInt(readLine(message));

                if (number >= min && number <= max) {
                    return number;
                }

                System.out.println("Enter a number from " + min + " to " + max);
            }catch (NumberFormatException exception) {
                System.out.println("Please enter a valid number");
            }
        }
    }
}
