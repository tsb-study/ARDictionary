package com.hanbal.ard.ardictionary.domain.user;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.hanbal.ard.ardictionary.domain.BaseEntity;
import com.hanbal.ard.ardictionary.domain.dictionary.Image;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor
public class User extends BaseEntity {
  @Id
  @GeneratedValue
  @Column(name = "USER_ID")
  private Long id;

  private String name;
  private String email;

  @OneToMany(mappedBy = "user")
  private List<Image> images;


  // 기본으로 사용하는 언어
}
