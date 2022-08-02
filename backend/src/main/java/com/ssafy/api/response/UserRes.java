package com.ssafy.api.response;

import com.ssafy.common.model.response.BaseResponseBody;
import com.ssafy.db.entity.User;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 회원 본인 정보 조회 API ([GET] /api/v1/users/me) 요청에 대한 응답값 정의.
 */
@Getter
@Setter
@ApiModel("UserResponse")
public class UserRes extends BaseResponseBody {

    @ApiModelProperty(name = "User ID")
    String userId;

    @ApiModelProperty(name = "User Name")
    String userName;

    @ApiModelProperty(name = "User Email")
    String userEmail;

    @ApiModelProperty(name = "User Img")
    String userImg;

    public static UserRes of(User user, Integer statusCode, String message) {
        UserRes res = new UserRes();
        res.setUserId(user.getUserId());
        res.setUserName(user.getUserName());
        res.setUserEmail(user.getUserEmail());
        res.setUserImg(user.getUserImg());
        res.setStatusCode(statusCode);
        res.setMessage(message);
        return res;
    }

}

