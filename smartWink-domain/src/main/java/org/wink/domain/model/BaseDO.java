package org.wink.domain.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
@Entity
public class BaseDO {
	@Id
	@Column(name="ID")
	private UUID id;
	
}
