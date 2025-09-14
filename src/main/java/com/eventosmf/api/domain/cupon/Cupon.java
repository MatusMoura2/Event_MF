package com.eventosmf.api.domain.cupon;

import java.util.Date;
import java.util.UUID;

import javax.xml.crypto.Data;

import org.hibernate.annotations.ManyToAny;

import com.eventosmf.api.domain.event.Event;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "cupon")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cupon {

	@Id
	@GeneratedValue
	private UUID id;
	
	private String code;
	private Integer discount;
	private Date valid;
	
	@ManyToAny
	@JoinColumn(name = "enevt_id")
	private Event event;
}
