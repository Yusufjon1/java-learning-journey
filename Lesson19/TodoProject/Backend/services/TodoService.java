package Lesson19.TodoProject.Backend.services;

import Lesson19.TodoProject.Backend.enumsAndDomain.Category;
import Lesson19.TodoProject.Backend.enumsAndDomain.Todo;
import Lesson19.TodoProject.Backend.DTO.TodoUpdateDTO;

public interface TodoService {

    Todo[] todos = new Todo[100];

    Todo create(Todo todo);

    boolean delete(String todoId);

    boolean update(TodoUpdateDTO dto);

    Todo get(String todoId);

    Todo[] getAll();

    boolean toggleCompleted (String todoId);

    Todo[] getByCategory(Category category);

}
