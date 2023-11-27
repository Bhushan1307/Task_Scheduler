package com.bhushan.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskScheduler {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userid;
	
	@NotNull
	private String title;
	@NotNull
	private String description;
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date date;
	@NotNull
	private Boolean status;
}
