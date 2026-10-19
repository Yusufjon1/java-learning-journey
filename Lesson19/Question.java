package Lesson19;

public class Question {
    private String question;

    /**
     * 4 ta javobdan iborat massiv
     */
    private Answer[] answers = new Answer[4];

    /**
     * Question obyektini yaratish uchun konstruktor.
     *
     * @param question savol matni
     * @param answers  4 ta Answer obyektidan iborat massiv
     */
    public Question(String question, Answer[] answers) {
        this.question = question;
        this.answers = answers;
    }

    /**
     * Savol matnini qaytaradi.
     *
     * @return savol matni
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Savol matnini o'rnatadi.
     *
     * @param question yangi savol matni
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * Javoblar massivini qaytaradi.
     *
     * @return Answer massiv
     */
    public Answer[] getAnswers() {
        return answers;
    }

    /**
     * Javoblar massivini o'rnatadi.
     *
     * @param answers yangi javoblar massivi
     */
    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }
}
