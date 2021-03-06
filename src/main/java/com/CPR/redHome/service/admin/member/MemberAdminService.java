package com.CPR.redHome.service.admin.member;

import com.CPR.redHome.dto.member.MemberDto;
import com.CPR.redHome.paging.Criteria;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.List;
import java.util.Map;

public interface MemberAdminService {
    // 관리자 페이지 표시할 멤버 수 정의
    int countAll(Criteria criteria);

    // 정해진 수대로 멤버 리스트 불러오기
    List<MemberDto> getMemberList(int firstRecordIndex, Criteria criteria);

    // memberId로 회원 조회
    MemberDto selectMemberById(Long memberId);

    // 수정된 member update
    void updateMember(MemberDto memberDto);

    // member delete
    void deleteMember(Long memberId);

    // member 판매자 신청
    void updateMemberRole(String accountId);

    // 판매자 권한 승인
    void permitNewSeller(Long memberId);

    // 판매자 권한 반려
    void rejectNewSeller(Long memberId);


    // @@@@@@@ 회원 통계 @@@@@@@@
    // 연령대 별 회원 수 조회
    JSONObject selectMemberByAge();

    // 지역 별 회원 수 조회
    JSONObject selectMemberByLocation();

    // 등급 별 회원 수 조회
    JSONObject selectMemberByGrade();


}
