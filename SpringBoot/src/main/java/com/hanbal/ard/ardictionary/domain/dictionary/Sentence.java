package com.hanbal.ard.ardictionary.domain.dictionary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor
public class Sentence {

  @Id
  @GeneratedValue
  @Column(name = "SENTENCE_ID")
  private Long id;
}
