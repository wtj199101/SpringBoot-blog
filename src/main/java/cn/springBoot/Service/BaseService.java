package cn.springBoot.Service;

import java.util.List;

public abstract class BaseService<T> {
    protected abstract int insertModel(T model);

    protected abstract int updateModel(T model);

    protected abstract T selectModel(T model);

    protected abstract List<T> selectModelList(T model);

    protected abstract int deleteModel(T model);

}
