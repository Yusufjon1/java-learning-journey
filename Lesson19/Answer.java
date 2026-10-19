package Lesson19;

public class Answer {
    private String answer;

    /**
     * Ushbu javob to'g'ri yoki noto'g'riligini bildiruvchi bayroq
     */
    private boolean isCorrect;

    /**
     * Answer obyektini yaratish uchun konstruktor.
     *
     * @param answer    javob matni
     * @param isCorrect to'g'ri bo'lsa true, aks holda false
     */
    public Answer(String answer, boolean isCorrect) {
        this.answer = answer;
        this.isCorrect = isCorrect;
    }

    /**
     * Javob matnini qaytaradi.
     *
     * @return javob matni
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Javob matnini o'rnatadi.
     *
     * @param answer янги javob matni
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * Javob to'g'riligini tekshiradi.
     *
     * @return to'g'ri bo'lsa true
     */
    public boolean isCorrect() {
        return isCorrect;
    }

    /**
     * Javob to'g'riligini o'rnatadi.
     *
     * @param correct to'g'ri holati
     */
    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
