package com.legend.springbootjpademo.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "auth")
public class Auth  implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String description;

	@Column(name = "record_status")
	private Integer recordStatus;

	@Column(name = "create_time")
	private java.sql.Timestamp createTime;

	@Column(name = "update_time")
	private java.sql.Timestamp updateTime;

}
