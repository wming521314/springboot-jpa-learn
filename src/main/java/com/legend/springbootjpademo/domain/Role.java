package com.legend.springbootjpademo.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "role")
public class Role  implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name = "role_name")
	private String roleName;

	@Column(name = "auth_id_list")
	private String authIdList;

	@Column(name = "record_status")
	private Integer recordStatus;

	@Column(name = "create_time")
	private java.sql.Timestamp createTime;

	@Column(name = "update_time")
	private java.sql.Timestamp updateTime;

}
