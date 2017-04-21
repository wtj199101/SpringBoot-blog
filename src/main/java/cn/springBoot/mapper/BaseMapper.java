package cn.springBoot.mapper;

import java.io.Serializable;
import java.util.List;
public interface BaseMapper<T, PK extends Serializable> {
    int insertEntity(T entity);

    int updatEntity(T entity);

    T findEntity(T entity);

    int deleteEntity(PK primaryKey);

    T queryOne(PK primarykey);

    List<T> queryAll();

    List<T> queryAllByEntity(T entity);
}
