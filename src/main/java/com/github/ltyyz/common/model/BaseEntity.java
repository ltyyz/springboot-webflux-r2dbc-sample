package com.github.ltyyz.common.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.ltyyz.util.Snowflake;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

/**
 * 基础对象，包含七大金刚字段
 */
@Data
public class BaseEntity implements IEntity {

    @Id
    private Long id = Snowflake.next();

    private Long orgId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime deleteTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    private Long createBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    private Long updateBy;
}
