package com.example.demo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.sf.mpxj.MPXJException;
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.mpp.MPPReader;
import net.sf.mpxj.reader.ProjectReader;

public class MPPToJsonConverter {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\巨\\Desktop\\123.mpp";
        String outputFilePath = "C:\\Users\\巨\\Desktop\\123.json";

        try {
            // 读取MPP文件
            ProjectReader reader = new MPPReader();
            ProjectFile projectFile = reader.read(inputFilePath);

            // 将ProjectFile对象转换为您需要的Java对象

            // 将Java对象转换为JSON
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File(outputFilePath), projectFile);

            System.out.println("转换完成。JSON文件已保存为：" + outputFilePath);
        } catch (MPXJException | IOException e) {
            e.printStackTrace();
        }
    }
}
