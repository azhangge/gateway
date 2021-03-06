package com.huajie.orgcenter.dao;

import com.huajie.orgcenter.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by fangxing on 17-7-10.
 */
@Repository
public interface RoleJpaRepo extends JpaRepository<RoleEntity, String> {


    @Query("select e from RoleEntity e where e.orgId=?1 and e.deleted=0")
    List<RoleEntity> findByOrgId(String orgId);

    @Query("select e from RoleEntity e where e.chiefRoleId=?1 and e.deleted=0")
    List<RoleEntity> findByChiefRoleId(String chiefRoleId);
}