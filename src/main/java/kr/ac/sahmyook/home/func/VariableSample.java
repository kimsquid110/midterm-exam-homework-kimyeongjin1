package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {

    public void myProfile() {
        String name = "김영진";
        int age = 26;
        String gender = "남자";
        String phoneNumber = "010-6456-8478";

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성별: " + gender);
        System.out.println("전화번호: " + phoneNumber);
    }

    public void empInformation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = scanner.next();

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        System.out.print("성별을 입력하세요: ");
        String gender = scanner.next();

        System.out.print("전화번호를 입력하세요: ");
        String phoneNumber = scanner.next();

        System.out.println("입력한 사원 정보");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성별: " + gender);
        System.out.println("전화번호: " + phoneNumber);

    }
}

