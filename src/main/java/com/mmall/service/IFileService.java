package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by qyh on 2019/2/12.
 */
public interface IFileService {
    public String upload(MultipartFile file, String path);
}
