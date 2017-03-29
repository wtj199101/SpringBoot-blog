package cn.springBoot.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cn.springBoot.model.User;
@Repository("userDao")
public interface UserDao extends PagingAndSortingRepository<User, String>, JpaSpecificationExecutor<User> {
    User findByName(String name);
    @Query("from User t where id=:id")
    List<User> queryUserList(@Param("id")String id,Pageable pageable);
}
