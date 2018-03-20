package com.huajie.educomponent.studyplan.dao;

import com.huajie.appbase.PageResult;
import com.huajie.educomponent.studyplan.entity.StudyPlanBasicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by xuxiaolong on 17-10-31.
 */
@Repository
public interface StudyPlanBasicJpaRepo extends JpaRepository<StudyPlanBasicEntity, String> {



    PageResult<StudyPlanBasicEntity> listPages(Map<String,String> param);
}
