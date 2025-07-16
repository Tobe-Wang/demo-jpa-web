package cn.zhaofd.demojpaweb.demo.repository;

import cn.zhaofd.core.spring.jpa.repository.BaseRepository;
import cn.zhaofd.demojpaweb.demo.dto.SysInfo;
import cn.zhaofd.demojpaweb.demo.dto.SysInfoStat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface SysInfoRepository extends BaseRepository<SysInfo, Integer> {
    /**
     * 根据名称查询
     * <br />相当于JPQL：SELECT p FROM sys_info p WHERE p.name = ?1
     *
     * @param name 名称
     * @return 结果集
     */
    List<SysInfo> findByName(String name);

    /**
     * 根据名称模糊查询
     * <br />相当于JPQL：SELECT p FROM sys_info p WHERE p.name LIKE ?1
     *
     * @param name 模糊名称
     * @return 结果集
     */
    List<SysInfo> findByNameLike(String name);

    /**
     * 根据id和名称查询
     * <br />相当于JPQL：SELECT p FROM sys_info p WHERE p.id = ?1 AND p.name = ?2
     *
     * @param id   主键
     * @param name 名称
     * @return 结果集
     */
    List<SysInfo> findByIdAndName(String id, String name);

    /**
     * 参数索引方式@Query查询
     *
     * @param name 模糊名称
     * @return 结果集
     */
    @Query("select p from SysInfo p where p.name like ?1")
    List<SysInfo> findLike(String name);

    /**
     * 参数名称方式@Query查询
     *
     * @param uuid 主键
     * @return 对象
     */
    @Query("select p from SysInfo p where p.id = :id")
    SysInfo getId(@Param("id") String uuid);

    // nativeQuery=true，使用sql查询

    /**
     * 使用sql查询
     * <br />nativeQuery = true
     *
     * @param startdate 查询开始时间
     * @param enddate   查询结束时间
     * @return 结果集
     */
    @Query(value = """
            SELECT t.name as name, COUNT(1) as count FROM sys_info t
            WHERE t.rcreatetime >= :startdate AND t.rcreatetime <=:enddate
            GROUP BY t.name""", nativeQuery = true)
    List<Map<String, Object>> groupByNameNative(@Param("startdate") Date startdate, @Param("enddate") Date enddate);

    // nativeQuery=false，使用jpql查询，表名必须和实体类名一致，字段名必须与属性一致

    /**
     * 使用jpql查询
     * <br />nativeQuery = false
     *
     * @param startdate 查询开始时间
     * @param enddate   查询结束时间
     * @return 结果集
     */
    @Query(value = """
            SELECT new cn.zhaofd.demojpaweb.demo.dto.SysInfoStat(t.name, count(1)) FROM SysInfo t
            WHERE t.rcreatetime >= :startdate AND t.rcreatetime <=:enddate
            GROUP BY t.name""")
    List<SysInfoStat> groupByName(@Param("startdate") Date startdate, @Param("enddate") Date enddate);
}
