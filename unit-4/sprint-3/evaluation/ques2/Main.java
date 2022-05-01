package com.Eval3.ques2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		Scanner sc = new Scanner(System.in);
		Set<String> uniqueWords = new TreeSet<>();
		System.out.println("Enter Student's Article");
		String article = "Welcome to collection in JAVA. Collection, is like a container and powerful concept in Java!";
		String[] articleWords = article.split(" ");
		int wordsCount = articleWords.length;
		for (int i = 0; i < wordsCount; i++) {
			String singleWord = articleWords[i].toLowerCase();
			uniqueWords.add(singleWord);
		}
		System.out.println();
		System.out.println("Number of words: " + wordsCount);
		System.out.println("Number of unique words: " + uniqueWords.size());
		System.out.println("The words are");
		int x = 1;
		for (String words : uniqueWords) {
			System.out.println((x++) + ". " + words);
		}
		scn.close();

	}

}
