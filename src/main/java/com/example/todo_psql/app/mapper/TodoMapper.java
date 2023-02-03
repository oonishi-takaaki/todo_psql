package com.example.todo_psql.app.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.todo_psql.app.entity.Todo;

@Mapper
public interface TodoMapper {
    public List<Todo> selectAll();

    public void add(Todo todo);
}
