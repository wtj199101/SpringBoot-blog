package cn.springBoot.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import cn.springBoot.model.User;
//@Repository("userDao")
//@NoRepositoryBean //use the annotation to prevent repository interfaces from being picked up as candidates to end up as repository bean instances eventually.
public interface UserDao extends PagingAndSortingRepository<User, String>, JpaSpecificationExecutor<User> {
    User findByName(String name);
    /**
     * 
  @Query(value = "SELECT * FROM USERS WHERE LASTNAME = ?1",
    countQuery = "SELECT count(*) FROM USERS WHERE LASTNAME = ?1",
    nativeQuery = true)
   @Query("select u.id, LENGTH(u.firstname) as fn_len from User u where u.lastname like ?1%")
   @Query("select u from User u where u.firstname = :firstname or u.lastname = :lastname")
   @Modifying
@Query("update User u set u.firstname = ?1 where u.lastname = ?2")
     */
    @Query("from User t where id=:id")
    List<User> queryUserList(@Param("id")String id,Pageable pageable);
}
