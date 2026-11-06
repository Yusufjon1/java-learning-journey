package Projects.QuizProject;

import java.util.UUID;

public class GenericClass<S> implements BaseClass {

    protected UUID id = UUID.randomUUID();

    public UUID getId() {
        return id;
    }
}
