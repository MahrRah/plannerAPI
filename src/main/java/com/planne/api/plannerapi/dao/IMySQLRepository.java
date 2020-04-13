package com.planne.api.plannerapi.dao;

import com.planne.api.plannerapi.entity.Task;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("mySqlData")
public interface IMySQLRepository extends JpaRepository<Task, Integer>{


}
