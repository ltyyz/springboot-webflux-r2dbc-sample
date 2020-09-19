package com.github.ltyyz.modules.note.model;

import com.github.ltyyz.common.model.BaseEntity;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("user")
public class UserEntity extends BaseEntity {

    private String name;
}
