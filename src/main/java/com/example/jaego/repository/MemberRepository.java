package com.example.jaego.repository;

import com.example.jaego.entity.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberRepository {

    Member findUserName(String username);
}
