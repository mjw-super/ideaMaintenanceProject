package com.idea_xmwh.idea_code.app.util;


import java.io.File;
import java.util.UUID;

public class FileUtils {


    /**
     * WORD临时文件夹
     * @return
     */
    public static String getTempPath(String path) {
        String  tempPath = path + File.separator+File.separator + UUID.randomUUID() + File.separator;
        createFolder(tempPath);
        return  tempPath;
    }

    /**
     * 创建文件夹路径
     *
     * @param folderPath
     */
    public static void createFolder(String folderPath) {
        if (!new File(folderPath).exists()) {
            new File(folderPath).mkdirs();
        }
    }
}
