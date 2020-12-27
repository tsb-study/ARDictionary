package com.hanbal.ard.ardictionary.service;

import com.hanbal.ard.ardictionary.repository.ImageRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ImageService {
  private final ImageRepository imageRepository;
}
