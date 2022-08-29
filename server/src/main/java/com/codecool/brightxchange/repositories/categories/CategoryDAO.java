package com.codecool.brightxchange.repositories.categories;

import com.codecool.brightxchange.model.categories.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface CategoryDAO extends JpaRepository<Category,Long> {


    @Modifying
    @Query("update Category c set c.name=:name where c.id= :id")
    void update(@PathVariable("id") long id,@Param("name") String name);
}
