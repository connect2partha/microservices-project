package com.practice.microservices.user.VO;

import com.practice.microservices.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
public class ResponseTemplateVO {

    private User user;
    private Department department;
}
