package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long RoleId;
	@NotNull
	
	private String RoleName;
	@OneToOne(mappedBy = "role")
	private Registration registration;
	
}
