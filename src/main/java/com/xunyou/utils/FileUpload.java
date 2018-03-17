package com.xunyou.utils;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.swing.text.html.HTMLDocument;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class FileUpload {
    public static List springUpload(HttpServletRequest request) throws IllegalStateException, IOException {
        String path = null;

        List<String> list = new ArrayList<String>();
        long startTime = System.currentTimeMillis();
        //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
                request.getSession().getServletContext());
        //检查form中是否有enctype="multipart/form-data"
        if (multipartResolver.isMultipart(request)) {
            //将request变成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            //获取multiRequest 中所有的文件名
            Iterator iter = multiRequest.getFileNames();

            while (iter.hasNext()) {
                //一次遍历所有文件
                MultipartFile file = multiRequest.getFile(iter.next().toString());
                if (file != null) {
                    String fileName = file.getOriginalFilename();
                    String realpath = "G:/image/";
                    String extentionName = fileName.substring(fileName.lastIndexOf("."));
                    path = realpath + MD5Util.getMD5Code(fileName + System.currentTimeMillis()) + extentionName;
                    //上传
                    file.transferTo(new File(path));
                    list.add(path);

                }

            }

        }
        long endTime = System.currentTimeMillis();
        System.out.println("方法三的运行时间：" + String.valueOf(endTime - startTime) + "ms");
        return list;
    }
}
