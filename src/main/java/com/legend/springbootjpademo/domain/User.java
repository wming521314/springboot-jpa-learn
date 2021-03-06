package com.legend.springbootjpademo.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "user")
public class User  implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name = "role_id")
	private Long roleId;

	private String name;

	private Integer sex;

	private Integer age;

	private String comment;

	private String password;

	@Column(name = "record_status")
	private Integer recordStatus;

	@Column(name = "create_time")
	private java.sql.Timestamp createTime;

	@Column(name = "update_time")
	private java.sql.Timestamp updateTime;

}
