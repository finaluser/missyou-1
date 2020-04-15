/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://7yue.pro
 * @免费专栏 $ http://course.7yue.pro
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2020-03-10 19:03
 */
package com.missyou.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Where(clause = "delete_time is null")
public class GridCategory extends BaseEntity{
    @Id
    private Long id;
    private String title;
    private String img;
    private String name;
    private Long categoryId;
    private Long rootCategoryId;
}
