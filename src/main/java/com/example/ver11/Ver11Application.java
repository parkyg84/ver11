package com.example.ver11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

@SpringBootApplication
public class Ver11Application {

	public static void main(String[] args) {
		SpringApplication.run(Ver11Application.class, args);

	try {
		System.out.println("hello");

		String filePath = "D:/Source/ver11/Test.txt";

		File file = new File(filePath); // File객체 생성
		if (!file.exists()) { // 파일이 존재하지 않으면
			file.createNewFile(); // 신규생성
		}

		// BufferedWriter 생성
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

		// 파일에 쓰기
		writer.write("하이루!");
		writer.newLine();
		writer.write("반가워!");
		writer.newLine();

		// 버퍼 및 스트림 뒷정리
		writer.flush(); // 버퍼의 남은 데이터를 모두 쓰기
		writer.close(); // 스트림 종료
	}catch (Exception ex ) {
			ex.getMessage();
		}

	}

}
