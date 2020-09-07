package com.idea_xmwh.idea_code.app.dto.comm;

/**
 * Created by mengjw on 2020/9/5
 */
public class Auth2DTO<T> extends AuthDTO {
    private T dto;

    public T getDto() {
        return dto;
    }

    public Auth2DTO<T> setDto(T dto) {
        this.dto = dto;
        return this;
    }

    public void setAuthDTO(AuthDTO authDTO){
        this.setName(authDTO.getName());
        this.setPassword(authDTO.getPassword());
        this.setUsername(authDTO.getUsername());
        this.setRemark(authDTO.getRemark());
        this.setIp(authDTO.getIp());
    }
}
