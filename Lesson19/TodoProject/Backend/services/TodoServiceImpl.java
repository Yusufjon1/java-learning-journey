package Lesson19.TodoProject.Backend.services;

import Lesson19.TodoProject.Backend.DTO.TodoUpdateDTO;
import Lesson19.TodoProject.Backend.enumsAndDomain.Category;
import Lesson19.TodoProject.Backend.enumsAndDomain.Todo;
import Lesson19.TodoProject.Backend.utils.Utils;

import java.util.Arrays;

/**
 * ushbu class Todo objecti ustida amal bajarish uchun kerak boladi.
 */

public class TodoServiceImpl implements TodoService {

    /**
     * bu birinchi null qiymatni ozida saqlovchi ozgaruvchi
     */

    public int index = 0;

    /**
     * todo yaratuvchi method
     * @param todo ushbu parameter yangi todo objecti yaratishga kerak boladi
     * @return yangi yaratilgan todo objectini qaytaradi
     */


    @Override
    public Todo create(Todo todo) {
        todo.setId(Utils.generateUniqueId());
        todos[index++] = todo;
        return todo;
    }

    @Override
    public boolean delete(String todoId) {
        int deletingTodoIndex = getTodoIndexByTodoId(todoId);
        if (deletingTodoIndex != -1) {
            for (int i = deletingTodoIndex; i < index; i++) {
                todos[i] = todos[i + 1];
            }
            index--;
            return true;
        }
       return false;
    }


    @Override
    public boolean update(TodoUpdateDTO dto) {
        String todoId = dto.id();
        int todoIndex = getTodoIndexByTodoId(todoId);
        if (todoIndex != -1) {
            Todo todo = todos[todoIndex];
            todo.setTitle(dto.title());
            todos[todoIndex] = todo;
            return true;
        }
        return false;
    }

    @Override
    public Todo get(String todoId) {
        int todoIndex = getTodoIndexByTodoId(todoId);
        if (todoIndex != -1) {
            return todos[todoIndex];
        }
        return null;
    }

    @Override
    public Todo[] getAll() {

        return Arrays.copyOf(todos, index);

    }

    @Override
    public boolean toggleCompleted(String todoId) {
        return false;
    }

    @Override
    public Todo[] getByCategory(Category category) {
        Todo[] result = new Todo[index];
        int resultCount = 0;
        for (int i = 0; i < index; i++) {
            if (todos[i].getCategory() == category) {
                result[resultCount] = todos[i];
                resultCount++;
            }
        }
        return Arrays.copyOf(result, resultCount);
    }

    private int getTodoIndexByTodoId(String todoId) {

        for (int i = 0; i < index; i++) {
            Todo todo = todos[i];
            if (todos[i].getId().equals(todoId)) {
                return i;
            }
        }
        return -1;
    }


}
