package com.hanbal.ard.ardictionary.domain.dictionary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.hanbal.ard.ardictionary.domain.BaseEntity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 단어 모음집
 */

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor
public class Dictionary extends BaseEntity {
  @Id
  @GeneratedValue
  @Column(name = "DICTIONARY_ID")
  private Long id;
}
