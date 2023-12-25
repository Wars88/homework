/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javawork;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author LG
 */
public class Ctl_Member {
    
public boolean Inner_verify(String id, String password){
    
    return true;}

    
    
    public boolean login_verify(String id, String password){
        boolean result = false;
        
        // 일 수행하기 
        
        result = true;
        
        return result;
    }
    

    // 일정 입력 검증 메소드
public boolean input_verify(String title, String date, String startTime, String endTime, String details) {
    boolean result = true; // 기본적으로 결과는 true로 설정

    // 제목 검증
    if (title == null || title.trim().isEmpty()) {
        System.out.println("제목이 비어있습니다.");
        result = false; // 검증 실패
    }

    // 날짜 형식 검증
    else if (!date.matches("\\d{4}-\\d{2}-\\d{2}")) {
        System.out.println("날짜 형식이 올바르지 않습니다.");
        result = false; // 검증 실패
    }

    // 시간 검증
    else {
        try {
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime start = LocalTime.parse(startTime, timeFormatter);
            LocalTime end = LocalTime.parse(endTime, timeFormatter);
            
            if (start.isAfter(end)) {
                System.out.println("시작 시간이 종료 시간보다 늦습니다.");
                result = false; // 검증 실패
            }
        } catch (DateTimeParseException e) {
            System.out.println("시간 형식이 올바르지 않습니다.");
            result = false; // 검증 실패
        }
    }

    // 상세 설명 길이 검증
    if (result && details.length() > 500) {
        System.out.println("상세 설명이 너무 깁니다.");
        result = false; // 검증 실패
    }
    
    if (result = true){
    System.out.println("데이터 저장 성공: " + title + ", " + date + ", " + startTime + ", " + endTime + ", " + details);
    }
    else{
    System.out.println("데이터 저장 실패: 입력 데이터가 유효하지 않습니다.");   
    }
    

    return result; // 최종 결과 반환

    }
}

    

    
 