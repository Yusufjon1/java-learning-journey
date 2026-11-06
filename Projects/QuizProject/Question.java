package Projects.QuizProject;

public class Question implements Quiz {
    private String questionText;

    private Answer[] answers = new Answer[4];

    private int answerCount;

    public Question(String questionText) {
        this.questionText = questionText;
    }

    public boolean add(Answer answer) {
        if (answerCount == answers.length) {
            return false;
        }

        answers[answerCount] = answer;
        answerCount++;
        return true;
    }

    public boolean add(int index, Answer answer) {
        if (index < 0 || index > answerCount || answerCount == answers.length) {
            return false;
        }

        for (int i = answerCount; i > index; i--) {
            answers[i] = answers[i - 1];
        }

        answers[index] = answer;
        answerCount++;
        return true;
    }

    public boolean delete(int index) {
        if (index < 0 || index >= answerCount) {
            return false;
        }

        for (int i = index; i < answerCount - 1; i++) {
            answers[i] = answers[i + 1];
        }

        answers[answerCount - 1] = null;
        answerCount--;

        return true;
    }

    @Override
    public void show() {
        System.out.println(questionText);

        for (int i = 0; i < answerCount; i++) {
            System.out.println(i + 1 + ". " + answers[i].text());
        }
    }

    public Answer getAnswer(int index) {
        return answers[index];
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    public boolean delete(Answer answer) {
        for (int i = 0; i < answerCount; i++) {
            if (answers[i].equals(answer)) {
                return delete(i);
            }
        }

        return false;
    }
}
