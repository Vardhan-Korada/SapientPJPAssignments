package com.sapient.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class GetDirectoryLists {

	public static void main(String[] args) throws IOException {
		System.out.println("All the directories and files...");
		Files.list(Paths.get(".")).forEach(System.out::println);
		System.out.println("===================");
		System.out.println("All the directories, sub directories and  all files in them ...");
		Files.walk(Paths.get(".")).forEach(System.out::println);
	}

}
