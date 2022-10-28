package com.wallet.virtualwallet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "user_id_sequence")
  @Column(name = "ID")
  private Long id;

  @Column(name = "USERNAME")
  private String userName;

  @Column(name = "PASSWORD")
  private String password;;

}
